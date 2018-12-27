package com.aiwen.logistics.controller.pay;

import com.aiwen.logistics.pojo.User;
import com.aiwen.logistics.util.PayUtil;
import com.aiwen.logistics.util.WXPayConfig;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.request.AlipayTradeCloseRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import org.apache.commons.httpclient.util.HttpURLConnection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("/wxpay")
public class WXPayController {

    public String toOrder(){
        //跳转到支付页面
        return null;
    }
    public ModelAndView generCodeUrl(Model model, Integer order_id, HttpServletRequest request){
        Map json = new HashMap();
        User user = (User) model.asMap().get("user");
       /* ShareOrderInfo order = orderInfoMapper.selectByPrimaryKey(order_id);
        //生成一笔预付订单流水
        String trad_no = "PC_WECHAT" + OrderNoUtil.leadsNo();//订单流水号
        ShareUserTrad trad = new ShareUserTrad();
        trad.setResourceTradId(-1);
        trad.setUserId(user.getId());
        trad.setCreatedBy(user.getId());
        trad.setLastUpdBy(user.getId());
        trad.setOnlineOfflineFlag("0");//线上
        trad.setOrderNo(order.getOrderNo());
        trad.setUserTradAmount(order.getToBePaid());
        trad.setTradMethod("4");//支付宝
        trad.setPayReceiveFlag("2");//支出
        trad.setSuccessFlag("0");//交易进行中
        trad.setTradType("1");//订单支付
        trad.setTradNo(trad_no);
        trad.setModifyNum(0);
        shareUserTradMapper.insertSelective(trad);*/
        //随机字符串
        String nonce_str = PayUtil.getRandomString(32);
        String UTF8 = "UTF-8";
        Map<String,String> map = new HashMap<String,String>();
        map.put("body","订单["+"11123134341"+"]支付");
        map.put("trade_type","NATIVE");
        map.put("mch_id",WXPayConfig.wechat_mch_id);
        map.put("sign_type","MD5");
        map.put("nonce_str",nonce_str);
        map.put("fee_type","CNY");
        map.put("device_info","WEB");
        map.put("out_trade_no","");//商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|* 且在同一个商户号下唯一。详见商户订单号
        map.put("total_fee",new BigDecimal(100).toBigInteger().toString());//订单总金额，单位为分，详见支付金额
//        map.put("total_fee","1");//测试
        map.put("appid",WXPayConfig.wechat_app_id);
        map.put("notify_url",WXPayConfig.wechat_notify_url);
        map.put("spbill_create_ip",PayUtil.getIp(request));
        String sign = null;
        try {
            sign = PayUtil.getWechatSign(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String reqBody = "<xml>" +
                "<body>"+map.get("body")+"</body>" +
                "<trade_type>"+map.get("trade_type")+"</trade_type>" +
                "<mch_id>"+map.get("mch_id")+"</mch_id>" +
                "<sign_type>"+map.get("sign_type")+"</sign_type>" +
                "<nonce_str>"+map.get("nonce_str")+"</nonce_str>" +
                "<detail />"+
                "<fee_type>"+map.get("fee_type")+"</fee_type>" +
                "<device_info>"+map.get("device_info")+"</device_info>" +
                "<out_trade_no>"+map.get("out_trade_no")+"</out_trade_no>" +
                "<total_fee>"+map.get("total_fee")+"</total_fee>" +
                "<appid>"+map.get("appid")+"</appid>" +
                "<notify_url>"+map.get("notify_url")+"</notify_url>" +
                "<sign>"+sign+"</sign>" +
                "<spbill_create_ip>"+map.get("spbill_create_ip")+"</spbill_create_ip>" +
                "</xml>";
        try{
            URL httpUrl = new URL("");
            HttpURLConnection httpURLConnection = (HttpURLConnection) httpUrl.openConnection();
            httpURLConnection.setRequestProperty("Host", "api.mch.weixin.qq.com");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(10*1000);
            httpURLConnection.setReadTimeout(10*1000);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(reqBody.getBytes(UTF8));
            //获取内容
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, UTF8));
            final StringBuffer stringBuffer = new StringBuffer();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }
            String resp = stringBuffer.toString();
            if (stringBuffer!=null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream!=null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream!=null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Map<String, String> respData = PayUtil.xmlToMap(resp);
            String return_code = "";
            if (respData.containsKey("return_code")) {
                return_code = respData.get("return_code");
            }
            if("SUCCESS".equals(return_code)){
                if (respData.containsKey("sign") ) {
                    String respSign = respData.get("sign");
                    if(respData.get("sign").equals(PayUtil.getWechatSign(respData))){
                        json.put("code_url",respData.get("code_url"));
                    }
                }
            }
            System.out.println(resp);
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;//json
    }
    /**
     * @param request
     * @param response
     * @return 支付页面
     */
    public ModelAndView pay(HttpServletRequest request,HttpServletResponse response){
       try{
           //获得初始化的AlipayClient
           AlipayClient alipayClient = PayUtil.payClient();
           //设置请求参数
           AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
           alipayRequest.setReturnUrl(PayUtil.return_url);
           alipayRequest.setNotifyUrl(PayUtil.notify_url);

           //商户订单号，商户网站订单系统中唯一订单号，必填
           String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
           //付款金额，必填
           String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
           //订单名称，必填
           String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
           //商品描述，可空
           String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");

           alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                   + "\"total_amount\":\""+ total_amount +"\","
                   + "\"subject\":\""+ subject +"\","
                   + "\"body\":\""+ body +"\","
                   + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

           //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
           //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
           //		+ "\"total_amount\":\""+ total_amount +"\","
           //		+ "\"subject\":\""+ subject +"\","
           //		+ "\"body\":\""+ body +"\","
           //		+ "\"timeout_express\":\"10m\","
           //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
           //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节
           //请求
           String result = alipayClient.pageExecute(alipayRequest).getBody();
           //输出
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().write(result);//直接将完整的表单html输出到页面
           response.getWriter().flush();
       }catch (Exception e){
           e.printStackTrace();
       }
       return null;
    }

    /**
     * @param request
     * @param response
     * @return 交易关闭
     */
    public ModelAndView close_pay(HttpServletRequest request, HttpServletResponse response){
        AlipayClient alipayClient = PayUtil.payClient();
        //设置请求参数
        AlipayTradeCloseRequest alipayRequest = new AlipayTradeCloseRequest();
        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = null;
        String trade_no =null;
        try {
            //在公共参数中设置回跳和通知地址
            alipayRequest.setReturnUrl("回跳地址");
            //异步回调一定是要在外网 不然支付宝服务器无法访问
            alipayRequest.setNotifyUrl("异步回调地址");
            out_trade_no = new String(request.getParameter("WIDTCout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            //支付宝交易号
            trade_no = new String(request.getParameter("WIDTCtrade_no").getBytes("ISO-8859-1"),"UTF-8");
            //请二选一设置
            alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," +"\"trade_no\":\""+ trade_no +"\"}");
            //请求
            String result = alipayClient.execute(alipayRequest).getBody();
            //输出
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(result);//直接将完整的表单html输出到页面
            response.getWriter().flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param request
     * @return
     * 支付宝服务器主动通知商户服务器里指定的页面http/https路径。
     */
    public ModelAndView callBack_notify(HttpServletRequest request){

        try {
            Map<String,String> params = new HashMap<String,String>();
            Map<String,String[]> requestParams = request.getParameterMap();
            for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            }
            boolean signVerified = false; //调用SDK验证签名
            signVerified = AlipaySignature.rsaCheckV1(params, PayUtil.ALIPAY_PUBLIC_KEY, PayUtil.CHARSET, PayUtil.SIGN_TYPE);
            //——请在这里编写您的程序（以下代码仅作参考）——
        /* 实际验证过程建议商户务必添加以下校验：
        1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
        2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
        3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
        4、验证app_id是否为该商户本身。
        */
            if(signVerified) {//验证成功
                //商户订单号
                String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

                //支付宝交易号
                String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

                //交易状态
                String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");

                if(trade_status.equals("TRADE_FINISHED")){
                    //判断该笔订单是否在商户网站中已经做过处理
                    //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                    //如果有做过处理，不执行商户的业务程序

                    //注意：
                    //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
                }else if (trade_status.equals("TRADE_SUCCESS")){
                    //判断该笔订单是否在商户网站中已经做过处理
                    //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                    //如果有做过处理，不执行商户的业务程序

                    //注意：
                    //付款完成后，支付宝系统发送该交易状态通知
                }
            }else {//验证失败
                //调试用，写文本函数记录程序运行情况是否正常
                //String sWord = AlipaySignature.getSignCheckContentV1(params);
                //AlipayConfig.logResult(sWord);
            }
            //——请在这里编写您的程序（以上代码仅作参考）——
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ModelAndView callBack_return(HttpServletRequest request){
        try {
            Map<String,String> params = new HashMap<String,String>();
            Map<String,String[]> requestParams = request.getParameterMap();
            for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            }

            boolean signVerified = AlipaySignature.rsaCheckV1(params, PayUtil.ALIPAY_PUBLIC_KEY, PayUtil.CHARSET, PayUtil.SIGN_TYPE); //调用SDK验证签名

            //——请在这里编写您的程序（以下代码仅作参考）——
            if(signVerified) {
                //商户订单号
                String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

                //支付宝交易号
                String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

                //付款金额
                String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
                //验证成功
            }else {
                //验证失败
            }
            //——请在这里编写您的程序（以上代码仅作参考）——
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 转账 (提现)
     * @return
     */
    public ModelAndView transferAccounts(){
        AlipayClient alipayClient = PayUtil.payClient();
        AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
        request.setBizContent("{" +
                "    \"out_biz_no\":\"3142321423432\"," +
                "    \"payee_type\":\"ALIPAY_LOGONID\"," +  //ALIPAY_LOGONID：支付宝登录号，支持邮箱和手机号格式
                "    \"payee_account\":\"abc@sina.com\"," + //收款方账户。与payee_type配合使用。付款方和收款方不能是同一个账户。
                "    \"amount\":\"12.23\"," +  //转账金额，单位：元。
                                                //只支持2位小数，小数点前最大支持13位，金额必须大于等于0.1元。
                                                 //最大转账金额以实际签约的限额为准。
                "    \"payer_show_name\":\"上海交通卡退款\"," + //付款方姓名（最长支持100个英文/50个汉字）。显示在收款方的账单详情页。如果该字段不传，则默认显示付款方的支付宝认证姓名或单位名称。
                "    \"payee_real_name\":\"张三\"," +
                "    \"remark\":\"转账备注\"," +
                "  }");
        AlipayFundTransToaccountTransferResponse response = null;
        try {
            response = alipayClient.execute(request);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
        return null;
    }

}

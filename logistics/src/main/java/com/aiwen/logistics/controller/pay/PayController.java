package com.aiwen.logistics.controller.pay;

import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.service.AssetCenterService;
import com.aiwen.logistics.service.UserMessagePerfectService;
import com.aiwen.logistics.util.PayUtil;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.request.AlipayTradeCloseRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private AssetCenterService assetCenterService;

    @Autowired
    private UserMessagePerfectService ums;

    @RequestMapping("toOrder")
    public ModelAndView toOrder(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        //跳转到支付页面
        String flag = request.getParameter("flag");
        mv.addObject("flag",flag);
        mv.setViewName("/assetCenter/assetCenter3");
        return mv;
    }

   /**
     * @param request
     * @param response
     * @return 支付页面
     */
    @RequestMapping(value = "pay")
    @ResponseBody
    public String pay(HttpServletRequest request,HttpServletResponse response){
       try{
           String rechargeCode = PayUtil.getOrderIdByUUId("CZ");
           Date date = new Date();
           DateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String orderName = df.format(date);
           //获得初始化的AlipayClient
           AlipayClient alipayClient = PayUtil.payClient();
           //设置请求参数
           AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
           alipayRequest.setReturnUrl(PayUtil.return_url);
           alipayRequest.setNotifyUrl(PayUtil.notify_url);

           //商户订单号，商户网站订单系统中唯一订单号，必填
           String out_trade_no = new String(rechargeCode.getBytes("ISO-8859-1"),"UTF-8");
           //付款金额，必填
           String total_amount = new String(request.getParameter("rechargeAmount").getBytes("ISO-8859-1"),"UTF-8");
           //订单名称，必填
           String subject = new String(orderName.getBytes("ISO-8859-1"),"UTF-8");
           //商品描述，可空
           String body = new String(request.getParameter("rechargeBody").getBytes("ISO-8859-1"),"UTF-8");

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
           return result;
          /* response.setContentType("text/html;charset=utf-8");
           response.getWriter().write(result);//直接将完整的表单html输出到页面
           response.getWriter().flush();*/
       }catch (Exception e){
           e.printStackTrace();
       }
       return null;
    }

    /* *//**
     * @param request
     * @param response
     * @return 交易关闭
     *//*
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

    *//**
     * @param request
     * @return
     * 支付宝服务器主动通知商户服务器里指定的页面http/https路径。
     *//*
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
        *//* 实际验证过程建议商户务必添加以下校验：
        1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
        2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
        3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
        4、验证app_id是否为该商户本身。
        *//*
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
    }*/
    @RequestMapping("return")
    public ModelAndView callBack_return(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/assetCenter/assetCenter?flag=0&typeFlag=recharge");
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
                UserFront userFront = (UserFront)request.getSession().getAttribute("userFront");
                assetCenterService.saveAssets(userFront.getUserId(),total_amount,"1",out_trade_no,1);
                //验证成功
                mv.setViewName("redirect:/assetCenter/assetCenter?flag=1&typeFlag=recharge");
                System.out.println("------------>>>>返回商家成功<<<<<<<<------------");
            }else {
                //验证失败
                mv.setViewName("redirect:/assetCenter/assetCenter?flag=0&typeFlag=recharge");
                System.out.println("------------>>>>返回商家失败<<<<<<<<------------");
            }
            return mv;
            //——请在这里编写您的程序（以上代码仅作参考）——
        }catch (Exception e){
            e.printStackTrace();
        }
        return mv;
    }

    /**
     * 转账 (提现)
     * @return
     */
    @RequestMapping("transferAccounts")
    @ResponseBody
    public Map transferAccounts(HttpServletRequest re){

        HttpSession session=re.getSession();
        UserFront userFront= (UserFront) session.getAttribute("userFront");
        Map<String, String> stringStringMap = ums.judgePayAccount(userFront);
        String alipayAccount = stringStringMap.get("alipayAccount");//收款人支付账户 程序自带
        String alipayAccountRealName = stringStringMap.get("alipayAccountRealName");//收款人 真实姓名  程序自带
        final String userName = userFront.getUserName();
        Map<String,Object> resultMap= new HashMap<String,Object>();
        ModelAndView mv = new ModelAndView();
        String tx = PayUtil.getOrderIdByUUId("TX");
        //String payee_account = re.getParameter("payeeAccount");// 手动添加
        String amount = re.getParameter("amount");
        String payerShowName = re.getParameter("payerShowName");//付款人
        //String payeeRealName = re.getParameter("payeeRealName");//收款人  手动获取
        String remark = re.getParameter("remark");//收款人
        AlipayClient alipayClient = PayUtil.payClient();
        AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
        request.setBizContent("{" +
                "    \"out_biz_no\":\""+tx+"\"," +
                "    \"payee_type\":\"ALIPAY_LOGONID\"," +  //ALIPAY_LOGONID：支付宝登录号，支持邮箱和手机号格式
                "    \"payee_account\":\""+alipayAccount+"\"," + //收款方账户。与payee_type配合使用。付款方和收款方不能是同一个账户。
                "    \"amount\":\""+amount+"\"," +  //转账金额，单位：元。
                                                //只支持2位小数，小数点前最大支持13位，金额必须大于等于0.1元。
                                                 //最大转账金额以实际签约的限额为准。
                "    \"payer_show_name\":\""+payerShowName+"\"," + //付款方姓名（最长支持100个英文/50个汉字）。显示在收款方的账单详情页。如果该字段不传，则默认显示付款方的支付宝认证姓名或单位名称。
                "    \"payee_real_name\":\""+alipayAccountRealName+"\"," +
                "    \"remark\":\""+remark+"\"," +
                "  }");
        AlipayFundTransToaccountTransferResponse response = null;
        try {
            response = alipayClient.execute(request);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        if(response.isSuccess()){
            Map<String, String> params = response.getParams();
            String biz_content = params.get("biz_content");
            JSONObject jsonObject = JSONObject.parseObject(biz_content);
            String out_trade_no=(String) jsonObject.get("out_biz_no");
            System.out.println("调用成功");
            assetCenterService.saveAssets(userFront.getUserId(),amount,"1",out_trade_no,2);
            resultMap.put("data",true);
            //mv.setViewName("forward:/assetCenter/assetCenter?flag=1&typeFlag=withdraw");
        } else {
            System.out.println("调用失败");
            resultMap.put("data",false);
            //mv.setViewName("forward:/assetCenter/assetCenter?flag=0&typeFlag=withdraw");
        }
        return resultMap;
    }

}

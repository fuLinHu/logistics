package com.aiwen.logistics.controller.home;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import sun.net.www.http.HttpClient;


import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2018/5/2.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    //联系客服
    @RequestMapping("/contactCustomer")
    public ModelAndView contactCustomer(){
        return new ModelAndView("other/synopsis");
    }

    //关于经维路通物流
    @RequestMapping("/supplyChain")
    public ModelAndView supplyChain(){
        return new ModelAndView("other/supplyChain");
    }

    //联系我们
    @RequestMapping("/contactUs")
    public ModelAndView contactUs(){
        return new ModelAndView("other/contactUs");
    }

    //常见问题
    @RequestMapping("/commonProblem")
    public ModelAndView commonProblem(){
        return new ModelAndView("other/commonProblem");
    }

    //建设页面
    @RequestMapping("/build")
    public ModelAndView build(String type){
        ModelAndView mv=new ModelAndView("other/build");
        if ("1".equals(type)){
            mv.addObject("type","法则法规");
        }
        if ("2".equals(type)){
            mv.addObject("type","企业管理");
        }
        if ("3".equals(type)){
            mv.addObject("type","平台公告");
        }
        if ("4".equals(type)){
            mv.addObject("type","热门货源");
        }
        if ("5".equals(type)){
            mv.addObject("type","热门运价");
        }
        if ("6".equals(type)){
            mv.addObject("type","资讯平台");
        }
        return mv;
    }

    //安全退出
    @RequestMapping("/signOut")
    public String signOut(HttpServletRequest request){
        HttpSession session=request.getSession();
        session.removeAttribute("userFront");
        return "index";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        doPost();
        return "contrail";
    }

    /**
     * post请求
     *
     * @return
     */
//String method, JSONObject date, HttpServletRequest request
    public static JSONObject doPost() {
        HttpClient client = HttpClients.createDefault();
        // 将接口地址和接口方法拼接起来
        String url = "http://test.logink.org:86/OceanTracking/vehicleGPSInfoService";//.logink.gps.history
        HttpPost post = new HttpPost(url);
        JSONObject response = null;
        try {//date.toString()
            StringEntity s = new StringEntity("method=logink.gps.history\n" +
                    "&result_format=1\n" +
                    "&sec={\"userid\":\"20982\",\"token\":\n" +
                    "    \"YjBiNWJiZDctYzYzZC00MzI4LTk3MjItMWUzNzZiOTEwZGM5VF9UXzBBU19JRF9sb2dpbmtfMA\"}\n" +
                    "&charset=utf-8\n" +
                    "&biz_version=\n" +
                    "&biz_content={\"VehicleNumber\":\"津C19367\",\"LicensePlateTypeCode\":\"0\",\"SPsID\":\"sczw\",\"StartTime\":\"2017-04-01 11:11:11\",\"EndTime\":\"2017-04-01 22:22:22\"}");
            s.setContentEncoding("UTF-8");
            s.setContentType("application/json");
            post.setEntity(s);
            post.addHeader("content-type", "text/xml");
            // 调用Fa接口
            HttpResponse res = client.execute(post);
            String response1 = EntityUtils.toString(res.getEntity());
            System.out.println("************");
            System.out.println(response1);
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                HttpEntity entity = res.getEntity();
//                String result = EntityUtils.toString(res.getEntity());// 返回json格式：
//                response = JSONObject.parseObject(result);
                response = JSONObject.parseObject(response1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }
}

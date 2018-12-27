package com.aiwen.logistics.controller.contrail;

import com.aiwen.logistics.dao.OrderReleaseMapper;
import com.aiwen.logistics.dao.TrajectoryMapper;
import com.aiwen.logistics.pojo.OrderRelease;
import com.aiwen.logistics.pojo.Trajectory;
import com.aiwen.logistics.pojo.TrajectoryExample;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import sun.net.www.http.HttpClient;

/**
 * Created by ASUS on 2018/9/2.
 */
@Controller
@RequestMapping("/contrail")
public class ContrailController {


    @Autowired
    private TrajectoryMapper trajectoryMapper;

    @Autowired
    private OrderReleaseMapper orderReleaseMapper;

    /**
     * post请求
     *
     * @return
     */
/*//String method, JSONObject date, HttpServletRequest request
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
    }*/

    @RequestMapping("/carContrail")
    public ModelAndView test(HttpServletRequest request,String id){
        ModelAndView mv=new ModelAndView();
//        getHttpResponseJson();
        try {
            OrderRelease orderRelease=orderReleaseMapper.selectByPrimaryKey(Integer.parseInt(id));
            if(orderRelease!=null){
                TrajectoryExample example=new TrajectoryExample();
                TrajectoryExample.Criteria criteria=example.createCriteria();
                criteria.andOrderNumEqualTo(orderRelease.getOrdersNum());
                criteria.andStatusEqualTo(1);
                example.setOrderByClause("id");
                List<Trajectory> list=trajectoryMapper.selectByExample(example);
                if(list!=null&&list.size()>0){
                    mv.addObject("list",list);
                    mv.addObject("longitude",list.get(0).getLongitude());
                    mv.addObject("latitude",list.get(0).getLatitude());
                    mv.setViewName("contrail");
                }else{
                    mv.setViewName("contrail1");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mv;
    }


    public static JSONObject getHttpResponseJson(){
        CloseableHttpClient httpclient = null;
        CloseableHttpResponse response = null;
        JSONObject jsonObject = null;

        try {
            //请求发起客户端
            httpclient = HttpClients.createDefault();
           /* String urll="https://ssl.logink.org/authapi/rest/auth/apply?userid=20982&password=Aiwen123&resource=3D8963A7A5E90146E053C0A87F0C0146";
            HttpGet get = new HttpGet(urll);
            response = httpclient.execute(get);
            HttpEntity valueEntity1 = response.getEntity();
            String content1 = EntityUtils.toString(valueEntity1);
            JSONObject json = JSONObject.parseObject(content1);*/
            String url1= URLEncoder.encode("{\"userid\":\"20982\",\"token\":\"MGEyZWE2YTItNGIzOS00MzRhLWI4NzEtMGI0NjJhYWM5YjI2VF9UXzBBU19JRF9sb2dpbmtfMA\"}");
            String url2=URLEncoder.encode("{\"VehicleNumber\":\"津C19367\",\"LicensePlateTypeCode\":\"0\",\"SPsID\":\"sczw\",\"StartTime\":\"2018-09-01 11:11:11\",\"EndTime\":\"2018-09-02 22:22:22\"}");
            String url = "http://track.logink.org:9082/OceanTracking/vehicleGPSInfoService?method=logink.gps.history&result_format=1&sec="+url1+"&charset=utf-8&biz_version=&biz_content="+url2;
            HttpGet post = new HttpGet(url);
            response = httpclient.execute(post);
            HttpEntity valueEntity = response.getEntity();
            String content = EntityUtils.toString(valueEntity);
            jsonObject = JSONObject.parseObject(content);

            return jsonObject;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(httpclient != null){
                try {
                    httpclient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(response != null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return jsonObject;
    }


}

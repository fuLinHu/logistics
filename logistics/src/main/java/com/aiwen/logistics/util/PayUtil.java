package com.aiwen.logistics.util;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.*;

public class PayUtil {


    private static String URL="https://openapi.alipay.com/gateway.do";
    private static String APP_ID="2018081861031942";
    private static String APP_PRIVATE_KEY="MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCoWLqSJEXNnbZHWlo8JhX3kZVp9QydmVVNny6TGBbGVVKlVf8jZPjv9YZG+IDy3RxJpNhb0TY/Z8jj2PHXju1unqkL1K/Ol06KFGPYTh3px33+8sirrCGQl8tOnDnY6mDRD3hKmCkmqxnS9vrVUtsCh7SF9ZYRGT1HHw7KkZtChK1N7oeumrOBSzXiDB2zsk/Gc6OX1mgv0c1zVCapC6yooPeBGo+6Kb8IOxH8yYsy3Vjco7d1HCJlihcVwVQoFWzn7VUvVb48Apn2PMBcxAWyFVSiGdXLuMuPPsaubew+MozzumlNocTcJP8z4qMyrYbr6oDUtdnR2CKC1ma/PXHpAgMBAAECggEAaIwR8chNAVC8bruR5mDQq5rh65efahBbhYUh63++RRWf6cXqWRTP9FXKOjECA9GFS8bwBrV6tw3BGJ8WMgQ1N8mYuhwvwmD9CYt4JlD9Cr41ZStprBOOFLnwLLWgxzFnRu4QimLMy5LeysFPLUPzdzLHzZmixKOkBpMnIG4kub2hw89UoiXmuWZZFBjhBq7Vnp+e4wxGrFCYjvVvuYht7OxlNN4fFY18u6V5TvxOEU6nCmVqugC+43JFjkQXEhebFvBGG9TfuKkFx24JOTfcB76fh2UnwBqa593FDCtTDOFpO1HErQDeCmg4O6QnV++cKqcXGK7dKVJVR/TuX6RBwQKBgQDYJPP2ARroj6VrL9bsOC99OkQ2Gp5rT/vogW092bY+cVNsiFqGXjnWw/VhcAzGGrajiMgg/yoVEw3bRQNrCO/UjVCzQqVwR8/5KrR7pNzWx91RUu6FyHuqoX5ZFjvziOxTt2GvcGb3uTiMu+qOUPiEZgM4DlqrIFzxNYkwiobSDQKBgQDHY35Nb3B9e0olAQvF+lEa32FviRL+ALlOsagee2ZkPojH0zdRq5Bi/RTfsjcW+qJkJ+AvVbGwGrLsr0tTLmbm/LhGxTHBBlVO2NfLTWUs2rQnzaSJkfR5P7e+BJSz/uOCPp4EEWBFJxxvbNiWh3DNHrP4/q0qkOCewecmOdRUTQKBgQCuvnFd2dbfXgLmfW7M2z/JhmnPNAYPzEJk3v5qmrD0GrrPbA2DxHoOX67qb6RkJQSzgcoKo0BqeVUiiNESn88FkJpF0wPdmrFRSG1R6R+BpWQQc3PTRRp2AModTBR7957Yr9GR/NXCQUSuwt4G4P+KSs8fartyzl9Vw2p+jAAjoQKBgQCRXKzBAYSuRssYTTnrHQIyKDbd3L425gozH/wkNOzCGoEXxZnn9b8vG7kzGLdnDlSD1jpv5/bCH8TgHzA4NXUZ45bpKWyLf/WDpT0133fqioubFSZmkTz9hIGNi8NpsmLlGoeTCaP45nmpll4U6CtJr5+f4PQYO0U3GMBPMwvkZQKBgQC3ABhx/+Q/Y4xnFB+4bG7x4cx6X1zzBLRhiS5YcG9r/PXS5qjwfYqAo4r72CQEH9lr+v/f8VtuJFFV/8g22ZJRGZBnKFCnuNV0Zk4J9I2AYH8GfTq0XhyHjlVp75hezHJ96AvKuUOXENXk4qiYX/fYDTmjV76ipXoc6Mja+fUzqw==";
    private static String FORMAT ="json";
    public static String CHARSET="utf-8";
    public static String ALIPAY_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhIUpfZ/cvdzDaNfVvXKjQb3oU9G1Gm89QS0KXizHC2Thd67VK6hzFPxwOwgxiAlWbR/FzGPPDXub89E2cZonrh9AN8EJAGeJBooWvMZkxD+eGYoIr23lkjwuN8AVK1KXFC5Kcc2ZtmsC1QWRA5A5wPQZpB7mOD/ntSxPMOfR+yPOGn7dzD6N3oH37yAAdMblpHOVeuAs5i7tUaxRJXMqDfLnBoy2SKJqFFOElRSjB2VkPRLIdlpdQsh8RQIv7ELJftHQMB6cSs1rZH9K5Ac/7MYmExGul66NjXf4eA2jtge8VH91yzClmj1zJ95g18Fbi1eeLHXrIZWXyla+tR+e+wIDAQAB";
    public static String SIGN_TYPE="RSA2";
    public static String notify_url ="https://www.hao123.com/";
    public static String return_url ="http://www.lltunion.com/pay/return";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static AlipayClient payClient(){
        AlipayClient alipayClient = new DefaultAlipayClient(URL,APP_ID,APP_PRIVATE_KEY,FORMAT,CHARSET,ALIPAY_PUBLIC_KEY,SIGN_TYPE);
        return alipayClient;
    }
    //-----------------------------------------------------------------------------//

    /**
     * MD5加密
     * @param data
     * @return
     * @throws Exception
     */
    public static String MD5(String data) throws Exception {
        java.security.MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] array = md.digest(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }
    /**
     * XML转MAP
     * @param strXML
     * @return
     * @throws Exception
     */
    public static Map<String, String> xmlToMap(String strXML) throws Exception {
        try {
            Map<String, String> data = new HashMap<String, String>();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputStream stream = new ByteArrayInputStream(strXML.getBytes("UTF-8"));
            org.w3c.dom.Document doc = documentBuilder.parse(stream);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getDocumentElement().getChildNodes();
            for (int idx = 0; idx < nodeList.getLength(); ++idx) {
                Node node = nodeList.item(idx);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    org.w3c.dom.Element element = (org.w3c.dom.Element) node;
                    data.put(element.getNodeName(), element.getTextContent());
                }
            }
            try {
                stream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return data;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * 获取随机字符串
     * @param length
     * @return
     */
    public static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 获取IP地址
     * @param request
     * @return
     */
    public static String getIp(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 获取微信支付签名
     * @param map
     * @return
     * @throws Exception
     */
    public static String getWechatSign(Map<String,String> map) throws  Exception{
        Set<String> keySet = map.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (String k : keyArray) {
            if (k.equals("sign")) {
                continue;
            }
            if (map.get(k).trim().length() > 0) {// 参数值为空，则不参与签名
                sb.append(k).append("=").append(map.get(k).trim()).append("&");
            }
        }
        sb.append("key=").append(WXPayConfig.wechat_key);
        return PayUtil.MD5(sb.toString()).toUpperCase();
    }
    /**
     *
     * Map转xml数据
     */
    public static String mapToXML(Map<String,String> param){
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        for (Map.Entry<String,String> entry : param.entrySet()) {
            sb.append("<"+ entry.getKey() +">");
            sb.append(entry.getValue());
            sb.append("</"+ entry.getKey() +">");
        }
        sb.append("</xml>");
        return sb.toString();
    }

    public static String getOrderIdByUUId(String str) {
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        //d 代表参数为正数型
        return  str+machineId+ String.format("%015d", hashCodeV);
    }


}

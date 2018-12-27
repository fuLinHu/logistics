package com.aiwen.logistics.controller.Login;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by hp on 2018/5/5.
 */
public class MailConfig {
    private final String  port = "80";

    public  void MailSend(String userMail) throws MessagingException {
        Map<String,Object> map = new HashMap<String,Object>();
        Properties properties = new Properties();
        properties.put("mail.transport.protocol", "smtp");// 连接协议
        properties.put("mail.smtp.host", "smtp.qq.com");// 主机名
        properties.put("mail.smtp.port", 465);// 端口号
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
        properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息
        // 得到回话对象
        Session session = Session.getInstance(properties);
        // 获取邮件对象
        Message message = new MimeMessage(session);
        // 设置发件人邮箱地址
        message.setFrom(new InternetAddress("3075173721@qq.com"));
        // 设置收件人邮箱地址
       // message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com")});
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(userMail));//一个收件人
        // 设置邮件标题
        message.setSubject("LLT经维物流");
        // 设置邮件内容
        String visitIp = this.presentIp();
        /*
        visitIp 自动获取的IP 地址

         */
        message.setText("点击链接验证"+"http://"+visitIp+":"+port+"/loginController/verificationUser?account="+userMail);
        // 得到邮差对象
        Transport transport = session.getTransport();
        // 连接自己的邮箱账户
        transport.connect("3075173721@qq.com", "ztipnmesxnesddea");// 密码为QQ邮箱开通的stmp服务后得到的客户端授权码
        // 发送邮件
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
       // return map;
    }

    /*
     * @author 获取当前电脑的IP
     * @date 2018/5/7 10:11
     * @param [args]
     * @return void
     */
    public String presentIp()  {
        Enumeration allNetInterfaces = null;
        try {
            allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        InetAddress ip = null;
        String visitIp=null;
        while (allNetInterfaces.hasMoreElements())
        {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements())
            {
                ip = (InetAddress) addresses.nextElement();
                if (ip != null && ip instanceof Inet4Address)
                {
                    System.out.println("本机的IP = " + ip.getHostAddress());
                    visitIp=ip.getHostAddress();
                }
            }
        }
        return visitIp;
    }
}

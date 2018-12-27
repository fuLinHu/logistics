package com.aiwen.logistics.controller.Login;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by hp on 2018/5/11.
 */
public class DoSend {
    private static final String  from = "sscunion@163.com"; // 发件人邮箱地址
    private static final   String user = "sscunion@163.com"; // 发件人称号，同邮箱地址
    private static final String password = "aiwenkeji123456"; // 发件人邮箱客户端授权码
    private static final String  port = "80";

    public static boolean sendMail(String to, String code) {

        try {
            Properties props = new Properties();
            props.put("username", from);
            props.put("password", password);
            props.put("mail.transport.protocol", "smtp" );
            props.put("mail.smtp.host", "smtp.163.com");
            //props.put("mail.smtp.port", "25" );
            props.put("mail.smtp.auth", "true");
            // SSL加密
            MailSSLSocketFactory sf = null;
            sf = new MailSSLSocketFactory();
            // 设置信任所有的主机
            sf.setTrustAllHosts(true);
            props.put("mail.smtp.ssl.enable", "true");
            props.put("mail.smtp.ssl.socketFactory", sf);
            // 根据邮件的会话属性构造一个发送邮件的Session，这里需要注意的是用户名那里不能加后缀，否则便不是用户名了
            //还需要注意的是，这里的密码不是正常使用邮箱的登陆密码，而是客户端生成的另一个专门的授权码
            /*MailAuthenticator authenticator = new MailAuthenticator("tuzongxun123",
                    "客户端授权码");
            Session mailSession = Session.getInstance(pro, authenticator);*/

            Session mailSession = Session.getDefaultInstance(props);

            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(user));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject("LLT经维物流邮箱验证");
            // 设置邮件内容
//            String visitIp = presentIp();
            String visitIp = "47.104.132.122";
        /*
        visitIp 自动获取的IP 地址
"+visitIp+":"+port+"
         */
            String url = "点击链接验证"+"http://www.lltunion.com/loginController/verificationUser?account="+to;
           // msg.setContent("<h1>此邮件为官方激活邮件</h1>","text/html;charset=UTF-8");
            msg.setContent(url,"text/html;charset=UTF-8");
            msg.saveChanges();

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(props.getProperty("mail.smtp.host"), props
                    .getProperty("username"), props.getProperty("password"));
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            return false;
        }
        return true;
    }
    public static boolean sendMail(String to, String code,Object message) {

        try {
            Properties props = new Properties();
            props.put("username", from);
            props.put("password", password);
            props.put("mail.transport.protocol", "smtp" );
            props.put("mail.smtp.host", "smtp.163.com");
            //props.put("mail.smtp.port", "25" );
            props.put("mail.smtp.auth", "true");
            // SSL加密
            MailSSLSocketFactory sf = null;
            sf = new MailSSLSocketFactory();
            // 设置信任所有的主机
            sf.setTrustAllHosts(true);
            props.put("mail.smtp.ssl.enable", "true");
            props.put("mail.smtp.ssl.socketFactory", sf);
            // 根据邮件的会话属性构造一个发送邮件的Session，这里需要注意的是用户名那里不能加后缀，否则便不是用户名了
            //还需要注意的是，这里的密码不是正常使用邮箱的登陆密码，而是客户端生成的另一个专门的授权码
            /*MailAuthenticator authenticator = new MailAuthenticator("tuzongxun123",
                    "客户端授权码");
            Session mailSession = Session.getInstance(pro, authenticator);*/

            Session mailSession = Session.getDefaultInstance(props);

            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(user));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject("LLT经维物流邮箱验证");
            // 设置邮件内容
//            String visitIp = presentIp();
            String visitIp = "47.104.132.122";
        /*
        visitIp 自动获取的IP 地址
"+visitIp+":"+port+"
         */
            //String url = "点击链接验证"+"http://www.sscunion.com/loginController/verificationUser?account="+to;
            // msg.setContent("<h1>此邮件为官方激活邮件</h1>","text/html;charset=UTF-8");
            msg.setText(message.toString());
            //msg.setContent(message,"text/html;charset=UTF-8");
            msg.saveChanges();

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(props.getProperty("mail.smtp.host"), props
                    .getProperty("username"), props.getProperty("password"));
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            return false;
        }
        return true;
    }
    /*
   * @author 获取当前电脑的IP
   * @date 2018/5/7 10:11
   * @param [args]
   * @return void
   */
    public static String presentIp()  {
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
                    if (!"127.0.0.1".equals(ip.getHostAddress())){
                        visitIp=ip.getHostAddress();
                        System.out.println("本机的IP = " + ip.getHostAddress());
                    }
                }
            }
        }
        return visitIp;
    }
    public static void main(String[] args) {
        sendMail("1093941105@qq.com", "89");
    }
}

package com.aiwen.logistics.controller.Login;

import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.service.LoginService;
import com.aiwen.logistics.service.UserFrontService;
import com.aiwen.logistics.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author (杜宗昊)
 * @date 2018/4/25 18:24
 * @param
 * @return
 */
@Controller
@RequestMapping(value = "loginController")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserFrontService userFrontService;
    /*
     * @author 跳转到登录页面
     * @date 2018/5/3 15:43
     * @param []
     * @return java.lang.String
     */
    @RequestMapping(value = "skipLogin")
    public String skipLogin(){
        return "Login/login";
    }
    /*
     * @author 用户登录判断（杜宗昊）
     * @date 2018/4/26 9:54
     * @param [name, password]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping(value = "loginUserJudge")
    @ResponseBody
    public Map<String ,Object> loginUserJudge(String name , String password, HttpServletRequest request){
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        Map<String,Object> map = new HashMap<String ,Object>();
        if(null != userFront ){
            map = loginService.loginUserJudge(userFront.getUserName(),userFront.getPasswoed(),session);
        }else{
            if(!"".equals(name) && !name.isEmpty() && null != name ){
                if(!"".equals(password) && null != password && !password.isEmpty() ){
                    try {
                        password=MD5Util.string2MD5(password);
                        map = loginService.loginUserJudge(name,password,session);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else {
                    session.invalidate();
                    map.put("type","密码不能为空！");
                    map.put("state",0);
                }
            }else{
                session.invalidate();
                map.put("type","用户名不能为空！");
                map.put("state",0);
            }
        }
        return map;
    }
    /*
     * @author 保存新增用户 （杜宗昊）
     * @date 2018/4/26 15:38
     * @param [userFront]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping(value = "saveUserFront")
    @ResponseBody
    public Map<String,Object> saveUserFront(UserFront userFront){
        Map<String,Object > map = new HashMap<String,Object>();
        try {
            String passwoed = userFront.getPasswoed();
            String s = MD5Util.convertMD5(MD5Util.string2MD5(passwoed));
            userFront.setPasswoed(s);
            map = loginService.saveUserFront(userFront);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    /*
     * @author 修改密码 （杜宗昊）
     * @date 2018/4/26 11:01
     * @param
     * @return
     */
//    @RequestMapping(value = "updateUserFront")
//    @ResponseBody
//    public Map<String,Object> updateUserFront(UserFront userFront){
//        Map<String,Object> map = new  HashMap<String,Object>();
//        try {
//            map = loginService.updateUserFront(userFront);
//            map.put("userFront",userFront.getAccount());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return map;
//    }

    /*
     * @author 跳转到注册页面（杜宗昊）
     * @date 2018/5/7 9:50
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "skipUserRegister")
    public  ModelAndView skipUserRegister(){
        ModelAndView modelAndView = new ModelAndView("Login/registerDetailed");
        return modelAndView;
    }

    /*
     * @author 跳转到验证邮箱页面（杜宗昊）
     * @date 2018/5/7 9:51
     * @param [account]
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "registerMailVerify")
    public  ModelAndView registerMailboxOnclick(String account){
        ModelAndView modelAndView = new ModelAndView("Login/registerMailVerify");
        modelAndView.addObject("account",account);
        return modelAndView;
    }

    /*
     * @author 查看邮箱是否验证（杜宗昊）
     * @date 2018/5/7 10:52
     * @param []
     * @return java.util.Map<java.lang.String,java.lang.Object>/loginController/registerMailVerify"
     */
    @RequestMapping(value = "verificationUserMail")
    public ModelAndView verificationUserMail(String account){
        Integer num = null;
        try {
            num  = loginService.verificationUserMail(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView();

        if(num==1){
            modelAndView.setViewName("Login/registerAccomplish");
            modelAndView.addObject("account",account);
        }else
            modelAndView.setViewName("Login/registerMailVerify");
            modelAndView.addObject("account",account);
        return modelAndView;
    }

    /*
     * @author 跳转到注册成功页面(杜宗昊)
     * @date 2018/5/7 11:20
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "registerDetailedOnclick")
    public  ModelAndView registerDetailedOnclick(){
        ModelAndView modelAndView = new ModelAndView("Login/registerAccomplish");
        return modelAndView;
    }
    /*
     * @author 邮箱验证修修改改状态（杜宗昊）
     * @date 2018/5/7 10:22
     * @param []
     * @return void
     */
    @RequestMapping(value = "verificationUser")
    public ModelAndView verificationUser(String account){
        try {
            loginService.updateUserFalg(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView("Login/register");
        return modelAndView;
    }
    @RequestMapping(value = "toforget")
    public String toforget(String mail){
        return "Login/forget";
    }
    @RequestMapping(value = "forget")
    @ResponseBody
    public Map<String,Object> forget(String account,String verificationCode,HttpServletRequest request){
        final  String password = request.getParameter("password");
        Map<String,Object> map = new HashMap<String, Object>();
        HttpSession session = request.getSession();
        String verificationCodeSession = session.getAttribute("verificationCode")+"";
        session.setAttribute("verificationCode",null);
        if(verificationCodeSession==null){
            map.put("message","验证码无效");
            return map;
        }
        if(!verificationCodeSession.equals(verificationCode)){
            map.put("message","验证码错误");
            return map;
        }
        final String account1=account;
        if(account==null||"".equals(account)||account==""){
            map.put("message","账号不能为空");
            return map;
        }
        if(password==null||"".equals(password)||password==""){
            map.put("message","密码不能为空");
            return map;
        }
        String  conPassWord=MD5Util.string2MD5(password);
        UserFront user = new UserFront();
        user.setPasswoed(conPassWord);
        user.setAccount(account);
        int i = userFrontService.updateByMail(user);
        map.put("code",i);
        if(i==1){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    DoSend.sendMail(account1,"89","新密码："+password);
                }
            }).start();

            map.put("message","密码修改成功");
        }
        return map;
    }
    @RequestMapping(value = "getVerCode")
    @ResponseBody
    public Map<String,Object> getVerCode(String account,HttpServletRequest request){
        int code=(int)((Math.random()*9+1)*1000);
        request.getSession().setAttribute("verificationCode",code);
        DoSend.sendMail(account,"89","验证码："+code);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("message","验证码已发送");
        return map;
    }
    public static void main(String[] args) {
        DoSend mailConfig = new DoSend();
        DoSend.sendMail("1093941105@qq.com","89","1234");
        //mailConfig. sendMail("47711504@qq.com", "89");
    }

    @RequestMapping(value = "account")
    @ResponseBody
    public Map<String,Object> account(String str){
        Map<String,Object> map=new HashMap<String, Object>();
        List<UserFront> userFrontList=userFrontService.findByMail(str);
        if(userFrontList!=null&&userFrontList.size()>0){
            map.put("flag",1);
        }else{
            map.put("flag",0);
        }
        return  map;
    }
}

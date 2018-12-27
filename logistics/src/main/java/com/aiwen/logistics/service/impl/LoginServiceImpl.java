package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.controller.Login.DoSend;
import com.aiwen.logistics.controller.Login.MailConfig;
import com.aiwen.logistics.dao.UserFrontMapper;
import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.pojo.UserFrontExample;
import com.aiwen.logistics.service.LoginService;
import com.aiwen.logistics.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author (杜宗昊)
 * @date 2018/4/25 18:22
 * @param
 * @return
 */
@Service
public class LoginServiceImpl  implements LoginService{

    @Autowired
    private UserFrontMapper userFrontMapper;


    /*
     * @author 登录密码判断 （杜宗昊）
     * @date 2018/4/26 9:58
     * @param [name, password]
     * @return java.lang.Integer
     */
    public Map<String,Object> loginUserJudge(String name , String password,HttpSession session ){
        Map<String,Object> map = new HashMap<String,Object>();
        UserFrontExample example = new UserFrontExample();
        UserFrontExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(name);
        criteria.andPasswoedEqualTo(password);
        List<UserFront> list = userFrontMapper.selectByExample(example);

        if(null != list && list.size()>0){
            for (UserFront userFront :list) {

                if(!"".equals(userFront.getFlag()) && null != userFront.getFlag() && !userFront.getFlag().isEmpty() ){
                    if( userFront.getFlag().equals("2")){
                        map.put("state",1);
                        for (UserFront uf :list) {
                            uf.setLoginTime(this.gainDate());
                            userFrontMapper.updateByPrimaryKeySelective(uf);
                            session.setAttribute("userFront",userFront);
                        }
                    }else{
                        session.invalidate();
                        map.put("state",2);
                        map.put("type","未审核通过！");
                    }
                }
            }
        }else {
            session.invalidate();
            map.put("type","用户名或密码错误!");
            map.put("state",0);
        }
        return map;
    }


    /*
 * @author 新增用户保存（杜宗昊）
 * @date 2018/4/26 11:41
 * @param [userFront]
 * @return java.util.Map<java.lang.String,java.lang.Object>
 */
    public Map<String,Object> saveUserFront(UserFront userFront){
        Map<String,Object> map = new HashMap<String,Object>();
        String createDate = gainDate();
        if( null != userFront){
            userFront.setCreatedTime(createDate);
//            userFront.setFlag("3");
            UserFrontExample example = new UserFrontExample();
            UserFrontExample.Criteria criteria = example.createCriteria();
            criteria.andAccountEqualTo(userFront.getAccount());
            List<UserFront> userFrontsList = userFrontMapper.selectByExample(example);
            if(userFrontsList.size()==0){
                int count = userFrontMapper.insertSelective(userFront);

                if( count > 0 ){
                    try {
                        this.sendMain163(userFront.getAccount());
                    } catch (MessagingException e) {
                        e.printStackTrace();
                    }
                    map.put("state",1);
                    map.put("type","已保存！！");
                }else{
                    map.put("state",0);
                    map.put("type","注册失败！！");
                }
            }else {
                map.put("state",2);
                map.put("type","用户已注册！！");
            }

        }
        return map;
    }

    /*
    * @author修改密码保存 （杜宗昊）
    * @date 2018/4/26 11:23
    * @param [userFront]
    * @return java.util.Map<java.lang.String,java.lang.Object>
    */
    public Map<String,Object>  updateUserFront(UserFront userFront){
        String passwoed = userFront.getPasswoed();
        passwoed=MD5Util.string2MD5(passwoed);
        userFront.setPasswoed(passwoed);
        Map<String,Object> map = new HashMap<String,Object>();
        String updateDate = this.gainDate();
        if( null != updateDate){
            userFront.setUpdateTime(updateDate);
        }

        if( null != userFront){
            int count = userFrontMapper.updateByPrimaryKeySelective(userFront);
            if(count > 0 ){
                map.put("state",1);
                map.put("type","修改成功");
            }else{
                map.put("state",0);
                map.put("type","修改失败");
            }
        }else{
            map.put("state",0);
            map.put("type","请填写数据！");
        }

        return map;
    }
    /*
     * @author 邮箱验证（杜宗昊）
     * @date 2018/5/7 10:26
     * @param []
     * @return void
     */
    public void updateUserFalg(String userMail){
        UserFront userFront = new UserFront();
        userFront.setFlag("1");
        UserFrontExample example = new UserFrontExample();
        UserFrontExample.Criteria criteria = example.createCriteria();
        if(!"".equals(userMail) && null != userMail && !userMail.isEmpty() ){
            criteria.andAccountEqualTo(userMail);
        }
        List<UserFront> userFrontsList = userFrontMapper.selectByExample(example);
        for (UserFront uf:
        userFrontsList) {
            userFront.setUserId(uf.getUserId());
            userFrontMapper.updateByPrimaryKeySelective(userFront);
        }

    }

    /*
   * @author 查询邮箱是否验证
   * @date 2018/5/7 10:59
   * @param []
   * @return java.util.Map<java.lang.String,java.lang.Object>
   */
    public Integer verificationUserMail(String account){
        UserFrontExample example = new UserFrontExample();
        UserFrontExample.Criteria criteria = example.createCriteria();
        if(!"".equals(account) && null != account && !account.isEmpty()){
            criteria.andAccountEqualTo(account);
        }
        String flag = null ;
        List<UserFront> userFrontsList = userFrontMapper.selectByExample(example);
        for (UserFront userFront:
             userFrontsList) {
            flag = userFront.getFlag();
        }
        Integer num = null;
        if("1".equals(flag)){
            num = 1;
        }else{
            num = 0;
        }
        return num;
    }

    /*
     * @author 获取当前时间 （杜宗昊）
     * @date 2018/4/26 11:48
     * @param [args]
     * @return void
     */
    public String  gainDate () {
        Date day=new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(df.format(day));

        return df.format(day);
    }
    /*
     * @author 邮箱发送邮件（杜宗昊）QQ
     * @date 2018/5/7 9:52
     * @param [args]
     * @return void
     */
    public void sendMainQQ(String mail) throws MessagingException {
        MailConfig m = new MailConfig();
        m.MailSend(mail);
    }

    public void sendMain163(String mail) throws MessagingException {
        DoSend mailConfig = new DoSend();
        mailConfig. sendMail(mail, "89");
    }


}

package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.UserFront;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by hp on 2018/4/25.
 */
public interface LoginService {

    /*
     * @author 登录密码判断 （杜宗昊）
     * @date 2018/4/26 9:58
     * @param [name, password]
     * @return java.lang.Integer
     */
    public Map<String,Object> loginUserJudge(String name , String password,HttpSession session );

    /*
     * @author 新增用户保存（杜宗昊）
     * @date 2018/4/26 11:41
     * @param [userFront]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    public Map<String,Object> saveUserFront(UserFront userFront);

    /*
     * @author修改密码保存 （杜宗昊）
     * @date 2018/4/26 11:23
     * @param [userFront]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    public Map<String,Object>  updateUserFront(UserFront userFront);

    /*
     * @author 邮箱验证（杜宗昊）
     * @date 2018/5/7 10:24
     * @param []
     * @return void
     */
    public void updateUserFalg(String userMail);

    /*
     * @author 查询邮箱是否验证
     * @date 2018/5/7 10:59
     * @param []
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    public Integer verificationUserMail(String account);

}

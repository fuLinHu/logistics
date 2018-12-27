package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.EnterpriseInfo;
import com.aiwen.logistics.pojo.PersonalInfo;
import com.aiwen.logistics.pojo.UserFront;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by hp on 2018/5/5.
 */
public interface UserMessagePerfectService {

    /*
     * @author 用户信息回显（杜宗昊）
     * @date 2018/5/7 17:33
     * @param [userId]
     * @return java.util.List
     */
    public List userEchoMessage(Integer userId);
    public List userFirmMessage(Integer userId);
    /*
     * @author 所在行业回显（杜宗昊）
     * @date 2018/5/7 17:54
     * @param [userId]
     * @return java.util.List
     */
    public List RegionUser(Integer userId);
    /*
     * @author 用户信息管理 个人信息完善（杜宗昊）
     * @date 2018/5/5 12:22
     * @param [personalInfo]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    public Map<String,Object> userPersonageInsert(PersonalInfo personalInfo,HttpServletRequest request);


    /*
         * @author  公司所在行业回显（杜宗昊）
         * @date 2018/5/5 12:50
         * @param []
         * @return java.util.Map<java.lang.String,java.lang.Object>
         */
    public Map<String,Object> userCompanySelectOnchange();

    /*
         * @author  用户信息管理 公司信息完善（杜宗昊）
         * @date 2018/5/5 13:44
         * @param [enterpriseInfo, request]
         * @return java.util.Map<java.lang.String,java.lang.Object>
         */
    public Map<String,Object> userCompanyInsert(EnterpriseInfo enterpriseInfo,HttpServletRequest request);

    public Map<String,String> judgePayAccount(UserFront userFront);

}

package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.EnterpriseInfoMapper;
import com.aiwen.logistics.dao.PersonalInfoMapper;
import com.aiwen.logistics.dao.SyscodeMapper;
import com.aiwen.logistics.dao.UserFrontMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.UserMessagePerfectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**(杜宗昊)
 * Created by hp on 2018/5/5.
 */
@Service
public class UserMessagePerfectServiceImpl implements UserMessagePerfectService {

    @Autowired
    private PersonalInfoMapper personalInfoMapper;

    @Autowired
    private EnterpriseInfoMapper enterpriseInfoMapper;

    @Autowired
    private SyscodeMapper syscodeMapper;

    @Autowired
    private UserFrontMapper userFrontMapper;

    @Autowired
    private UserMessagePerfectService ums;



    /*
     * @author 用户信息回显（杜宗昊）
     * @date 2018/5/7 17:33
     * @param [userId]
     * @return java.util.List
     */
    public List userEchoMessage(Integer userId){
        PersonalInfoExample example = new PersonalInfoExample();
        PersonalInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<PersonalInfo> personalInfosList = personalInfoMapper.selectByExample(example);
        return  personalInfosList;

    }

    public List<EnterpriseInfo> userFirmMessage(Integer userId){
        EnterpriseInfoExample enterpriseInfoExample = new EnterpriseInfoExample();
        EnterpriseInfoExample.Criteria enterpriseInfoExampleCriteria = enterpriseInfoExample.createCriteria();
        enterpriseInfoExampleCriteria.andUserIdEqualTo(userId);
        List<EnterpriseInfo> enterpriseInfoList = enterpriseInfoMapper.selectByExample(enterpriseInfoExample);
        return enterpriseInfoList;
    }
    /*
        * @author 所在行业回显（杜宗昊）
        * @date 2018/5/7 17:54
        * @param [userId]
        * @return java.util.List
        */
    public List RegionUser(Integer userId){
      SyscodeExample example =  new SyscodeExample();
        SyscodeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo("2");
        List<Syscode> syscodes = syscodeMapper.selectByExample(example);
        return syscodes;
    }


    /*
         * @author 用户信息管理 个人信息完善（杜宗昊）
         * @date 2018/5/5 12:22
         * @param [personalInfo]
         * @return java.util.Map<java.lang.String,java.lang.Object>
         */
    public Map<String,Object> userPersonageInsert(PersonalInfo personalInfo,HttpServletRequest request){
        Map<String,Object> map  = new HashMap<String,Object>();
        PersonalInfoExample example = new PersonalInfoExample();
        PersonalInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(personalInfo.getUserId());
        List<PersonalInfo> personalInfosList = personalInfoMapper.selectByExample(example);
        int num=0;
        if (personalInfosList!=null&&personalInfosList.size()>0){
            personalInfo.setCity(personalInfosList.get(0).getCity());
            num = personalInfoMapper.updateByPrimaryKey(personalInfo);
        }else{
            num  = personalInfoMapper.insertSelective(personalInfo);
        }
        /*if(personalInfosList.size()==0){
            num  = personalInfoMapper.insertSelective(personalInfo);
        }else {
            for (PersonalInfo pl:personalInfosList) {
                personalInfo.setCity(pl.getCity());
                personalInfoMapper.deleteByPrimaryKey(pl.getPersonalInfoId());
            }
            num  = personalInfoMapper.insertSelective(personalInfo);
        }*/
        HttpSession session=request.getSession();
        UserFront userFront= (UserFront) session.getAttribute("userFront");
        userFrontMapper.updateByPrimaryKey(userFront);
        session.setAttribute("userFront",userFront);
        if(num == 1){
            map.put("statr",1);
        }else {
            map.put("statr",0);
        }
        return map;
    }

    /*
        * @author  公司所在行业回显（杜宗昊）
        * @date 2018/5/5 12:50
        * @param []
        * @return java.util.Map<java.lang.String,java.lang.Object>
        */
    public Map<String,Object> userCompanySelectOnchange(){
        Map<String,Object> map = new HashMap<String,Object>();
        SyscodeExample example = new SyscodeExample();
        SyscodeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo("2");
        List<Syscode> syscodes = syscodeMapper.selectByExample(example);
        if(syscodes.size()>0){
            map.put("syscodes",syscodes);
        }else {
            map.put("syscodes",1);
        }
        return map;
    }
    /*
            * @author  用户信息管理 公司信息完善（杜宗昊）
            * @date 2018/5/5 13:44
            * @param [enterpriseInfo, request]
            * @return java.util.Map<java.lang.String,java.lang.Object>
            */
    public Map<String,Object> userCompanyInsert(EnterpriseInfo enterpriseInfo,HttpServletRequest request){
        Map<String,Object> map  = new HashMap<String,Object>();
        HttpSession session=request.getSession();
        UserFront userFront= (UserFront) session.getAttribute("userFront");
        EnterpriseInfoExample example = new EnterpriseInfoExample();
        EnterpriseInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(enterpriseInfo.getUserId());
        List<EnterpriseInfo> enterpriseInfoList = enterpriseInfoMapper.selectByExample(example);
        int num=0;
        if (enterpriseInfoList!=null&&enterpriseInfoList.size()>0){
            num = enterpriseInfoMapper.updateByPrimaryKey(enterpriseInfo);
        }else{
            num  = enterpriseInfoMapper.insertSelective(enterpriseInfo);
        }
       /* if(enterpriseInfoList.size()==0){
            num  = enterpriseInfoMapper.insertSelective(enterpriseInfo);
        }else {
            for (EnterpriseInfo el:
            enterpriseInfoList) {
                //enterpriseInfo.s
                enterpriseInfoMapper.deleteByPrimaryKey(el.getEnterpriseId());
            }
            num  = enterpriseInfoMapper.insertSelective(enterpriseInfo);
        }*/
        userFront.setUserName(enterpriseInfo.getEnterpriseName());
        userFrontMapper.updateByPrimaryKey(userFront);
        session.setAttribute("userFront",userFront);
        if(num == 1){
            map.put("statr",1);
        }else {
            map.put("statr",0);
        }
        return map;
    }
    @Override
    public Map<String,String> judgePayAccount(UserFront userFront){
        Map<String,String> map = new HashMap<String,String>();
        Integer userId = userFront.getUserId();
        Integer identityType = userFront.getIdentityType();//1 个人  2 公司、
        boolean flag=false;
        String alipay="";
        String alipayAccountRealName="";
        String wxpay="";
        if(identityType==1){
            List list =  ums.userEchoMessage(userFront.getUserId());
            if(list!=null&&list.size()>0){
                PersonalInfo o = (PersonalInfo)list.get(0);
                String alipayAccount = o.getAlipayAccount();
                alipay=alipayAccount;
                alipayAccountRealName=o.getAlipayAccountRealName();
            }
        }else{
            List list = ums.userFirmMessage(userFront.getUserId());
            if(list!=null&&list.size()>0){
                EnterpriseInfo o = (EnterpriseInfo)list.get(0);
                String alipayAccount = o.getAlipayAccount();
                alipay=alipayAccount;
                alipayAccountRealName=o.getAlipayAccountRealName();
            }
        }
        map.put("alipayAccount",alipay);
        map.put("alipayAccountRealName",alipayAccountRealName);
        return map;
    }
}

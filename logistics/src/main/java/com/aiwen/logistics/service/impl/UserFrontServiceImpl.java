package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.UserFrontMapper;
import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.pojo.UserFrontExample;
import com.aiwen.logistics.service.UserFrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/5/4.
 */
@Service
public class UserFrontServiceImpl implements UserFrontService {

    @Autowired
    private UserFrontMapper userFrontMapper;

    @Override
    public List<UserFront> findListByIdentityType(UserFrontExample example) {
        List<UserFront> list=null;
        try {
            list=userFrontMapper.selectByExample(example);
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public UserFront findById(Integer id) {
        return userFrontMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserFront> findByMail(String mail) {
        UserFrontExample example = new UserFrontExample();
        UserFrontExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(mail);
        List<UserFront> list = userFrontMapper.selectByExample(example);
        return list;
    }

    @Override
    public int updateByMail(UserFront userFront) {
        int i = userFrontMapper.updateByMail(userFront);
        return i;
    }
}

package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.pojo.UserFrontExample;

import java.util.List;

/**
 * Created by ASUS on 2018/5/4.
 */
public interface UserFrontService {
    public List<UserFront> findListByIdentityType(UserFrontExample example);

    public UserFront findById(Integer id);

    public List<UserFront> findByMail(String mail);

    public int updateByMail(UserFront userFront);
}

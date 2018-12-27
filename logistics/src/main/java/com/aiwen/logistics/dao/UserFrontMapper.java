package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.pojo.UserFrontExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserFrontMapper {
    int countByExample(UserFrontExample example);

    int deleteByExample(UserFrontExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserFront record);

    int insertSelective(UserFront record);

    List<UserFront> selectByExampleWithRowbounds(UserFrontExample example, RowBounds rowBounds);

    List<UserFront> selectByExample(UserFrontExample example);

    UserFront selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserFront record, @Param("example") UserFrontExample example);

    int updateByExample(@Param("record") UserFront record, @Param("example") UserFrontExample example);

    int updateByPrimaryKeySelective(UserFront record);

    int updateByPrimaryKey(UserFront record);

    int updateByMail(UserFront userFront);
}
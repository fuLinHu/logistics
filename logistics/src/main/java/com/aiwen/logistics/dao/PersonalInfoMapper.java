package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.PersonalInfo;
import com.aiwen.logistics.pojo.PersonalInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface PersonalInfoMapper {
    int countByExample(PersonalInfoExample example);

    int deleteByExample(PersonalInfoExample example);

    int deleteByPrimaryKey(Integer personalInfoId);

    int insert(PersonalInfo record);

    int insertSelective(PersonalInfo record);

    List<PersonalInfo> selectByExampleWithRowbounds(PersonalInfoExample example, RowBounds rowBounds);

    List<PersonalInfo> selectByExample(PersonalInfoExample example);

    PersonalInfo selectByPrimaryKey(Integer personalInfoId);

    int updateByExampleSelective(@Param("record") PersonalInfo record, @Param("example") PersonalInfoExample example);

    int updateByExample(@Param("record") PersonalInfo record, @Param("example") PersonalInfoExample example);

    int updateByPrimaryKeySelective(PersonalInfo record);

    int updateByPrimaryKey(PersonalInfo record);

    public List<PersonalInfo> selectByUserId(@Param("userId") Integer id);
}
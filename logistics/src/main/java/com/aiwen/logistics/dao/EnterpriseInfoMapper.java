package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.EnterpriseInfo;
import com.aiwen.logistics.pojo.EnterpriseInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface EnterpriseInfoMapper {
    int countByExample(EnterpriseInfoExample example);

    int deleteByExample(EnterpriseInfoExample example);

    int deleteByPrimaryKey(Integer enterpriseId);

    int insert(EnterpriseInfo record);

    int insertSelective(EnterpriseInfo record);

    List<EnterpriseInfo> selectByExampleWithRowbounds(EnterpriseInfoExample example, RowBounds rowBounds);

    List<EnterpriseInfo> selectByExample(EnterpriseInfoExample example);

    EnterpriseInfo selectByPrimaryKey(Integer enterpriseId);

    int updateByExampleSelective(@Param("record") EnterpriseInfo record, @Param("example") EnterpriseInfoExample example);

    int updateByExample(@Param("record") EnterpriseInfo record, @Param("example") EnterpriseInfoExample example);

    int updateByPrimaryKeySelective(EnterpriseInfo record);

    int updateByPrimaryKey(EnterpriseInfo record);

    List<EnterpriseInfo> selectByUserId(@Param("userId") Integer id);
}
package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.AreaInfo;
import com.aiwen.logistics.pojo.AreaInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface AreaInfoMapper {
    int countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExampleWithRowbounds(AreaInfoExample example, RowBounds rowBounds);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);

    List<AreaInfo> findProvince();
}
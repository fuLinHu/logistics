package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.OceanCarriageInformation;
import com.aiwen.logistics.pojo.OceanCarriageInformationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OceanCarriageInformationMapper {
    int countByExample(OceanCarriageInformationExample example);

    int deleteByExample(OceanCarriageInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OceanCarriageInformation record);

    int insertSelective(OceanCarriageInformation record);

    List<OceanCarriageInformation> selectByExampleWithRowbounds(OceanCarriageInformationExample example, RowBounds rowBounds);

    List<OceanCarriageInformation> selectByExample(OceanCarriageInformationExample example);

    OceanCarriageInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OceanCarriageInformation record, @Param("example") OceanCarriageInformationExample example);

    int updateByExample(@Param("record") OceanCarriageInformation record, @Param("example") OceanCarriageInformationExample example);

    int updateByPrimaryKeySelective(OceanCarriageInformation record);

    int updateByPrimaryKey(OceanCarriageInformation record);
}
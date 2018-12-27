package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.HotFreight;
import com.aiwen.logistics.pojo.HotFreightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HotFreightMapper {
    int countByExample(HotFreightExample example);

    int deleteByExample(HotFreightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotFreight record);

    int insertSelective(HotFreight record);

    List<HotFreight> selectByExampleWithRowbounds(HotFreightExample example, RowBounds rowBounds);

    List<HotFreight> selectByExample(HotFreightExample example);

    HotFreight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotFreight record, @Param("example") HotFreightExample example);

    int updateByExample(@Param("record") HotFreight record, @Param("example") HotFreightExample example);

    int updateByPrimaryKeySelective(HotFreight record);

    int updateByPrimaryKey(HotFreight record);
}
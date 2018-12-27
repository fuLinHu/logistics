package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.ShipDynamic;
import com.aiwen.logistics.pojo.ShipDynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShipDynamicMapper {
    int countByExample(ShipDynamicExample example);

    int deleteByExample(ShipDynamicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShipDynamic record);

    int insertSelective(ShipDynamic record);

    List<ShipDynamic> selectByExampleWithRowbounds(ShipDynamicExample example, RowBounds rowBounds);

    List<ShipDynamic> selectByExample(ShipDynamicExample example);

    ShipDynamic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShipDynamic record, @Param("example") ShipDynamicExample example);

    int updateByExample(@Param("record") ShipDynamic record, @Param("example") ShipDynamicExample example);

    int updateByPrimaryKeySelective(ShipDynamic record);

    int updateByPrimaryKey(ShipDynamic record);
}
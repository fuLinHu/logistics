package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.OrderRelease;
import com.aiwen.logistics.pojo.OrderReleaseExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OrderReleaseMapper {
    int countByExample(OrderReleaseExample example);

    int deleteByExample(OrderReleaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderRelease record);

    int insertSelective(OrderRelease record);

    List<OrderRelease> selectByExampleWithRowbounds(OrderReleaseExample example, RowBounds rowBounds);

    List<OrderRelease> selectByExample(OrderReleaseExample example);

    OrderRelease selectByPrimaryKey(Integer id);

    OrderRelease selectByPrimaryKeyID (@Param("id")Integer id);

    int updateByExampleSelective(@Param("record") OrderRelease record, @Param("example") OrderReleaseExample example);

    int updateByExample(@Param("record") OrderRelease record, @Param("example") OrderReleaseExample example);

    int updateByPrimaryKeySelective(OrderRelease record);

    int updateByPrimaryKey(OrderRelease record);

    public List<OrderRelease> getOrderList(OrderRelease record);
}
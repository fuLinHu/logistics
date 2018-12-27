package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.GoodQuotations;
import com.aiwen.logistics.pojo.GoodQuotationsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface GoodQuotationsMapper {
    int countByExample(GoodQuotationsExample example);

    int deleteByExample(GoodQuotationsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodQuotations record);

    int insertSelective(GoodQuotations record);

    List<GoodQuotations> selectByExampleWithRowbounds(GoodQuotationsExample example, RowBounds rowBounds);

    List<GoodQuotations> selectByExample(GoodQuotationsExample example);

    GoodQuotations selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodQuotations record, @Param("example") GoodQuotationsExample example);

    int updateByExample(@Param("record") GoodQuotations record, @Param("example") GoodQuotationsExample example);

    int updateByPrimaryKeySelective(GoodQuotations record);

    int updateByPrimaryKey(GoodQuotations record);

    public Integer deleteBath(List<GoodQuotations> ids);

    public Integer updateBath(List<GoodQuotations> ids);
}
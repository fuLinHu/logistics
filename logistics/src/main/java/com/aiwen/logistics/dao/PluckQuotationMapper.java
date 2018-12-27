package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.PluckQuotation;
import com.aiwen.logistics.pojo.PluckQuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PluckQuotationMapper {
    int countByExample(PluckQuotationExample example);

    int deleteByExample(PluckQuotationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PluckQuotation record);

    int insertSelective(PluckQuotation record);

    List<PluckQuotation> selectByExampleWithRowbounds(PluckQuotationExample example, RowBounds rowBounds);

    List<PluckQuotation> selectByExample(PluckQuotationExample example);

    PluckQuotation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PluckQuotation record, @Param("example") PluckQuotationExample example);

    int updateByExample(@Param("record") PluckQuotation record, @Param("example") PluckQuotationExample example);

    int updateByPrimaryKeySelective(PluckQuotation record);

    int updateByPrimaryKey(PluckQuotation record);
}
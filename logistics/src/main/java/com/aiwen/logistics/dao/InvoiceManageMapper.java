package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.InvoiceManage;
import com.aiwen.logistics.pojo.InvoiceManageExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface InvoiceManageMapper {
    int countByExample(InvoiceManageExample example);

    int deleteByExample(InvoiceManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvoiceManage record);

    int insertSelective(InvoiceManage record);

    List<InvoiceManage> selectByExampleWithRowbounds(InvoiceManageExample example, RowBounds rowBounds);

    List<InvoiceManage> selectByExample(InvoiceManageExample example);

    InvoiceManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvoiceManage record, @Param("example") InvoiceManageExample example);

    int updateByExample(@Param("record") InvoiceManage record, @Param("example") InvoiceManageExample example);

    int updateByPrimaryKeySelective(InvoiceManage record);

    int updateByPrimaryKey(InvoiceManage record);

    InvoiceManage beforeInvoiceMessage (@Param("userId")Integer userId);
}
package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.TransactionRecord;
import com.aiwen.logistics.pojo.TransactionRecordExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TransactionRecordMapper {
    int countByExample(TransactionRecordExample example);

    int deleteByExample(TransactionRecordExample example);

    int deleteByPrimaryKey(Integer transactionRecordId);

    int insert(TransactionRecord record);

    int insertSelective(TransactionRecord record);

    List<TransactionRecord> selectByExampleWithRowbounds(TransactionRecordExample example, RowBounds rowBounds);

    List<TransactionRecord> selectByExample(TransactionRecordExample example);

    TransactionRecord selectByPrimaryKey(Integer transactionRecordId);

    int updateByExampleSelective(@Param("record") TransactionRecord record, @Param("example") TransactionRecordExample example);

    int updateByExample(@Param("record") TransactionRecord record, @Param("example") TransactionRecordExample example);

    int updateByPrimaryKeySelective(TransactionRecord record);

    int updateByPrimaryKey(TransactionRecord record);
}
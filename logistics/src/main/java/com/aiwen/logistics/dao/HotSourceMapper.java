package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.HotSource;
import com.aiwen.logistics.pojo.HotSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HotSourceMapper {
    int countByExample(HotSourceExample example);

    int deleteByExample(HotSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotSource record);

    int insertSelective(HotSource record);

    List<HotSource> selectByExampleWithRowbounds(HotSourceExample example, RowBounds rowBounds);

    List<HotSource> selectByExample(HotSourceExample example);

    HotSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotSource record, @Param("example") HotSourceExample example);

    int updateByExample(@Param("record") HotSource record, @Param("example") HotSourceExample example);

    int updateByPrimaryKeySelective(HotSource record);

    int updateByPrimaryKey(HotSource record);
}
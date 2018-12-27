package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.GrabSource;
import com.aiwen.logistics.pojo.GrabSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GrabSourceMapper {
    int countByExample(GrabSourceExample example);

    int deleteByExample(GrabSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrabSource record);

    int insertSelective(GrabSource record);

    List<GrabSource> selectByExampleWithRowbounds(GrabSourceExample example, RowBounds rowBounds);

    List<GrabSource> selectByExample(GrabSourceExample example);

    GrabSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrabSource record, @Param("example") GrabSourceExample example);

    int updateByExample(@Param("record") GrabSource record, @Param("example") GrabSourceExample example);

    int updateByPrimaryKeySelective(GrabSource record);

    int updateByPrimaryKey(GrabSource record);
}
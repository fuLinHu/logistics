package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.Page;
import com.aiwen.logistics.pojo.ReleaseSource;
import com.aiwen.logistics.pojo.ReleaseSourceExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ReleaseSourceMapper {
    int countByExample(ReleaseSourceExample example);

    int deleteByExample(ReleaseSourceExample example);

    int deleteByPrimaryKey(Integer sourceId);

    int insert(ReleaseSource record);

    int insertSelective(ReleaseSource record);

    List<ReleaseSource> selectByExampleWithRowbounds(ReleaseSourceExample example, RowBounds rowBounds);

    List<ReleaseSource> selectByExample(ReleaseSourceExample example);

    ReleaseSource selectByPrimaryKey(Integer sourceId);

    int updateByExampleSelective(@Param("record") ReleaseSource record, @Param("example") ReleaseSourceExample example);

    int updateByExample(@Param("record") ReleaseSource record, @Param("example") ReleaseSourceExample example);

    int updateByPrimaryKeySelective(ReleaseSource record);

    int updateByPrimaryKey(ReleaseSource record);

    public List<ReleaseSource> selectReleaseSourceListByUserId(@Param("id")Integer id);
}
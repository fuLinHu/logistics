package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.Syscode;
import com.aiwen.logistics.pojo.SyscodeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SyscodeMapper {
    int countByExample(SyscodeExample example);

    int deleteByExample(SyscodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Syscode record);

    int insertSelective(Syscode record);

    List<Syscode> selectByExampleWithRowbounds(SyscodeExample example, RowBounds rowBounds);

    List<Syscode> selectByExample(SyscodeExample example);

    Syscode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Syscode record, @Param("example") SyscodeExample example);

    int updateByExample(@Param("record") Syscode record, @Param("example") SyscodeExample example);

    int updateByPrimaryKeySelective(Syscode record);

    int updateByPrimaryKey(Syscode record);
}
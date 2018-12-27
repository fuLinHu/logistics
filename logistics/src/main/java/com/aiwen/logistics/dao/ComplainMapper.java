package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.Complain;
import com.aiwen.logistics.pojo.ComplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ComplainMapper {
    int countByExample(ComplainExample example);

    int deleteByExample(ComplainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Complain record);

    int insertSelective(Complain record);

    List<Complain> selectByExampleWithRowbounds(ComplainExample example, RowBounds rowBounds);

    List<Complain> selectByExample(ComplainExample example);

    Complain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByPrimaryKeySelective(Complain record);

    int updateByPrimaryKey(Complain record);
}
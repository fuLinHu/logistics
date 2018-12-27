package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.Evaluation;
import com.aiwen.logistics.pojo.EvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EvaluationMapper {
    int countByExample(EvaluationExample example);

    int deleteByExample(EvaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    List<Evaluation> selectByExampleWithRowbounds(EvaluationExample example, RowBounds rowBounds);

    List<Evaluation> selectByExample(EvaluationExample example);

    Evaluation selectByPrimaryKey(Integer id);

    Evaluation selectByOrderIdLand(Integer orderId);

    Evaluation selectByOrderIdOcean(Integer transportId);

    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKey(Evaluation record);
}
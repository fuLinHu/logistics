package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.Trajectory;
import com.aiwen.logistics.pojo.TrajectoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TrajectoryMapper {
    int countByExample(TrajectoryExample example);

    int deleteByExample(TrajectoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trajectory record);

    int insertSelective(Trajectory record);

    List<Trajectory> selectByExampleWithRowbounds(TrajectoryExample example, RowBounds rowBounds);

    List<Trajectory> selectByExample(TrajectoryExample example);

    Trajectory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trajectory record, @Param("example") TrajectoryExample example);

    int updateByExample(@Param("record") Trajectory record, @Param("example") TrajectoryExample example);

    int updateByPrimaryKeySelective(Trajectory record);

    int updateByPrimaryKey(Trajectory record);
}
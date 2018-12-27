package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.LandTransportation;
import com.aiwen.logistics.pojo.LandTransportationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface LandTransportationMapper {
    int countByExample(LandTransportationExample example);

    int deleteByExample(LandTransportationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LandTransportation record);

    int insertSelective(LandTransportation record);

    List<LandTransportation> selectByExampleWithRowbounds(LandTransportationExample example, RowBounds rowBounds);

    List<LandTransportation> selectByExample(LandTransportationExample example);

    LandTransportation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LandTransportation record, @Param("example") LandTransportationExample example);

    int updateByExample(@Param("record") LandTransportation record, @Param("example") LandTransportationExample example);

    int updateByPrimaryKeySelective(LandTransportation record);

    int updateByPrimaryKey(LandTransportation record);

//    List<Map<String,Object>> selectByStatus(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,@Param("status")Integer status,@Param("accountType") String accountType,@Param("userId") Integer userId,@Param("identityType") Integer identityType);

    List<Map<String,Object>> selectByStatus(Map<String,Object> map);

    List<Map<String,Object>> findTransportationByStatus(Map<String,Object> map);

    Integer countAllByCondition(Map<String,Object> map);
}
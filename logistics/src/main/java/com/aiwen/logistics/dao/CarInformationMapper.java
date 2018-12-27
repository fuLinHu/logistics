package com.aiwen.logistics.dao;


import com.aiwen.logistics.pojo.CarInformation;
import com.aiwen.logistics.pojo.CarInformationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface CarInformationMapper {
    int countByExample(CarInformationExample example);

    int deleteByExample(CarInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarInformation record);

    int insertSelective(CarInformation record);

    List<CarInformation> selectByExampleWithRowbounds(CarInformationExample example, RowBounds rowBounds);

    List<CarInformation> selectByExample(CarInformationExample example);

    CarInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarInformation record, @Param("example") CarInformationExample example);

    int updateByExample(@Param("record") CarInformation record, @Param("example") CarInformationExample example);

    int updateByPrimaryKeySelective(CarInformation record);

    int updateByPrimaryKey(CarInformation record);

    List<Map<String,Object>> findCarByCondition(@Param("carType") String carType,@Param("carLong") String carLong,@Param("carLoad") String carLoad);

    List<Map<String,Object>> findCarByStatus(@Param("userId") Integer userId);
}
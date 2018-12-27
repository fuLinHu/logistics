package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.DriverInformation;
import com.aiwen.logistics.pojo.DriverInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DriverInformationMapper {
    int countByExample(DriverInformationExample example);

    int deleteByExample(DriverInformationExample example);

    int deleteByPrimaryKey(Integer driverId);

    int insert(DriverInformation record);

    int insertSelective(DriverInformation record);

    List<DriverInformation> selectByExampleWithRowbounds(DriverInformationExample example, RowBounds rowBounds);

    List<DriverInformation> selectByExample(DriverInformationExample example);

    DriverInformation selectByPrimaryKey(Integer driverId);
    
    DriverInformation selectByCarId(Integer carId);

    int updateByExampleSelective(@Param("record") DriverInformation record, @Param("example") DriverInformationExample example);

    int updateByExample(@Param("record") DriverInformation record, @Param("example") DriverInformationExample example);

    int updateByPrimaryKeySelective(DriverInformation record);

    int updateByPrimaryKey(DriverInformation record);
}
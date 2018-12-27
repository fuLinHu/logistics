package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.CarInformation;
import com.aiwen.logistics.pojo.DriverInformation;

import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 17:35
 */
public interface ICarInformationService {
    List<CarInformation> findByUserId(Integer userId);

    Map<String,Object> findCarInformationById(Integer id);

    CarInformation findCarById(Integer carInformationId);

    List<Map<String,Object>> findCarByStatus(Integer userId);

    Map<String,Object> saveCarInformation(CarInformation carInformation);
    
    Map<String,Object> saveDriverInformation(DriverInformation driverInformation);

    Map<String,Object> updateCarInformation(CarInformation carInformation);
    
    Map<String,Object> updateDriverInformation(DriverInformation driverInformation);

    Map<String,Object> delectCarInformation(Integer delectCarId);

}

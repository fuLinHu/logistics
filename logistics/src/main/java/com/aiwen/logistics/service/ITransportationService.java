package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.*;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/4/25 17:43
 */
public interface ITransportationService {

    List<Map<String,Object>> findTransportationByStatusV(Integer status, String accountType, Integer userId, Integer identityType);

    List<Map<String,Object>> findTransportationByStatusT(UserFront userFront,Integer status, String carType, Double carLong, Double carLoad, Integer startRow, Integer endRow);

    Map<String,Object> saveTransportationAndCar(HttpServletRequest request, LandTransportation transportation, CarInformation carInformation);

    Map<String,Object> delectTransportation(Integer delectId);

    Map<String,Object> relineTransportation(Integer relineId);

    Map<String,Object> golineTransportation(Integer golineId);

    LandTransportation findTransportationById(Integer updateId);

    OceanCarriageInformation findOceanTransportationById(Integer updateId);

    Map<String,Object> updateTransportation(HttpServletRequest request, LandTransportation transportation ,CarInformation carInformation);

    Integer countAll(Integer status,String carType, Double carLong, Double carLoad);
}

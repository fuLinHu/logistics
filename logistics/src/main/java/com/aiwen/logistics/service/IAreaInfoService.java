package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.AreaInfo;

import java.util.List;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 18:00
 */
public interface IAreaInfoService {
    List<AreaInfo> findProvince();

    List<AreaInfo> findByProvince(String province);

    List<AreaInfo> findByCity(String city);

    AreaInfo findById(Integer id);

    List<AreaInfo> findBelonged(String AreaInfoId);
}

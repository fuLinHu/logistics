package com.aiwen.logistics.service;


import com.aiwen.logistics.pojo.HotFreight;
import com.aiwen.logistics.pojo.HotSource;
import com.aiwen.logistics.pojo.ShipDynamic;
import com.aiwen.logistics.pojo.imageManage;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/4/19.
 */
public interface ImageManageService {

    public List<imageManage> findByImageType (String imageType);

    public List<HotSource> findHotSource();

    public List<HotFreight> findHotFreight();

    public List<ShipDynamic> findShipDynamic();

}

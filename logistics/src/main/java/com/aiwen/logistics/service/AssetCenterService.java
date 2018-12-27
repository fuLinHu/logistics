package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.AssetVo;
import com.aiwen.logistics.pojo.OrderRelease;
import com.aiwen.logistics.pojo.UserAssets;
import com.aiwen.logistics.pojo.UserFront;

import java.util.List;

/**
 * Created by ASUS on 2018/5/5.
 */
public interface AssetCenterService {

    public AssetVo findAssetByUserFront(UserFront userFront);

    public List<OrderRelease> findOrderRelease(UserFront userFront,String start,String end,String type);

    public void saveAssets(int id, String amount,String rechargeType,String rechargeCode ,Integer flag);


    public List<UserAssets> findUserAssetsBy(Integer userId, Integer flag, String type,String start, String end);



}

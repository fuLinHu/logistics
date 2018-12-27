package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.OwnerAddress;
import com.aiwen.logistics.pojo.OwnerAddressExample;

import java.util.List;

/**
 * Created by ASUS on 2018/5/4.
 */
public interface OwnerAddressService {
    List<OwnerAddress> findOwnerAddressByExample(OwnerAddressExample example);

    int addOwnerAddress(Integer userId,String address);
}

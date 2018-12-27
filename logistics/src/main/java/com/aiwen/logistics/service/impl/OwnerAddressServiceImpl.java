package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.OwnerAddressMapper;
import com.aiwen.logistics.pojo.OwnerAddress;
import com.aiwen.logistics.pojo.OwnerAddressExample;
import com.aiwen.logistics.service.OwnerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2018/5/4.
 */
@Service
public class OwnerAddressServiceImpl implements OwnerAddressService {

    @Autowired
    private OwnerAddressMapper ownerAddressMapper;

    @Override
    public List<OwnerAddress> findOwnerAddressByExample(OwnerAddressExample example) {
        List<OwnerAddress> list=null;
        try {
            list=ownerAddressMapper.selectByExample(example);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int addOwnerAddress(Integer userId, String address) {
        int flag=0;
        try {
            OwnerAddress ownerAddress=new OwnerAddress();
            ownerAddress.setUserId(userId);
            ownerAddress.setAddress(address);
            ownerAddressMapper.insert(ownerAddress);
            flag=1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}

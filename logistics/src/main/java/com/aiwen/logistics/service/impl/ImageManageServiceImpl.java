package com.aiwen.logistics.service.impl;


import com.aiwen.logistics.dao.HotFreightMapper;
import com.aiwen.logistics.dao.HotSourceMapper;
import com.aiwen.logistics.dao.ImageManageMapper;
import com.aiwen.logistics.dao.ShipDynamicMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.ImageManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2018/4/19.
 */
@Service
public class ImageManageServiceImpl implements ImageManageService {

    @Autowired
    private ImageManageMapper imageManageMapper;
    @Autowired
    private HotSourceMapper hotSourceMapper;
    @Autowired
    private HotFreightMapper hotFreightMapper;
    @Autowired
    private ShipDynamicMapper shipDynamicMapper;


    @Override
    public List<imageManage> findByImageType(String imageType) {
        return this.imageManageMapper.findByImageType(imageType);
    }

    @Override
    public List<HotSource> findHotSource() {
        HotSourceExample example=new HotSourceExample();
        HotSourceExample.Criteria criteria=example.createCriteria();
        criteria.andAccordStateEqualTo(1);
        example.setOrderByClause("release_date");
        List<HotSource> list=hotSourceMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<HotFreight> findHotFreight() {
        HotFreightExample example=new HotFreightExample();
        HotFreightExample.Criteria criteria=example.createCriteria();
        criteria.andAccordStateEqualTo(1);
        example.setOrderByClause("release_date");
        List<HotFreight> list=hotFreightMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<ShipDynamic> findShipDynamic() {
        ShipDynamicExample exampl=new ShipDynamicExample();
        ShipDynamicExample.Criteria criteria=exampl.createCriteria();
        criteria.andAccordStateEqualTo(1);
        exampl.setOrderByClause("start_port_time");
        List<ShipDynamic> list=shipDynamicMapper.selectByExample(exampl);
        return list;
    }
}

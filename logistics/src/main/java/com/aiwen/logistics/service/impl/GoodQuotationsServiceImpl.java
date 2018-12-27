package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.GoodQuotationsMapper;
import com.aiwen.logistics.pojo.GoodQuotations;
import com.aiwen.logistics.pojo.GoodQuotationsExample;
import com.aiwen.logistics.service.GoodQuotationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2018/4/26.
 */
@Service
public class GoodQuotationsServiceImpl implements GoodQuotationsService {

    @Autowired
    private GoodQuotationsMapper goodQuotationsMapper;

    @Override
    public List<GoodQuotations> findGoodQuotationsList(GoodQuotationsExample goodQuotations) {
        return goodQuotationsMapper.selectByExample(goodQuotations);
    }
}

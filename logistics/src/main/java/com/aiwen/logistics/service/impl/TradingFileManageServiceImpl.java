package com.aiwen.logistics.service.impl;


import com.aiwen.logistics.dao.TradingFileManageMapper;
import com.aiwen.logistics.pojo.Tradingfilemanage;
import com.aiwen.logistics.service.TradingFileManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2018/4/19.
 */
@Service
public class TradingFileManageServiceImpl implements TradingFileManageService {
    @Autowired
    private TradingFileManageMapper tradingFileManageMapper;

    @Override
    public int save(Tradingfilemanage tradingfilemanage) {
        return this.tradingFileManageMapper.insertSelective(tradingfilemanage);
    }
}

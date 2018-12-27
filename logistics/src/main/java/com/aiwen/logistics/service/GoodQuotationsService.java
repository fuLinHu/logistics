package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.GoodQuotations;
import com.aiwen.logistics.pojo.GoodQuotationsExample;

import java.util.List;

/**
 * Created by ASUS on 2018/4/26.
 */
public interface GoodQuotationsService {
    public List<GoodQuotations> findGoodQuotationsList(GoodQuotationsExample goodQuotations);
}

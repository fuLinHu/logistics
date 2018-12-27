package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.StatisticsVo;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ASUS on 2018/4/28.
 */
public interface StatisticsService {
    public StatisticsVo statistics(HttpServletRequest request);
}

package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.Syscode;

import java.util.List;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 17:42
 */
public interface ISyscodeService {
    List<Syscode> findAllByType(String type);
}

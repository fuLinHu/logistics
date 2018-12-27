package com.aiwen.logistics.dao;


import com.aiwen.logistics.pojo.imageManage;

import java.util.List;

/**
 * Created by admin on 2018/4/25.
 */
public interface ImageManageMapper {
    List<imageManage> findByImageType (String imangeType);
}

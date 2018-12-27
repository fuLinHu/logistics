package com.aiwen.logistics.dao;


import com.aiwen.logistics.pojo.FileManage;

import java.util.List;

/**
 * Created by admin on 2018/4/25.
 */
public interface FileManageMapper {
    List<FileManage> findAll();

    FileManage selectById(Integer id);

    List<FileManage>selectByFormTemplateTypeId(String formTemplateTypeId);
}

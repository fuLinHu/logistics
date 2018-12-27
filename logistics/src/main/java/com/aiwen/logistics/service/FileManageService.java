package com.aiwen.logistics.service;


import com.aiwen.logistics.pojo.FileManage;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/4/19.
 */
public interface FileManageService {
    public List<FileManage> findAll();

    public FileManage findById(Integer id);

    public List<FileManage> findByFormTemplateTypeId(String formTemplateTypeId);
}

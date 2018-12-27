package com.aiwen.logistics.service.impl;


import com.aiwen.logistics.dao.FileManageMapper;
import com.aiwen.logistics.pojo.FileManage;
import com.aiwen.logistics.service.FileManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/4/19.
 */
@Service
public class FileManageServiceImpl implements FileManageService {
    @Autowired
    private FileManageMapper fileManageMapper;

    @Override
    public List<FileManage> findAll() {
        return this.fileManageMapper.findAll();
    }

    @Override
    public FileManage findById(Integer id) {
        return this.fileManageMapper.selectById(id);
    }

    @Override
    public List<FileManage> findByFormTemplateTypeId(String formTemplateTypeId) {
        return this.fileManageMapper.selectByFormTemplateTypeId(formTemplateTypeId);
    }


}

package com.aiwen.logistics.service.impl;


import com.aiwen.logistics.dao.FileManageMapper;
import com.aiwen.logistics.dao.FormTemplateTypeMapper;
import com.aiwen.logistics.pojo.FileManage;
import com.aiwen.logistics.pojo.formTemplateType;
import com.aiwen.logistics.service.FileManageService;
import com.aiwen.logistics.service.FormTemplateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2018/4/19.
 */
@Service
public class FormTemplateTypeServiceImpl implements FormTemplateTypeService {

    @Autowired
    private FormTemplateTypeMapper formTemplateTypeMapper;

    @Override
    public List<formTemplateType> findList(String type) {
        return this.formTemplateTypeMapper.selectByType(type);
    }
}

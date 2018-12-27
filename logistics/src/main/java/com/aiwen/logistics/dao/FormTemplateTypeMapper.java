package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.formTemplateType;

import java.util.List;

/**
 * Created by admin on 2018/5/9.
 */
public interface FormTemplateTypeMapper {
    List<formTemplateType> selectByType(String type);
}

package com.aiwen.logistics.service;



import com.aiwen.logistics.pojo.formTemplateType;

import java.util.List;

/**
 * Created by ASUS on 2018/4/19.
 */
public interface FormTemplateTypeService {

    List<formTemplateType> findList(String type);
}

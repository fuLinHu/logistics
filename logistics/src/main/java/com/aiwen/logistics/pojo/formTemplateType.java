package com.aiwen.logistics.pojo;

import java.util.Date;

/**
 * Created by admin on 2018/5/9.
 */
public class formTemplateType {
    private Integer id;
    private String fromTypeName;
    private String fromTypeVal;
    private String type;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromTypeName() {
        return fromTypeName;
    }

    public void setFromTypeName(String fromTypeName) {
        this.fromTypeName = fromTypeName;
    }

    public String getFromTypeVal() {
        return fromTypeVal;
    }

    public void setFromTypeVal(String fromTypeVal) {
        this.fromTypeVal = fromTypeVal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

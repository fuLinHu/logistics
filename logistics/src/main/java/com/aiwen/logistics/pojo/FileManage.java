package com.aiwen.logistics.pojo;

import java.util.Date;

/**
 * Created by admin on 2018/5/4.
 */
public class FileManage {
    private  Integer id;
    private  String fileName;
    private  String fileUrl;
    private  Date createTime;
    private String formTemplateTypeId;
    private String oldFileName;
    private String fileType;

    public String getFormTemplateTypeId() {
        return formTemplateTypeId;
    }

    public void setFormTemplateTypeId(String formTemplateTypeId) {
        this.formTemplateTypeId = formTemplateTypeId;
    }

    public String getOldFileName() {
        return oldFileName;
    }

    public void setOldFileName(String oldFileName) {
        this.oldFileName = oldFileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

package com.aiwen.logistics.pojo;

/**
 * Created by admin on 2018/4/21.
 */
public class imageManage {
    private Integer id;

    private String imageUrl;

    private String imageType;//轮播图类型 0是首页轮播图1是贸易轮播图

    private Integer sort;//轮播图显示顺序

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}

package com.aiwen.logistics.pojo;

import java.util.Date;

public class UserAssets {
    private Integer assetsId;

    private Integer userId;

    private Double rechargeAmount;

    private String rechargeTime;

    private Double allAssets;

    private String updateTime;

    private Integer flag;

    private String rechargeType; //1:支付宝2：微信3：线下

    private String rechargeCode;//

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getRechargeCode() {
        return rechargeCode;
    }

    public void setRechargeCode(String rechargeCode) {
        this.rechargeCode = rechargeCode;
    }

    public Integer getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(Integer assetsId) {
        this.assetsId = assetsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime == null ? null : rechargeTime.trim();
    }

    public Double getAllAssets() {
        return allAssets;
    }

    public void setAllAssets(Double allAssets) {
        this.allAssets = allAssets;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
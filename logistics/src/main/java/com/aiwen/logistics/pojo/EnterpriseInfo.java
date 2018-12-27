package com.aiwen.logistics.pojo;

public class EnterpriseInfo {
    private Integer enterpriseId;

    private Integer userId;

    private String enterpriseName;

    private Integer deleteType;

    private Integer syscode;

    private String registeredAddress;

    private String corporateAptitude;

    private String enterpriseTel;

    private String enterpriseSite;

    private String alipayAccount;
    private String wxpayAccount;
    private String bankAccount;
    private String openBank;
    private String openName;

    private String  alipayAccountRealName;

    public String getAlipayAccountRealName() {
        return alipayAccountRealName;
    }

    public void setAlipayAccountRealName(String alipayAccountRealName) {
        this.alipayAccountRealName = alipayAccountRealName;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getWxpayAccount() {
        return wxpayAccount;
    }

    public void setWxpayAccount(String wxpayAccount) {
        this.wxpayAccount = wxpayAccount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getOpenName() {
        return openName;
    }

    public void setOpenName(String openName) {
        this.openName = openName;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public Integer getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(Integer deleteType) {
        this.deleteType = deleteType;
    }

    public Integer getSyscode() {
        return syscode;
    }

    public void setSyscode(Integer syscode) {
        this.syscode = syscode;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    public String getCorporateAptitude() {
        return corporateAptitude;
    }

    public void setCorporateAptitude(String corporateAptitude) {
        this.corporateAptitude = corporateAptitude == null ? null : corporateAptitude.trim();
    }

    public String getEnterpriseTel() {
        return enterpriseTel;
    }

    public void setEnterpriseTel(String enterpriseTel) {
        this.enterpriseTel = enterpriseTel == null ? null : enterpriseTel.trim();
    }

    public String getEnterpriseSite() {
        return enterpriseSite;
    }

    public void setEnterpriseSite(String enterpriseSite) {
        this.enterpriseSite = enterpriseSite == null ? null : enterpriseSite.trim();
    }
}
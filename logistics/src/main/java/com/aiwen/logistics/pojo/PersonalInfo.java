package com.aiwen.logistics.pojo;

public class PersonalInfo {
    private Integer personalInfoId;

    private Integer userId;

    private String tel;

    private String city;

    private String address;

    private String idcard;

    private String bankCard;

    private String bankName;

    private String alipayAccount;

    private String wxpayAccount;

    private String alipayAccountRealName;


    public String getAlipayAccountRealName() {
        return alipayAccountRealName;
    }

    public void setAlipayAccountRealName(String alipayAccountRealName) {
        this.alipayAccountRealName = alipayAccountRealName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public Integer getPersonalInfoId() {
        return personalInfoId;
    }

    public void setPersonalInfoId(Integer personalInfoId) {
        this.personalInfoId = personalInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }
}
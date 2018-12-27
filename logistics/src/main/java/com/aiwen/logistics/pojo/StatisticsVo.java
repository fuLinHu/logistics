package com.aiwen.logistics.pojo;

/**
 * Created by ASUS on 2018/4/28.
 */
public class StatisticsVo {
    private String userName; //用户名
    private Integer identityType;  // 1、公司  2、个人
    private String LoginTime;  //最后登录时间
    private String telePhone;  //手机号
    private String region;  //所属区域
    private String accountBalance;  //账户余额
    private String tradeNoteNum;  //累计成交运单
    private String volumeGoods;  //累计成交货量
    private String settledWaybill;  //累计已结算运单
    private String settledAmount;   //累计已结算金额

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getLoginTime() {
        return LoginTime;
    }

    public void setLoginTime(String loginTime) {
        LoginTime = loginTime;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getTradeNoteNum() {
        return tradeNoteNum;
    }

    public void setTradeNoteNum(String tradeNoteNum) {
        this.tradeNoteNum = tradeNoteNum;
    }

    public String getVolumeGoods() {
        return volumeGoods;
    }

    public void setVolumeGoods(String volumeGoods) {
        this.volumeGoods = volumeGoods;
    }

    public String getSettledWaybill() {
        return settledWaybill;
    }

    public void setSettledWaybill(String settledWaybill) {
        this.settledWaybill = settledWaybill;
    }

    public String getSettledAmount() {
        return settledAmount;
    }

    public void setSettledAmount(String settledAmount) {
        this.settledAmount = settledAmount;
    }
}

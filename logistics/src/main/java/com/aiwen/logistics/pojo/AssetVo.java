package com.aiwen.logistics.pojo;

/**
 * Created by ASUS on 2018/5/5.
 */
public class AssetVo {
    private String accountBalance; //账户余额
    private String consumption; //本月消费
    private String SeaborneConsumption; //本月海运消费
    private String roadConsumption; //本月公路消费
    private String rechargeAmount; //本月充值金额
    private String availableAmount; //本月可用金额
    private String monthlyIncome; //本月收入
    private String totalIncome; //总收入
    private String flag; //标识 1 、表示货主    2、表示承运方

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getSeaborneConsumption() {
        return SeaborneConsumption;
    }

    public void setSeaborneConsumption(String seaborneConsumption) {
        SeaborneConsumption = seaborneConsumption;
    }

    public String getRoadConsumption() {
        return roadConsumption;
    }

    public void setRoadConsumption(String roadConsumption) {
        this.roadConsumption = roadConsumption;
    }

    public String getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(String rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(String totalIncome) {
        this.totalIncome = totalIncome;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}

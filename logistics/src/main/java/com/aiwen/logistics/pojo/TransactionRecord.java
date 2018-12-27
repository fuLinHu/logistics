package com.aiwen.logistics.pojo;

public class TransactionRecord {
    private Integer transactionRecordId;

    private Integer transactionCode;

    private Integer userId;

    private Integer transactionType;

    private String createTime;

    private Double transactionAmount;

    public Integer getTransactionRecordId() {
        return transactionRecordId;
    }

    public void setTransactionRecordId(Integer transactionRecordId) {
        this.transactionRecordId = transactionRecordId;
    }

    public Integer getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(Integer transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
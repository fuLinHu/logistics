package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderRelease {
    private Integer id;

    private Integer ordersFlag;

    private Double ordersAmount;

    private String ordersNum;

    private Integer isInvoice;

    private Integer invoiceId;

    private Integer orderReleaseSourceId;

    private String createTime;

    private String completeTime;

    private Integer transportMode;

    private Integer transportId;

    private String startAddress;

    private String arriveAddress;

    private Integer carrierId;

    private Integer ownerId;

    private String userName;

    private String transactionTime;

    private String weight;

    private Double unitPrice;

    private Double offer;

    private Double otherAmount;

    private Double actualWeight;

    private String company;

    private String remark;

    private String deliveryTime;

    private String takeDeliveryTime;

    private String orderDocument;

    private String orderDocuments;

    private ReleaseSource releaseSource;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ReleaseSource getReleaseSource() {
        return releaseSource;
    }

    public void setReleaseSource(ReleaseSource releaseSource) {
        this.releaseSource = releaseSource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersFlag() {
        return ordersFlag;
    }

    public void setOrdersFlag(Integer ordersFlag) {
        this.ordersFlag = ordersFlag;
    }

    public Double getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(Double ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    public String getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(String ordersNum) {
        this.ordersNum = ordersNum == null ? null : ordersNum.trim();
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getOrderReleaseSourceId() {
        return orderReleaseSourceId;
    }

    public void setOrderReleaseSourceId(Integer orderReleaseSourceId) {
        this.orderReleaseSourceId = orderReleaseSourceId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime == null ? null : completeTime.trim();
    }

    public Integer getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(Integer transportMode) {
        this.transportMode = transportMode;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress == null ? null : startAddress.trim();
    }

    public String getArriveAddress() {
        return arriveAddress;
    }

    public void setArriveAddress(String arriveAddress) {
        this.arriveAddress = arriveAddress == null ? null : arriveAddress.trim();
    }

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime == null ? null : transactionTime.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    public Double getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(Double otherAmount) {
        this.otherAmount = otherAmount;
    }

    public Double getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(Double actualWeight) {
        this.actualWeight = actualWeight;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getTakeDeliveryTime() {
        return takeDeliveryTime;
    }

    public void setTakeDeliveryTime(String takeDeliveryTime) {
        this.takeDeliveryTime = takeDeliveryTime;
    }

    public String getOrderDocument() {
        return orderDocument;
    }

    public void setOrderDocument(String orderDocument) {
        this.orderDocument = orderDocument;
    }

    public String getOrderDocuments() {
        return orderDocuments;
    }

    public void setOrderDocuments(String orderDocuments) {
        this.orderDocuments = orderDocuments;
    }
}
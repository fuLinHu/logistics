package com.aiwen.logistics.pojo;

public class Evaluation {
    private Integer id;

    private String ordersNum;

    private String startAddress;

    private String arriveAddress;

    private String carBrand;

    private String carrierName;

    private Integer overallEvaluation;

    private Integer punctuality;

    private Integer transportIntegrity;

    private String otherMessages;

    private Integer orderId;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(String ordersNum) {
        this.ordersNum = ordersNum == null ? null : ordersNum.trim();
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName == null ? null : carrierName.trim();
    }

    public Integer getOverallEvaluation() {
        return overallEvaluation;
    }

    public void setOverallEvaluation(Integer overallEvaluation) {
        this.overallEvaluation = overallEvaluation;
    }

    public Integer getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(Integer punctuality) {
        this.punctuality = punctuality;
    }

    public Integer getTransportIntegrity() {
        return transportIntegrity;
    }

    public void setTransportIntegrity(Integer transportIntegrity) {
        this.transportIntegrity = transportIntegrity;
    }

    public String getOtherMessages() {
        return otherMessages;
    }

    public void setOtherMessages(String otherMessages) {
        this.otherMessages = otherMessages == null ? null : otherMessages.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
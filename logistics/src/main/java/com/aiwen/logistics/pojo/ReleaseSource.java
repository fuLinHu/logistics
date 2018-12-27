package com.aiwen.logistics.pojo;

public class ReleaseSource {
    private Integer sourceId;

    private Integer userId;

    private String startAddress;

    private String arriveAddress;

    private String pack;

    private String goods;

    private String weight;

    private String createTime;

    private String endTime;

    private Integer transportType;

    private String supplier;

    private Integer bidding;

    private Integer orderState;

    private String returnReason;

    private String startName;

    private String startPhone;

    private String arriveName;

    private String arrivePhone;

    private Double expOffer;

    private Double platOffer;

    private String strSupplier;

    private UserFront userFront;

    private String endDate;

    public UserFront getUserFront() {
        return userFront;
    }

    public void setUserFront(UserFront userFront) {
        this.userFront = userFront;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack == null ? null : pack.trim();
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Integer getBidding() {
        return bidding;
    }

    public void setBidding(Integer bidding) {
        this.bidding = bidding;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public String getStartPhone() {
        return startPhone;
    }

    public void setStartPhone(String startPhone) {
        this.startPhone = startPhone;
    }

    public String getArriveName() {
        return arriveName;
    }

    public void setArriveName(String arriveName) {
        this.arriveName = arriveName;
    }

    public String getArrivePhone() {
        return arrivePhone;
    }

    public void setArrivePhone(String arrivePhone) {
        this.arrivePhone = arrivePhone;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public Double getExpOffer() {
        return expOffer;
    }

    public void setExpOffer(Double expOffer) {
        this.expOffer = expOffer;
    }

    public Double getPlatOffer() {
        return platOffer;
    }

    public void setPlatOffer(Double platOffer) {
        this.platOffer = platOffer;
    }

    public String getStrSupplier() {
        return strSupplier;
    }

    public void setStrSupplier(String strSupplier) {
        this.strSupplier = strSupplier;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
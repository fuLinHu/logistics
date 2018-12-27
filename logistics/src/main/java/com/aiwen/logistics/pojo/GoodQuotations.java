package com.aiwen.logistics.pojo;

public class GoodQuotations {
    private Integer id;

    private String goodCode;

    private String goodName;

    private Double openPrice;

    private Double maxPrice;

    private Double minPrice;

    private Double buyPrice;

    private Double sellPrice;

    private Double newPrice;

    private Double riseAndFall;

    private Double turnover;

    private Integer purchaseSalesVolum;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode == null ? null : goodCode.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public Double getRiseAndFall() {
        return riseAndFall;
    }

    public void setRiseAndFall(Double riseAndFall) {
        this.riseAndFall = riseAndFall;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public Integer getPurchaseSalesVolum() {
        return purchaseSalesVolum;
    }

    public void setPurchaseSalesVolum(Integer purchaseSalesVolum) {
        this.purchaseSalesVolum = purchaseSalesVolum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
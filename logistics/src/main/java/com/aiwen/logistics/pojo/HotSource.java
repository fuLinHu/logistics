package com.aiwen.logistics.pojo;

import java.util.Date;

public class HotSource {
    private Integer id;

    private Date releaseDate;

    private Date endDate;

    private Integer freightWay;

    private String startPlace;

    private String destination;

    private String descriptionGoods;

    private Double goodsWeight;

    private Integer stateGoods;

    private Integer accordState;

    private Date creatDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getFreightWay() {
        return freightWay;
    }

    public void setFreightWay(Integer freightWay) {
        this.freightWay = freightWay;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace == null ? null : startPlace.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getDescriptionGoods() {
        return descriptionGoods;
    }

    public void setDescriptionGoods(String descriptionGoods) {
        this.descriptionGoods = descriptionGoods == null ? null : descriptionGoods.trim();
    }

    public Double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Integer getStateGoods() {
        return stateGoods;
    }

    public void setStateGoods(Integer stateGoods) {
        this.stateGoods = stateGoods;
    }

    public Integer getAccordState() {
        return accordState;
    }

    public void setAccordState(Integer accordState) {
        this.accordState = accordState;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
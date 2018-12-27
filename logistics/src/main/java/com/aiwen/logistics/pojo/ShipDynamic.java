package com.aiwen.logistics.pojo;

import java.util.Date;

public class ShipDynamic {
    private Integer id;

    private String shipName;

    private String voyageNumber;

    private String wharf;

    private Date startPortTime;

    private Date endPortTime;

    private Date shutoffBoxTime;

    private Date boxCutoffTime;

    private Date expectShipTime;

    private Date expectOpenShipTime;

    private Integer accordState;

    private Date creatDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber == null ? null : voyageNumber.trim();
    }

    public String getWharf() {
        return wharf;
    }

    public void setWharf(String wharf) {
        this.wharf = wharf == null ? null : wharf.trim();
    }

    public Date getStartPortTime() {
        return startPortTime;
    }

    public void setStartPortTime(Date startPortTime) {
        this.startPortTime = startPortTime;
    }

    public Date getEndPortTime() {
        return endPortTime;
    }

    public void setEndPortTime(Date endPortTime) {
        this.endPortTime = endPortTime;
    }

    public Date getShutoffBoxTime() {
        return shutoffBoxTime;
    }

    public void setShutoffBoxTime(Date shutoffBoxTime) {
        this.shutoffBoxTime = shutoffBoxTime;
    }

    public Date getBoxCutoffTime() {
        return boxCutoffTime;
    }

    public void setBoxCutoffTime(Date boxCutoffTime) {
        this.boxCutoffTime = boxCutoffTime;
    }

    public Date getExpectShipTime() {
        return expectShipTime;
    }

    public void setExpectShipTime(Date expectShipTime) {
        this.expectShipTime = expectShipTime;
    }

    public Date getExpectOpenShipTime() {
        return expectOpenShipTime;
    }

    public void setExpectOpenShipTime(Date expectOpenShipTime) {
        this.expectOpenShipTime = expectOpenShipTime;
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
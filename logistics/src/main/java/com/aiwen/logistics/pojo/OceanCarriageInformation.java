package com.aiwen.logistics.pojo;

public class OceanCarriageInformation {
    private Integer id;

    private String voyage;

    private String closingTime;

    private String sailingTime;

    private String billNumber;

    private String containerNumber;

    private String containerType;

    private String containerVolume;

    private String contacts;

    private String contactWay;

    private String userName;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage == null ? null : voyage.trim();
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime == null ? null : closingTime.trim();
    }

    public String getSailingTime() {
        return sailingTime;
    }

    public void setSailingTime(String sailingTime) {
        this.sailingTime = sailingTime == null ? null : sailingTime.trim();
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber == null ? null : billNumber.trim();
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber == null ? null : containerNumber.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getContainerVolume() {
        return containerVolume;
    }

    public void setContainerVolume(String containerVolume) {
        this.containerVolume = containerVolume == null ? null : containerVolume.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay == null ? null : contactWay.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
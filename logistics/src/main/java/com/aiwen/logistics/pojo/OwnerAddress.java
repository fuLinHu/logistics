package com.aiwen.logistics.pojo;

public class OwnerAddress {
    private Integer ownerAddressId;

    private Integer userId;

    private String address;

    public Integer getOwnerAddressId() {
        return ownerAddressId;
    }

    public void setOwnerAddressId(Integer ownerAddressId) {
        this.ownerAddressId = ownerAddressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}
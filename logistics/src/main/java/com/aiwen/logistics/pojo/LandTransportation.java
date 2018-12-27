package com.aiwen.logistics.pojo;

public class LandTransportation {
    private Integer id;

    private String carBrand;

    private Integer carInformationId;

    private String departureStartTime;

    private String departureEndTime;

    private String departureProvince;

    private String departureCity;

    private String departureArea;

    private String destinationProvince;

    private String destinationCity;

    private String destinationArea;

    private Integer status;

    private String userName;

    private String departure;

    private String destination;

    private Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public Integer getCarInformationId() {
        return carInformationId;
    }

    public void setCarInformationId(Integer carInformationId) {
        this.carInformationId = carInformationId;
    }

    public String getDepartureStartTime() {
        return departureStartTime;
    }

    public void setDepartureStartTime(String departureStartTime) {
        this.departureStartTime = departureStartTime == null ? null : departureStartTime.trim();
    }

    public String getDepartureEndTime() {
        return departureEndTime;
    }

    public void setDepartureEndTime(String departureEndTime) {
        this.departureEndTime = departureEndTime == null ? null : departureEndTime.trim();
    }

    public String getDepartureProvince() {
        return departureProvince;
    }

    public void setDepartureProvince(String departureProvince) {
        this.departureProvince = departureProvince == null ? null : departureProvince.trim();
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity == null ? null : departureCity.trim();
    }

    public String getDepartureArea() {
        return departureArea;
    }

    public void setDepartureArea(String departureArea) {
        this.departureArea = departureArea == null ? null : departureArea.trim();
    }

    public String getDestinationProvince() {
        return destinationProvince;
    }

    public void setDestinationProvince(String destinationProvince) {
        this.destinationProvince = destinationProvince == null ? null : destinationProvince.trim();
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity == null ? null : destinationCity.trim();
    }

    public String getDestinationArea() {
        return destinationArea;
    }

    public void setDestinationArea(String destinationArea) {
        this.destinationArea = destinationArea == null ? null : destinationArea.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure == null ? null : departure.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
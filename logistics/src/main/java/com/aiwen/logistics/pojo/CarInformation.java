package com.aiwen.logistics.pojo;

public class CarInformation {
    private Integer id;

    private Integer userId;

    private String userName;

    private String phone;

    private String carBrand;

    private String carType;

    private Double carLong;

    private Double carWidth;

    private Double carHigh;

    private Double carLoad;

    private String transportProve;

    private String transportDate;

    private String license;

    private String drivingCardPhotosZ;

    private String drivingCardPhotosF;

    private String carFrontPhoto;

    private String transportProvePhoto;

    private Integer status;

    private Integer statu;

    private String reasion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public Double getCarLong() {
        return carLong;
    }

    public void setCarLong(Double carLong) {
        this.carLong = carLong;
    }

    public Double getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(Double carWidth) {
        this.carWidth = carWidth;
    }

    public Double getCarHigh() {
        return carHigh;
    }

    public void setCarHigh(Double carHigh) {
        this.carHigh = carHigh;
    }

    public Double getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(Double carLoad) {
        this.carLoad = carLoad;
    }

    public String getTransportProve() {
        return transportProve;
    }

    public void setTransportProve(String transportProve) {
        this.transportProve = transportProve == null ? null : transportProve.trim();
    }

    public String getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(String transportDate) {
        this.transportDate = transportDate == null ? null : transportDate.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getDrivingCardPhotosZ() {
        return drivingCardPhotosZ;
    }

    public void setDrivingCardPhotosZ(String drivingCardPhotosZ) {
        this.drivingCardPhotosZ = drivingCardPhotosZ == null ? null : drivingCardPhotosZ.trim();
    }

    public String getDrivingCardPhotosF() {
        return drivingCardPhotosF;
    }

    public void setDrivingCardPhotosF(String drivingCardPhotosF) {
        this.drivingCardPhotosF = drivingCardPhotosF == null ? null : drivingCardPhotosF.trim();
    }

    public String getCarFrontPhoto() {
        return carFrontPhoto;
    }

    public void setCarFrontPhoto(String carFrontPhoto) {
        this.carFrontPhoto = carFrontPhoto == null ? null : carFrontPhoto.trim();
    }

    public String getTransportProvePhoto() {
        return transportProvePhoto;
    }

    public void setTransportProvePhoto(String transportProvePhoto) {
        this.transportProvePhoto = transportProvePhoto == null ? null : transportProvePhoto.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public String getReasion() {
        return reasion;
    }

    public void setReasion(String reasion) {
        this.reasion = reasion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CarInformation{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carType='" + carType + '\'' +
                ", carLong=" + carLong +
                ", carWidth=" + carWidth +
                ", carHigh=" + carHigh +
                ", carLoad=" + carLoad +
                ", transportProve='" + transportProve + '\'' +
                ", transportDate='" + transportDate + '\'' +
                ", license='" + license + '\'' +
                ", drivingCardPhotosZ='" + drivingCardPhotosZ + '\'' +
                ", drivingCardPhotosF='" + drivingCardPhotosF + '\'' +
                ", carFrontPhoto='" + carFrontPhoto + '\'' +
                ", transportProvePhoto='" + transportProvePhoto + '\'' +
                ", status=" + status +
                ", statu=" + statu +
                ", reasion=" + reasion +
                '}';
    }
}
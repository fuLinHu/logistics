package com.aiwen.logistics.pojo;

public class DriverInformation {
    private Integer driverId;

    private String driverName;

    private String birthDate;

    private String idCard;

    private String driverTel;

    private String registeredResidenceProvince;

    private String registeredResidenceCity;

    private String registeredResidenceTown;

    private String drivingLicenseIssuePlace;

    private String drivingLicenseEffectiveDate;

    private String contactAddress;

    private String emergencyContactName;

    private String emergencyContactTel;

    private String idPhotoZ;

    private String idPhotoF;

    private String drivingLicenseMasterPhoto;

    private String drivingLicenseAppendixPhoto;

    private Integer carId;

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getDriverTel() {
        return driverTel;
    }

    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel == null ? null : driverTel.trim();
    }

    public String getRegisteredResidenceProvince() {
        return registeredResidenceProvince;
    }

    public void setRegisteredResidenceProvince(String registeredResidenceProvince) {
        this.registeredResidenceProvince = registeredResidenceProvince == null ? null : registeredResidenceProvince.trim();
    }

    public String getRegisteredResidenceCity() {
        return registeredResidenceCity;
    }

    public void setRegisteredResidenceCity(String registeredResidenceCity) {
        this.registeredResidenceCity = registeredResidenceCity == null ? null : registeredResidenceCity.trim();
    }

    public String getRegisteredResidenceTown() {
        return registeredResidenceTown;
    }

    public void setRegisteredResidenceTown(String registeredResidenceTown) {
        this.registeredResidenceTown = registeredResidenceTown == null ? null : registeredResidenceTown.trim();
    }

    public String getDrivingLicenseIssuePlace() {
        return drivingLicenseIssuePlace;
    }

    public void setDrivingLicenseIssuePlace(String drivingLicenseIssuePlace) {
        this.drivingLicenseIssuePlace = drivingLicenseIssuePlace == null ? null : drivingLicenseIssuePlace.trim();
    }

    public String getDrivingLicenseEffectiveDate() {
        return drivingLicenseEffectiveDate;
    }

    public void setDrivingLicenseEffectiveDate(String drivingLicenseEffectiveDate) {
        this.drivingLicenseEffectiveDate = drivingLicenseEffectiveDate == null ? null : drivingLicenseEffectiveDate.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName == null ? null : emergencyContactName.trim();
    }

    public String getEmergencyContactTel() {
        return emergencyContactTel;
    }

    public void setEmergencyContactTel(String emergencyContactTel) {
        this.emergencyContactTel = emergencyContactTel == null ? null : emergencyContactTel.trim();
    }

    public String getIdPhotoZ() {
        return idPhotoZ;
    }

    public void setIdPhotoZ(String idPhotoZ) {
        this.idPhotoZ = idPhotoZ == null ? null : idPhotoZ.trim();
    }

    public String getIdPhotoF() {
        return idPhotoF;
    }

    public void setIdPhotoF(String idPhotoF) {
        this.idPhotoF = idPhotoF == null ? null : idPhotoF.trim();
    }

    public String getDrivingLicenseMasterPhoto() {
        return drivingLicenseMasterPhoto;
    }

    public void setDrivingLicenseMasterPhoto(String drivingLicenseMasterPhoto) {
        this.drivingLicenseMasterPhoto = drivingLicenseMasterPhoto == null ? null : drivingLicenseMasterPhoto.trim();
    }

    public String getDrivingLicenseAppendixPhoto() {
        return drivingLicenseAppendixPhoto;
    }

    public void setDrivingLicenseAppendixPhoto(String drivingLicenseAppendixPhoto) {
        this.drivingLicenseAppendixPhoto = drivingLicenseAppendixPhoto == null ? null : drivingLicenseAppendixPhoto.trim();
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}
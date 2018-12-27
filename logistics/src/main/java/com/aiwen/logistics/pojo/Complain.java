package com.aiwen.logistics.pojo;

public class Complain {
    private Integer id;

    private String ordersNum;

    private String problemDescription;

    private String detailedDescription;

    private String relatedAnnexes;

    private String eMail;

    private Integer orderId;

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

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription == null ? null : problemDescription.trim();
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription == null ? null : detailedDescription.trim();
    }

    public String getRelatedAnnexes() {
        return relatedAnnexes;
    }

    public void setRelatedAnnexes(String relatedAnnexes) {
        this.relatedAnnexes = relatedAnnexes == null ? null : relatedAnnexes.trim();
    }
    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
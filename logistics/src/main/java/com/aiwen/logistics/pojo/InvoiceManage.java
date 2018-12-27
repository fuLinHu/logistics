package com.aiwen.logistics.pojo;

public class InvoiceManage {
    private Integer id;

    private String invoiceType;

    private String invoiceContent;

    private String invoiceTitle;

    private String identifier;

    private String contactAddress;

    private String telephone;

    private String bankInformation;

    private String recipient;

    private String writePhone;

    private String recipientAddress;

    private String requisitionNum;

    private String createdTime;

    private Long money;

    private Integer userId;

    private Integer invoiceFlag;

    private Integer contOrder;

    public Integer getContOrder() {
        return contOrder;
    }

    public void setContOrder(Integer contOrder) {
        this.contOrder = contOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getBankInformation() {
        return bankInformation;
    }

    public void setBankInformation(String bankInformation) {
        this.bankInformation = bankInformation == null ? null : bankInformation.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public String getWritePhone() {
        return writePhone;
    }

    public void setWritePhone(String writePhone) {
        this.writePhone = writePhone == null ? null : writePhone.trim();
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress == null ? null : recipientAddress.trim();
    }

    public String getRequisitionNum() {
        return requisitionNum;
    }

    public void setRequisitionNum(String requisitionNum) {
        this.requisitionNum = requisitionNum == null ? null : requisitionNum.trim();
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getInvoiceFlag() {
        return invoiceFlag;
    }

    public void setInvoiceFlag(Integer invoiceFlag) {
        this.invoiceFlag = invoiceFlag;
    }
}
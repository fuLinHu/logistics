package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class InvoiceManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceManageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNull() {
            addCriterion("invoice_content is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNotNull() {
            addCriterion("invoice_content is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentEqualTo(String value) {
            addCriterion("invoice_content =", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotEqualTo(String value) {
            addCriterion("invoice_content <>", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThan(String value) {
            addCriterion("invoice_content >", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_content >=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThan(String value) {
            addCriterion("invoice_content <", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThanOrEqualTo(String value) {
            addCriterion("invoice_content <=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLike(String value) {
            addCriterion("invoice_content like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotLike(String value) {
            addCriterion("invoice_content not like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIn(List<String> values) {
            addCriterion("invoice_content in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotIn(List<String> values) {
            addCriterion("invoice_content not in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentBetween(String value1, String value2) {
            addCriterion("invoice_content between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotBetween(String value1, String value2) {
            addCriterion("invoice_content not between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("contact_address is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("contact_address =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("contact_address <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("contact_address >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contact_address >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("contact_address <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("contact_address <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("contact_address like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("contact_address not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("contact_address in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("contact_address not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("contact_address between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("contact_address not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andBankInformationIsNull() {
            addCriterion("bank_information is null");
            return (Criteria) this;
        }

        public Criteria andBankInformationIsNotNull() {
            addCriterion("bank_information is not null");
            return (Criteria) this;
        }

        public Criteria andBankInformationEqualTo(String value) {
            addCriterion("bank_information =", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationNotEqualTo(String value) {
            addCriterion("bank_information <>", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationGreaterThan(String value) {
            addCriterion("bank_information >", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationGreaterThanOrEqualTo(String value) {
            addCriterion("bank_information >=", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationLessThan(String value) {
            addCriterion("bank_information <", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationLessThanOrEqualTo(String value) {
            addCriterion("bank_information <=", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationLike(String value) {
            addCriterion("bank_information like", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationNotLike(String value) {
            addCriterion("bank_information not like", value, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationIn(List<String> values) {
            addCriterion("bank_information in", values, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationNotIn(List<String> values) {
            addCriterion("bank_information not in", values, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationBetween(String value1, String value2) {
            addCriterion("bank_information between", value1, value2, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andBankInformationNotBetween(String value1, String value2) {
            addCriterion("bank_information not between", value1, value2, "bankInformation");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("recipient is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("recipient is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("recipient =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("recipient <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("recipient >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("recipient >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("recipient <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("recipient <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("recipient like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("recipient not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("recipient in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("recipient not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("recipient between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("recipient not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andWritePhoneIsNull() {
            addCriterion("write_phone is null");
            return (Criteria) this;
        }

        public Criteria andWritePhoneIsNotNull() {
            addCriterion("write_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWritePhoneEqualTo(String value) {
            addCriterion("write_phone =", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneNotEqualTo(String value) {
            addCriterion("write_phone <>", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneGreaterThan(String value) {
            addCriterion("write_phone >", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("write_phone >=", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneLessThan(String value) {
            addCriterion("write_phone <", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneLessThanOrEqualTo(String value) {
            addCriterion("write_phone <=", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneLike(String value) {
            addCriterion("write_phone like", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneNotLike(String value) {
            addCriterion("write_phone not like", value, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneIn(List<String> values) {
            addCriterion("write_phone in", values, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneNotIn(List<String> values) {
            addCriterion("write_phone not in", values, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneBetween(String value1, String value2) {
            addCriterion("write_phone between", value1, value2, "writePhone");
            return (Criteria) this;
        }

        public Criteria andWritePhoneNotBetween(String value1, String value2) {
            addCriterion("write_phone not between", value1, value2, "writePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressIsNull() {
            addCriterion("recipient_address is null");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressIsNotNull() {
            addCriterion("recipient_address is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressEqualTo(String value) {
            addCriterion("recipient_address =", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotEqualTo(String value) {
            addCriterion("recipient_address <>", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressGreaterThan(String value) {
            addCriterion("recipient_address >", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("recipient_address >=", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressLessThan(String value) {
            addCriterion("recipient_address <", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressLessThanOrEqualTo(String value) {
            addCriterion("recipient_address <=", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressLike(String value) {
            addCriterion("recipient_address like", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotLike(String value) {
            addCriterion("recipient_address not like", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressIn(List<String> values) {
            addCriterion("recipient_address in", values, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotIn(List<String> values) {
            addCriterion("recipient_address not in", values, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressBetween(String value1, String value2) {
            addCriterion("recipient_address between", value1, value2, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotBetween(String value1, String value2) {
            addCriterion("recipient_address not between", value1, value2, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumIsNull() {
            addCriterion("requisition_num is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumIsNotNull() {
            addCriterion("requisition_num is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumEqualTo(String value) {
            addCriterion("requisition_num =", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumNotEqualTo(String value) {
            addCriterion("requisition_num <>", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumGreaterThan(String value) {
            addCriterion("requisition_num >", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_num >=", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumLessThan(String value) {
            addCriterion("requisition_num <", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumLessThanOrEqualTo(String value) {
            addCriterion("requisition_num <=", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumLike(String value) {
            addCriterion("requisition_num like", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumNotLike(String value) {
            addCriterion("requisition_num not like", value, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumIn(List<String> values) {
            addCriterion("requisition_num in", values, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumNotIn(List<String> values) {
            addCriterion("requisition_num not in", values, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumBetween(String value1, String value2) {
            addCriterion("requisition_num between", value1, value2, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andRequisitionNumNotBetween(String value1, String value2) {
            addCriterion("requisition_num not between", value1, value2, "requisitionNum");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(String value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(String value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(String value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(String value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLike(String value) {
            addCriterion("created_time like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotLike(String value) {
            addCriterion("created_time not like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<String> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<String> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(String value1, String value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Long value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Long value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Long value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Long value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Long value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Long> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Long> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Long value1, Long value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Long value1, Long value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIsNull() {
            addCriterion("invoice_flag is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIsNotNull() {
            addCriterion("invoice_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagEqualTo(Integer value) {
            addCriterion("invoice_flag =", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotEqualTo(Integer value) {
            addCriterion("invoice_flag <>", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagGreaterThan(Integer value) {
            addCriterion("invoice_flag >", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_flag >=", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagLessThan(Integer value) {
            addCriterion("invoice_flag <", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_flag <=", value, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagIn(List<Integer> values) {
            addCriterion("invoice_flag in", values, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotIn(List<Integer> values) {
            addCriterion("invoice_flag not in", values, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagBetween(Integer value1, Integer value2) {
            addCriterion("invoice_flag between", value1, value2, "invoiceFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_flag not between", value1, value2, "invoiceFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
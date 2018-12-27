package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class DriverInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverInformationExample() {
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

        public Criteria andDriverIdIsNull() {
            addCriterion("driverId is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driverId is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Integer value) {
            addCriterion("driverId <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Integer value) {
            addCriterion("driverId >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverId >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Integer value) {
            addCriterion("driverId <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Integer value) {
            addCriterion("driverId <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Integer> values) {
            addCriterion("driverId in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDdriverIdNotIn(List<Integer> values) {
            addCriterion("driverId not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Integer value1, Integer value2) {
            addCriterion("driverId between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("driverId not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(String value) {
            addCriterion("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(String value) {
            addCriterion("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(String value) {
            addCriterion("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(String value) {
            addCriterion("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(String value) {
            addCriterion("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(String value) {
            addCriterion("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLike(String value) {
            addCriterion("birth_date like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotLike(String value) {
            addCriterion("birth_date not like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<String> values) {
            addCriterion("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<String> values) {
            addCriterion("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(String value1, String value2) {
            addCriterion("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(String value1, String value2) {
            addCriterion("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNull() {
            addCriterion("driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNotNull() {
            addCriterion("driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTelEqualTo(String value) {
            addCriterion("driver_tel =", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotEqualTo(String value) {
            addCriterion("driver_tel <>", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThan(String value) {
            addCriterion("driver_tel >", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("driver_tel >=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThan(String value) {
            addCriterion("driver_tel <", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThanOrEqualTo(String value) {
            addCriterion("driver_tel <=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLike(String value) {
            addCriterion("driver_tel like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotLike(String value) {
            addCriterion("driver_tel not like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelIn(List<String> values) {
            addCriterion("driver_tel in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotIn(List<String> values) {
            addCriterion("driver_tel not in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelBetween(String value1, String value2) {
            addCriterion("driver_tel between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotBetween(String value1, String value2) {
            addCriterion("driver_tel not between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceIsNull() {
            addCriterion("registered_residence_province is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceIsNotNull() {
            addCriterion("registered_residence_province is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceEqualTo(String value) {
            addCriterion("registered_residence_province =", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotEqualTo(String value) {
            addCriterion("registered_residence_province <>", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceGreaterThan(String value) {
            addCriterion("registered_residence_province >", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence_province >=", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceLessThan(String value) {
            addCriterion("registered_residence_province <", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceLessThanOrEqualTo(String value) {
            addCriterion("registered_residence_province <=", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceLike(String value) {
            addCriterion("registered_residence_province like", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotLike(String value) {
            addCriterion("registered_residence_province not like", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceIn(List<String> values) {
            addCriterion("registered_residence_province in", values, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotIn(List<String> values) {
            addCriterion("registered_residence_province not in", values, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceBetween(String value1, String value2) {
            addCriterion("registered_residence_province between", value1, value2, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotBetween(String value1, String value2) {
            addCriterion("registered_residence_province not between", value1, value2, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityIsNull() {
            addCriterion("registered_residence_city is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityIsNotNull() {
            addCriterion("registered_residence_city is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityEqualTo(String value) {
            addCriterion("registered_residence_city =", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotEqualTo(String value) {
            addCriterion("registered_residence_city <>", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityGreaterThan(String value) {
            addCriterion("registered_residence_city >", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence_city >=", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityLessThan(String value) {
            addCriterion("registered_residence_city <", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityLessThanOrEqualTo(String value) {
            addCriterion("registered_residence_city <=", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityLike(String value) {
            addCriterion("registered_residence_city like", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotLike(String value) {
            addCriterion("registered_residence_city not like", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityIn(List<String> values) {
            addCriterion("registered_residence_city in", values, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotIn(List<String> values) {
            addCriterion("registered_residence_city not in", values, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityBetween(String value1, String value2) {
            addCriterion("registered_residence_city between", value1, value2, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotBetween(String value1, String value2) {
            addCriterion("registered_residence_city not between", value1, value2, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownIsNull() {
            addCriterion("registered_residence_town is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownIsNotNull() {
            addCriterion("registered_residence_town is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownEqualTo(String value) {
            addCriterion("registered_residence_town =", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownNotEqualTo(String value) {
            addCriterion("registered_residence_town <>", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownGreaterThan(String value) {
            addCriterion("registered_residence_town >", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence_town >=", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownLessThan(String value) {
            addCriterion("registered_residence_town <", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownLessThanOrEqualTo(String value) {
            addCriterion("registered_residence_town <=", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownLike(String value) {
            addCriterion("registered_residence_town like", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownNotLike(String value) {
            addCriterion("registered_residence_town not like", value, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownIn(List<String> values) {
            addCriterion("registered_residence_town in", values, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownNotIn(List<String> values) {
            addCriterion("registered_residence_town not in", values, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownBetween(String value1, String value2) {
            addCriterion("registered_residence_town between", value1, value2, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTownNotBetween(String value1, String value2) {
            addCriterion("registered_residence_town not between", value1, value2, "registeredResidenceTown");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceIsNull() {
            addCriterion("driving_license_issue_place is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceIsNotNull() {
            addCriterion("driving_license_issue_place is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceEqualTo(String value) {
            addCriterion("driving_license_issue_place =", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceNotEqualTo(String value) {
            addCriterion("driving_license_issue_place <>", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceGreaterThan(String value) {
            addCriterion("driving_license_issue_place >", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_issue_place >=", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceLessThan(String value) {
            addCriterion("driving_license_issue_place <", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceLessThanOrEqualTo(String value) {
            addCriterion("driving_license_issue_place <=", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceLike(String value) {
            addCriterion("driving_license_issue_place like", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceNotLike(String value) {
            addCriterion("driving_license_issue_place not like", value, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceIn(List<String> values) {
            addCriterion("driving_license_issue_place in", values, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceNotIn(List<String> values) {
            addCriterion("driving_license_issue_place not in", values, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceBetween(String value1, String value2) {
            addCriterion("driving_license_issue_place between", value1, value2, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIssuePlaceNotBetween(String value1, String value2) {
            addCriterion("driving_license_issue_place not between", value1, value2, "drivingLicenseIssuePlace");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateIsNull() {
            addCriterion("driving_license_effective_date is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateIsNotNull() {
            addCriterion("driving_license_effective_date is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateEqualTo(String value) {
            addCriterion("driving_license_effective_date =", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateNotEqualTo(String value) {
            addCriterion("driving_license_effective_date <>", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateGreaterThan(String value) {
            addCriterion("driving_license_effective_date >", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_effective_date >=", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateLessThan(String value) {
            addCriterion("driving_license_effective_date <", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateLessThanOrEqualTo(String value) {
            addCriterion("driving_license_effective_date <=", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateLike(String value) {
            addCriterion("driving_license_effective_date like", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateNotLike(String value) {
            addCriterion("driving_license_effective_date not like", value, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateIn(List<String> values) {
            addCriterion("driving_license_effective_date in", values, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateNotIn(List<String> values) {
            addCriterion("driving_license_effective_date not in", values, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateBetween(String value1, String value2) {
            addCriterion("driving_license_effective_date between", value1, value2, "drivingLicenseEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEffectiveDateNotBetween(String value1, String value2) {
            addCriterion("driving_license_effective_date not between", value1, value2, "drivingLicenseEffectiveDate");
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

        public Criteria andEmergencyContactNameIsNull() {
            addCriterion("emergency_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameIsNotNull() {
            addCriterion("emergency_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameEqualTo(String value) {
            addCriterion("emergency_contact_name =", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotEqualTo(String value) {
            addCriterion("emergency_contact_name <>", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameGreaterThan(String value) {
            addCriterion("emergency_contact_name >", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_name >=", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameLessThan(String value) {
            addCriterion("emergency_contact_name <", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_name <=", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameLike(String value) {
            addCriterion("emergency_contact_name like", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotLike(String value) {
            addCriterion("emergency_contact_name not like", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameIn(List<String> values) {
            addCriterion("emergency_contact_name in", values, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotIn(List<String> values) {
            addCriterion("emergency_contact_name not in", values, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameBetween(String value1, String value2) {
            addCriterion("emergency_contact_name between", value1, value2, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_name not between", value1, value2, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelIsNull() {
            addCriterion("emergency_contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelIsNotNull() {
            addCriterion("emergency_contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelEqualTo(String value) {
            addCriterion("emergency_contact_tel =", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelNotEqualTo(String value) {
            addCriterion("emergency_contact_tel <>", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelGreaterThan(String value) {
            addCriterion("emergency_contact_tel >", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_tel >=", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelLessThan(String value) {
            addCriterion("emergency_contact_tel <", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_tel <=", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelLike(String value) {
            addCriterion("emergency_contact_tel like", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelNotLike(String value) {
            addCriterion("emergency_contact_tel not like", value, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelIn(List<String> values) {
            addCriterion("emergency_contact_tel in", values, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelNotIn(List<String> values) {
            addCriterion("emergency_contact_tel not in", values, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelBetween(String value1, String value2) {
            addCriterion("emergency_contact_tel between", value1, value2, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactTelNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_tel not between", value1, value2, "emergencyContactTel");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZIsNull() {
            addCriterion("id_photo_z is null");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZIsNotNull() {
            addCriterion("id_photo_z is not null");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZEqualTo(String value) {
            addCriterion("id_photo_z =", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZNotEqualTo(String value) {
            addCriterion("id_photo_z <>", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZGreaterThan(String value) {
            addCriterion("id_photo_z >", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZGreaterThanOrEqualTo(String value) {
            addCriterion("id_photo_z >=", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZLessThan(String value) {
            addCriterion("id_photo_z <", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZLessThanOrEqualTo(String value) {
            addCriterion("id_photo_z <=", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZLike(String value) {
            addCriterion("id_photo_z like", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZNotLike(String value) {
            addCriterion("id_photo_z not like", value, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZIn(List<String> values) {
            addCriterion("id_photo_z in", values, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZNotIn(List<String> values) {
            addCriterion("id_photo_z not in", values, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZBetween(String value1, String value2) {
            addCriterion("id_photo_z between", value1, value2, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoZNotBetween(String value1, String value2) {
            addCriterion("id_photo_z not between", value1, value2, "idPhotoZ");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFIsNull() {
            addCriterion("id_photo_f is null");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFIsNotNull() {
            addCriterion("id_photo_f is not null");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFEqualTo(String value) {
            addCriterion("id_photo_f =", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFNotEqualTo(String value) {
            addCriterion("id_photo_f <>", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFGreaterThan(String value) {
            addCriterion("id_photo_f >", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFGreaterThanOrEqualTo(String value) {
            addCriterion("id_photo_f >=", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFLessThan(String value) {
            addCriterion("id_photo_f <", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFLessThanOrEqualTo(String value) {
            addCriterion("id_photo_f <=", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFLike(String value) {
            addCriterion("id_photo_f like", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFNotLike(String value) {
            addCriterion("id_photo_f not like", value, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFIn(List<String> values) {
            addCriterion("id_photo_f in", values, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFNotIn(List<String> values) {
            addCriterion("id_photo_f not in", values, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFBetween(String value1, String value2) {
            addCriterion("id_photo_f between", value1, value2, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andIdPhotoFNotBetween(String value1, String value2) {
            addCriterion("id_photo_f not between", value1, value2, "idPhotoF");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoIsNull() {
            addCriterion("driving_license_master_photo is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoIsNotNull() {
            addCriterion("driving_license_master_photo is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoEqualTo(String value) {
            addCriterion("driving_license_master_photo =", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoNotEqualTo(String value) {
            addCriterion("driving_license_master_photo <>", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoGreaterThan(String value) {
            addCriterion("driving_license_master_photo >", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_master_photo >=", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoLessThan(String value) {
            addCriterion("driving_license_master_photo <", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoLessThanOrEqualTo(String value) {
            addCriterion("driving_license_master_photo <=", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoLike(String value) {
            addCriterion("driving_license_master_photo like", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoNotLike(String value) {
            addCriterion("driving_license_master_photo not like", value, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoIn(List<String> values) {
            addCriterion("driving_license_master_photo in", values, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoNotIn(List<String> values) {
            addCriterion("driving_license_master_photo not in", values, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoBetween(String value1, String value2) {
            addCriterion("driving_license_master_photo between", value1, value2, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseMasterPhotoNotBetween(String value1, String value2) {
            addCriterion("driving_license_master_photo not between", value1, value2, "drivingLicenseMasterPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoIsNull() {
            addCriterion("driving_license_appendix_photo is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoIsNotNull() {
            addCriterion("driving_license_appendix_photo is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoEqualTo(String value) {
            addCriterion("driving_license_appendix_photo =", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoNotEqualTo(String value) {
            addCriterion("driving_license_appendix_photo <>", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoGreaterThan(String value) {
            addCriterion("driving_license_appendix_photo >", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_appendix_photo >=", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoLessThan(String value) {
            addCriterion("driving_license_appendix_photo <", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoLessThanOrEqualTo(String value) {
            addCriterion("driving_license_appendix_photo <=", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoLike(String value) {
            addCriterion("driving_license_appendix_photo like", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoNotLike(String value) {
            addCriterion("driving_license_appendix_photo not like", value, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoIn(List<String> values) {
            addCriterion("driving_license_appendix_photo in", values, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoNotIn(List<String> values) {
            addCriterion("driving_license_appendix_photo not in", values, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoBetween(String value1, String value2) {
            addCriterion("driving_license_appendix_photo between", value1, value2, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAppendixPhotoNotBetween(String value1, String value2) {
            addCriterion("driving_license_appendix_photo not between", value1, value2, "drivingLicenseAppendixPhoto");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
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
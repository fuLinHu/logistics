package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarInformationExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarLongIsNull() {
            addCriterion("car_long is null");
            return (Criteria) this;
        }

        public Criteria andCarLongIsNotNull() {
            addCriterion("car_long is not null");
            return (Criteria) this;
        }

        public Criteria andCarLongEqualTo(Double value) {
            addCriterion("car_long =", value, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongNotEqualTo(Double value) {
            addCriterion("car_long <>", value, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongGreaterThan(Double value) {
            addCriterion("car_long >", value, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongGreaterThanOrEqualTo(Double value) {
            addCriterion("car_long >=", value, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongLessThan(Double value) {
            addCriterion("car_long <", value, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongLessThanOrEqualTo(Double value) {
            addCriterion("car_long <=", value, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongIn(List<Double> values) {
            addCriterion("car_long in", values, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongNotIn(List<Double> values) {
            addCriterion("car_long not in", values, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongBetween(Double value1, Double value2) {
            addCriterion("car_long between", value1, value2, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarLongNotBetween(Double value1, Double value2) {
            addCriterion("car_long not between", value1, value2, "carLong");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNull() {
            addCriterion("car_width is null");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNotNull() {
            addCriterion("car_width is not null");
            return (Criteria) this;
        }

        public Criteria andCarWidthEqualTo(Double value) {
            addCriterion("car_width =", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotEqualTo(Double value) {
            addCriterion("car_width <>", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThan(Double value) {
            addCriterion("car_width >", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("car_width >=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThan(Double value) {
            addCriterion("car_width <", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThanOrEqualTo(Double value) {
            addCriterion("car_width <=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthIn(List<Double> values) {
            addCriterion("car_width in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotIn(List<Double> values) {
            addCriterion("car_width not in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthBetween(Double value1, Double value2) {
            addCriterion("car_width between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotBetween(Double value1, Double value2) {
            addCriterion("car_width not between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarHighIsNull() {
            addCriterion("car_high is null");
            return (Criteria) this;
        }

        public Criteria andCarHighIsNotNull() {
            addCriterion("car_high is not null");
            return (Criteria) this;
        }

        public Criteria andCarHighEqualTo(Double value) {
            addCriterion("car_high =", value, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighNotEqualTo(Double value) {
            addCriterion("car_high <>", value, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighGreaterThan(Double value) {
            addCriterion("car_high >", value, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighGreaterThanOrEqualTo(Double value) {
            addCriterion("car_high >=", value, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighLessThan(Double value) {
            addCriterion("car_high <", value, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighLessThanOrEqualTo(Double value) {
            addCriterion("car_high <=", value, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighIn(List<Double> values) {
            addCriterion("car_high in", values, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighNotIn(List<Double> values) {
            addCriterion("car_high not in", values, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighBetween(Double value1, Double value2) {
            addCriterion("car_high between", value1, value2, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarHighNotBetween(Double value1, Double value2) {
            addCriterion("car_high not between", value1, value2, "carHigh");
            return (Criteria) this;
        }

        public Criteria andCarLoadIsNull() {
            addCriterion("car_load is null");
            return (Criteria) this;
        }

        public Criteria andCarLoadIsNotNull() {
            addCriterion("car_load is not null");
            return (Criteria) this;
        }

        public Criteria andCarLoadEqualTo(Double value) {
            addCriterion("car_load =", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotEqualTo(Double value) {
            addCriterion("car_load <>", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThan(Double value) {
            addCriterion("car_load >", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThanOrEqualTo(Double value) {
            addCriterion("car_load >=", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThan(Double value) {
            addCriterion("car_load <", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThanOrEqualTo(Double value) {
            addCriterion("car_load <=", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadIn(List<Double> values) {
            addCriterion("car_load in", values, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotIn(List<Double> values) {
            addCriterion("car_load not in", values, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadBetween(Double value1, Double value2) {
            addCriterion("car_load between", value1, value2, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotBetween(Double value1, Double value2) {
            addCriterion("car_load not between", value1, value2, "carLoad");
            return (Criteria) this;
        }

        public Criteria andTransportProveIsNull() {
            addCriterion("transport_prove is null");
            return (Criteria) this;
        }

        public Criteria andTransportProveIsNotNull() {
            addCriterion("transport_prove is not null");
            return (Criteria) this;
        }

        public Criteria andTransportProveEqualTo(String value) {
            addCriterion("transport_prove =", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveNotEqualTo(String value) {
            addCriterion("transport_prove <>", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveGreaterThan(String value) {
            addCriterion("transport_prove >", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveGreaterThanOrEqualTo(String value) {
            addCriterion("transport_prove >=", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveLessThan(String value) {
            addCriterion("transport_prove <", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveLessThanOrEqualTo(String value) {
            addCriterion("transport_prove <=", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveLike(String value) {
            addCriterion("transport_prove like", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveNotLike(String value) {
            addCriterion("transport_prove not like", value, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveIn(List<String> values) {
            addCriterion("transport_prove in", values, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveNotIn(List<String> values) {
            addCriterion("transport_prove not in", values, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveBetween(String value1, String value2) {
            addCriterion("transport_prove between", value1, value2, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportProveNotBetween(String value1, String value2) {
            addCriterion("transport_prove not between", value1, value2, "transportProve");
            return (Criteria) this;
        }

        public Criteria andTransportDateIsNull() {
            addCriterion("transport_date is null");
            return (Criteria) this;
        }

        public Criteria andTransportDateIsNotNull() {
            addCriterion("transport_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransportDateEqualTo(String value) {
            addCriterion("transport_date =", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateNotEqualTo(String value) {
            addCriterion("transport_date <>", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateGreaterThan(String value) {
            addCriterion("transport_date >", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateGreaterThanOrEqualTo(String value) {
            addCriterion("transport_date >=", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateLessThan(String value) {
            addCriterion("transport_date <", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateLessThanOrEqualTo(String value) {
            addCriterion("transport_date <=", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateLike(String value) {
            addCriterion("transport_date like", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateNotLike(String value) {
            addCriterion("transport_date not like", value, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateIn(List<String> values) {
            addCriterion("transport_date in", values, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateNotIn(List<String> values) {
            addCriterion("transport_date not in", values, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateBetween(String value1, String value2) {
            addCriterion("transport_date between", value1, value2, "transportDate");
            return (Criteria) this;
        }

        public Criteria andTransportDateNotBetween(String value1, String value2) {
            addCriterion("transport_date not between", value1, value2, "transportDate");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZIsNull() {
            addCriterion("driving_card_photos_z is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZIsNotNull() {
            addCriterion("driving_card_photos_z is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZEqualTo(String value) {
            addCriterion("driving_card_photos_z =", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZNotEqualTo(String value) {
            addCriterion("driving_card_photos_z <>", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZGreaterThan(String value) {
            addCriterion("driving_card_photos_z >", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZGreaterThanOrEqualTo(String value) {
            addCriterion("driving_card_photos_z >=", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZLessThan(String value) {
            addCriterion("driving_card_photos_z <", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZLessThanOrEqualTo(String value) {
            addCriterion("driving_card_photos_z <=", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZLike(String value) {
            addCriterion("driving_card_photos_z like", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZNotLike(String value) {
            addCriterion("driving_card_photos_z not like", value, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZIn(List<String> values) {
            addCriterion("driving_card_photos_z in", values, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZNotIn(List<String> values) {
            addCriterion("driving_card_photos_z not in", values, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZBetween(String value1, String value2) {
            addCriterion("driving_card_photos_z between", value1, value2, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosZNotBetween(String value1, String value2) {
            addCriterion("driving_card_photos_z not between", value1, value2, "drivingCardPhotosZ");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFIsNull() {
            addCriterion("driving_card_photos_f is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFIsNotNull() {
            addCriterion("driving_card_photos_f is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFEqualTo(String value) {
            addCriterion("driving_card_photos_f =", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFNotEqualTo(String value) {
            addCriterion("driving_card_photos_f <>", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFGreaterThan(String value) {
            addCriterion("driving_card_photos_f >", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFGreaterThanOrEqualTo(String value) {
            addCriterion("driving_card_photos_f >=", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFLessThan(String value) {
            addCriterion("driving_card_photos_f <", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFLessThanOrEqualTo(String value) {
            addCriterion("driving_card_photos_f <=", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFLike(String value) {
            addCriterion("driving_card_photos_f like", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFNotLike(String value) {
            addCriterion("driving_card_photos_f not like", value, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFIn(List<String> values) {
            addCriterion("driving_card_photos_f in", values, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFNotIn(List<String> values) {
            addCriterion("driving_card_photos_f not in", values, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFBetween(String value1, String value2) {
            addCriterion("driving_card_photos_f between", value1, value2, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andDrivingCardPhotosFNotBetween(String value1, String value2) {
            addCriterion("driving_card_photos_f not between", value1, value2, "drivingCardPhotosF");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoIsNull() {
            addCriterion("car_front_photo is null");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoIsNotNull() {
            addCriterion("car_front_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoEqualTo(String value) {
            addCriterion("car_front_photo =", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoNotEqualTo(String value) {
            addCriterion("car_front_photo <>", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoGreaterThan(String value) {
            addCriterion("car_front_photo >", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("car_front_photo >=", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoLessThan(String value) {
            addCriterion("car_front_photo <", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoLessThanOrEqualTo(String value) {
            addCriterion("car_front_photo <=", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoLike(String value) {
            addCriterion("car_front_photo like", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoNotLike(String value) {
            addCriterion("car_front_photo not like", value, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoIn(List<String> values) {
            addCriterion("car_front_photo in", values, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoNotIn(List<String> values) {
            addCriterion("car_front_photo not in", values, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoBetween(String value1, String value2) {
            addCriterion("car_front_photo between", value1, value2, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andCarFrontPhotoNotBetween(String value1, String value2) {
            addCriterion("car_front_photo not between", value1, value2, "carFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoIsNull() {
            addCriterion("transport_prove_photo is null");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoIsNotNull() {
            addCriterion("transport_prove_photo is not null");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoEqualTo(String value) {
            addCriterion("transport_prove_photo =", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoNotEqualTo(String value) {
            addCriterion("transport_prove_photo <>", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoGreaterThan(String value) {
            addCriterion("transport_prove_photo >", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("transport_prove_photo >=", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoLessThan(String value) {
            addCriterion("transport_prove_photo <", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoLessThanOrEqualTo(String value) {
            addCriterion("transport_prove_photo <=", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoLike(String value) {
            addCriterion("transport_prove_photo like", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoNotLike(String value) {
            addCriterion("transport_prove_photo not like", value, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoIn(List<String> values) {
            addCriterion("transport_prove_photo in", values, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoNotIn(List<String> values) {
            addCriterion("transport_prove_photo not in", values, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoBetween(String value1, String value2) {
            addCriterion("transport_prove_photo between", value1, value2, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andTransportProvePhotoNotBetween(String value1, String value2) {
            addCriterion("transport_prove_photo not between", value1, value2, "transportProvePhoto");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReasionIsNull() {
            addCriterion("reasion is null");
            return (Criteria) this;
        }

        public Criteria andReasionIsNotNull() {
            addCriterion("reasion is not null");
            return (Criteria) this;
        }

        public Criteria andReasionEqualTo(String value) {
            addCriterion("reasion =", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionNotEqualTo(String value) {
            addCriterion("reasion <>", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionGreaterThan(String value) {
            addCriterion("reasion >", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionGreaterThanOrEqualTo(String value) {
            addCriterion("reasion >=", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionLessThan(String value) {
            addCriterion("reasion <", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionLessThanOrEqualTo(String value) {
            addCriterion("reasion <=", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionLike(String value) {
            addCriterion("reasion like", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionNotLike(String value) {
            addCriterion("reasion not like", value, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionIn(List<String> values) {
            addCriterion("reasion in", values, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionNotIn(List<String> values) {
            addCriterion("reasion not in", values, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionBetween(String value1, String value2) {
            addCriterion("reasion between", value1, value2, "reasion");
            return (Criteria) this;
        }

        public Criteria andReasionNotBetween(String value1, String value2) {
            addCriterion("reasion not between", value1, value2, "reasion");
            return (Criteria) this;
        }

        public Criteria andStatuIsNull() {
            addCriterion("statu is null");
            return (Criteria) this;
        }

        public Criteria andStatuIsNotNull() {
            addCriterion("statu is not null");
            return (Criteria) this;
        }

        public Criteria andStatuEqualTo(Integer value) {
            addCriterion("statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(Integer value) {
            addCriterion("statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(Integer value) {
            addCriterion("statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(Integer value) {
            addCriterion("statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(Integer value) {
            addCriterion("statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<Integer> values) {
            addCriterion("statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<Integer> values) {
            addCriterion("statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(Integer value1, Integer value2) {
            addCriterion("statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(Integer value1, Integer value2) {
            addCriterion("statu not between", value1, value2, "statu");
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
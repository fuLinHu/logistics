package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseInfoExample() {
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

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
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

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeIsNull() {
            addCriterion("delete_type is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeIsNotNull() {
            addCriterion("delete_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeEqualTo(Integer value) {
            addCriterion("delete_type =", value, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeNotEqualTo(Integer value) {
            addCriterion("delete_type <>", value, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeGreaterThan(Integer value) {
            addCriterion("delete_type >", value, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_type >=", value, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeLessThan(Integer value) {
            addCriterion("delete_type <", value, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("delete_type <=", value, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeIn(List<Integer> values) {
            addCriterion("delete_type in", values, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeNotIn(List<Integer> values) {
            addCriterion("delete_type not in", values, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeBetween(Integer value1, Integer value2) {
            addCriterion("delete_type between", value1, value2, "deleteType");
            return (Criteria) this;
        }

        public Criteria andDeleteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_type not between", value1, value2, "deleteType");
            return (Criteria) this;
        }

        public Criteria andSyscodeIsNull() {
            addCriterion("syscode is null");
            return (Criteria) this;
        }

        public Criteria andSyscodeIsNotNull() {
            addCriterion("syscode is not null");
            return (Criteria) this;
        }

        public Criteria andSyscodeEqualTo(Integer value) {
            addCriterion("syscode =", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeNotEqualTo(Integer value) {
            addCriterion("syscode <>", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeGreaterThan(Integer value) {
            addCriterion("syscode >", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("syscode >=", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeLessThan(Integer value) {
            addCriterion("syscode <", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeLessThanOrEqualTo(Integer value) {
            addCriterion("syscode <=", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeIn(List<Integer> values) {
            addCriterion("syscode in", values, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeNotIn(List<Integer> values) {
            addCriterion("syscode not in", values, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeBetween(Integer value1, Integer value2) {
            addCriterion("syscode between", value1, value2, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeNotBetween(Integer value1, Integer value2) {
            addCriterion("syscode not between", value1, value2, "syscode");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeIsNull() {
            addCriterion("corporate_aptitude is null");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeIsNotNull() {
            addCriterion("corporate_aptitude is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeEqualTo(String value) {
            addCriterion("corporate_aptitude =", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeNotEqualTo(String value) {
            addCriterion("corporate_aptitude <>", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeGreaterThan(String value) {
            addCriterion("corporate_aptitude >", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_aptitude >=", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeLessThan(String value) {
            addCriterion("corporate_aptitude <", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeLessThanOrEqualTo(String value) {
            addCriterion("corporate_aptitude <=", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeLike(String value) {
            addCriterion("corporate_aptitude like", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeNotLike(String value) {
            addCriterion("corporate_aptitude not like", value, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeIn(List<String> values) {
            addCriterion("corporate_aptitude in", values, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeNotIn(List<String> values) {
            addCriterion("corporate_aptitude not in", values, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeBetween(String value1, String value2) {
            addCriterion("corporate_aptitude between", value1, value2, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andCorporateAptitudeNotBetween(String value1, String value2) {
            addCriterion("corporate_aptitude not between", value1, value2, "corporateAptitude");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIsNull() {
            addCriterion("enterprise_tel is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIsNotNull() {
            addCriterion("enterprise_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelEqualTo(String value) {
            addCriterion("enterprise_tel =", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotEqualTo(String value) {
            addCriterion("enterprise_tel <>", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelGreaterThan(String value) {
            addCriterion("enterprise_tel >", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_tel >=", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLessThan(String value) {
            addCriterion("enterprise_tel <", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLessThanOrEqualTo(String value) {
            addCriterion("enterprise_tel <=", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLike(String value) {
            addCriterion("enterprise_tel like", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotLike(String value) {
            addCriterion("enterprise_tel not like", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIn(List<String> values) {
            addCriterion("enterprise_tel in", values, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotIn(List<String> values) {
            addCriterion("enterprise_tel not in", values, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelBetween(String value1, String value2) {
            addCriterion("enterprise_tel between", value1, value2, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotBetween(String value1, String value2) {
            addCriterion("enterprise_tel not between", value1, value2, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteIsNull() {
            addCriterion("enterprise_site is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteIsNotNull() {
            addCriterion("enterprise_site is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteEqualTo(String value) {
            addCriterion("enterprise_site =", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteNotEqualTo(String value) {
            addCriterion("enterprise_site <>", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteGreaterThan(String value) {
            addCriterion("enterprise_site >", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_site >=", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteLessThan(String value) {
            addCriterion("enterprise_site <", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteLessThanOrEqualTo(String value) {
            addCriterion("enterprise_site <=", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteLike(String value) {
            addCriterion("enterprise_site like", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteNotLike(String value) {
            addCriterion("enterprise_site not like", value, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteIn(List<String> values) {
            addCriterion("enterprise_site in", values, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteNotIn(List<String> values) {
            addCriterion("enterprise_site not in", values, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteBetween(String value1, String value2) {
            addCriterion("enterprise_site between", value1, value2, "enterpriseSite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSiteNotBetween(String value1, String value2) {
            addCriterion("enterprise_site not between", value1, value2, "enterpriseSite");
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
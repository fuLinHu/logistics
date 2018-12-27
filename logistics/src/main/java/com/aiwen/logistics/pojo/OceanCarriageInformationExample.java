package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class OceanCarriageInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OceanCarriageInformationExample() {
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

        public Criteria andVoyageIsNull() {
            addCriterion("voyage is null");
            return (Criteria) this;
        }

        public Criteria andVoyageIsNotNull() {
            addCriterion("voyage is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageEqualTo(String value) {
            addCriterion("voyage =", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotEqualTo(String value) {
            addCriterion("voyage <>", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThan(String value) {
            addCriterion("voyage >", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThanOrEqualTo(String value) {
            addCriterion("voyage >=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThan(String value) {
            addCriterion("voyage <", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThanOrEqualTo(String value) {
            addCriterion("voyage <=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLike(String value) {
            addCriterion("voyage like", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotLike(String value) {
            addCriterion("voyage not like", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageIn(List<String> values) {
            addCriterion("voyage in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotIn(List<String> values) {
            addCriterion("voyage not in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageBetween(String value1, String value2) {
            addCriterion("voyage between", value1, value2, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotBetween(String value1, String value2) {
            addCriterion("voyage not between", value1, value2, "voyage");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIsNull() {
            addCriterion("closing_time is null");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIsNotNull() {
            addCriterion("closing_time is not null");
            return (Criteria) this;
        }

        public Criteria andClosingTimeEqualTo(String value) {
            addCriterion("closing_time =", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotEqualTo(String value) {
            addCriterion("closing_time <>", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeGreaterThan(String value) {
            addCriterion("closing_time >", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("closing_time >=", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLessThan(String value) {
            addCriterion("closing_time <", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLessThanOrEqualTo(String value) {
            addCriterion("closing_time <=", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLike(String value) {
            addCriterion("closing_time like", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotLike(String value) {
            addCriterion("closing_time not like", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIn(List<String> values) {
            addCriterion("closing_time in", values, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotIn(List<String> values) {
            addCriterion("closing_time not in", values, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeBetween(String value1, String value2) {
            addCriterion("closing_time between", value1, value2, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotBetween(String value1, String value2) {
            addCriterion("closing_time not between", value1, value2, "closingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeIsNull() {
            addCriterion("sailing_time is null");
            return (Criteria) this;
        }

        public Criteria andSailingTimeIsNotNull() {
            addCriterion("sailing_time is not null");
            return (Criteria) this;
        }

        public Criteria andSailingTimeEqualTo(String value) {
            addCriterion("sailing_time =", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeNotEqualTo(String value) {
            addCriterion("sailing_time <>", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeGreaterThan(String value) {
            addCriterion("sailing_time >", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sailing_time >=", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeLessThan(String value) {
            addCriterion("sailing_time <", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeLessThanOrEqualTo(String value) {
            addCriterion("sailing_time <=", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeLike(String value) {
            addCriterion("sailing_time like", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeNotLike(String value) {
            addCriterion("sailing_time not like", value, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeIn(List<String> values) {
            addCriterion("sailing_time in", values, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeNotIn(List<String> values) {
            addCriterion("sailing_time not in", values, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeBetween(String value1, String value2) {
            addCriterion("sailing_time between", value1, value2, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andSailingTimeNotBetween(String value1, String value2) {
            addCriterion("sailing_time not between", value1, value2, "sailingTime");
            return (Criteria) this;
        }

        public Criteria andBillNumberIsNull() {
            addCriterion("bill_number is null");
            return (Criteria) this;
        }

        public Criteria andBillNumberIsNotNull() {
            addCriterion("bill_number is not null");
            return (Criteria) this;
        }

        public Criteria andBillNumberEqualTo(String value) {
            addCriterion("bill_number =", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotEqualTo(String value) {
            addCriterion("bill_number <>", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberGreaterThan(String value) {
            addCriterion("bill_number >", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bill_number >=", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLessThan(String value) {
            addCriterion("bill_number <", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLessThanOrEqualTo(String value) {
            addCriterion("bill_number <=", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLike(String value) {
            addCriterion("bill_number like", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotLike(String value) {
            addCriterion("bill_number not like", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberIn(List<String> values) {
            addCriterion("bill_number in", values, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotIn(List<String> values) {
            addCriterion("bill_number not in", values, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberBetween(String value1, String value2) {
            addCriterion("bill_number between", value1, value2, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotBetween(String value1, String value2) {
            addCriterion("bill_number not between", value1, value2, "billNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberIsNull() {
            addCriterion("container_number is null");
            return (Criteria) this;
        }

        public Criteria andContainerNumberIsNotNull() {
            addCriterion("container_number is not null");
            return (Criteria) this;
        }

        public Criteria andContainerNumberEqualTo(String value) {
            addCriterion("container_number =", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberNotEqualTo(String value) {
            addCriterion("container_number <>", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberGreaterThan(String value) {
            addCriterion("container_number >", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("container_number >=", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberLessThan(String value) {
            addCriterion("container_number <", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberLessThanOrEqualTo(String value) {
            addCriterion("container_number <=", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberLike(String value) {
            addCriterion("container_number like", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberNotLike(String value) {
            addCriterion("container_number not like", value, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberIn(List<String> values) {
            addCriterion("container_number in", values, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberNotIn(List<String> values) {
            addCriterion("container_number not in", values, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberBetween(String value1, String value2) {
            addCriterion("container_number between", value1, value2, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerNumberNotBetween(String value1, String value2) {
            addCriterion("container_number not between", value1, value2, "containerNumber");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNull() {
            addCriterion("container_type is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("container_type is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("container_type =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("container_type <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("container_type >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("container_type >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("container_type <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("container_type <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("container_type like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("container_type not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("container_type in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("container_type not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("container_type between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("container_type not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIsNull() {
            addCriterion("container_volume is null");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIsNotNull() {
            addCriterion("container_volume is not null");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeEqualTo(String value) {
            addCriterion("container_volume =", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotEqualTo(String value) {
            addCriterion("container_volume <>", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeGreaterThan(String value) {
            addCriterion("container_volume >", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("container_volume >=", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLessThan(String value) {
            addCriterion("container_volume <", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLessThanOrEqualTo(String value) {
            addCriterion("container_volume <=", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLike(String value) {
            addCriterion("container_volume like", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotLike(String value) {
            addCriterion("container_volume not like", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIn(List<String> values) {
            addCriterion("container_volume in", values, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotIn(List<String> values) {
            addCriterion("container_volume not in", values, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeBetween(String value1, String value2) {
            addCriterion("container_volume between", value1, value2, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotBetween(String value1, String value2) {
            addCriterion("container_volume not between", value1, value2, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactWayIsNull() {
            addCriterion("contact_way is null");
            return (Criteria) this;
        }

        public Criteria andContactWayIsNotNull() {
            addCriterion("contact_way is not null");
            return (Criteria) this;
        }

        public Criteria andContactWayEqualTo(String value) {
            addCriterion("contact_way =", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotEqualTo(String value) {
            addCriterion("contact_way <>", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayGreaterThan(String value) {
            addCriterion("contact_way >", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayGreaterThanOrEqualTo(String value) {
            addCriterion("contact_way >=", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLessThan(String value) {
            addCriterion("contact_way <", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLessThanOrEqualTo(String value) {
            addCriterion("contact_way <=", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLike(String value) {
            addCriterion("contact_way like", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotLike(String value) {
            addCriterion("contact_way not like", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayIn(List<String> values) {
            addCriterion("contact_way in", values, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotIn(List<String> values) {
            addCriterion("contact_way not in", values, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayBetween(String value1, String value2) {
            addCriterion("contact_way between", value1, value2, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotBetween(String value1, String value2) {
            addCriterion("contact_way not between", value1, value2, "contactWay");
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
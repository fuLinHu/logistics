package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipDynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipDynamicExample() {
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

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNull() {
            addCriterion("voyage_number is null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNotNull() {
            addCriterion("voyage_number is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberEqualTo(String value) {
            addCriterion("voyage_number =", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotEqualTo(String value) {
            addCriterion("voyage_number <>", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThan(String value) {
            addCriterion("voyage_number >", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("voyage_number >=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThan(String value) {
            addCriterion("voyage_number <", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThanOrEqualTo(String value) {
            addCriterion("voyage_number <=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLike(String value) {
            addCriterion("voyage_number like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotLike(String value) {
            addCriterion("voyage_number not like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIn(List<String> values) {
            addCriterion("voyage_number in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotIn(List<String> values) {
            addCriterion("voyage_number not in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberBetween(String value1, String value2) {
            addCriterion("voyage_number between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotBetween(String value1, String value2) {
            addCriterion("voyage_number not between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andWharfIsNull() {
            addCriterion("wharf is null");
            return (Criteria) this;
        }

        public Criteria andWharfIsNotNull() {
            addCriterion("wharf is not null");
            return (Criteria) this;
        }

        public Criteria andWharfEqualTo(String value) {
            addCriterion("wharf =", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotEqualTo(String value) {
            addCriterion("wharf <>", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfGreaterThan(String value) {
            addCriterion("wharf >", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfGreaterThanOrEqualTo(String value) {
            addCriterion("wharf >=", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfLessThan(String value) {
            addCriterion("wharf <", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfLessThanOrEqualTo(String value) {
            addCriterion("wharf <=", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfLike(String value) {
            addCriterion("wharf like", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotLike(String value) {
            addCriterion("wharf not like", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfIn(List<String> values) {
            addCriterion("wharf in", values, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotIn(List<String> values) {
            addCriterion("wharf not in", values, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfBetween(String value1, String value2) {
            addCriterion("wharf between", value1, value2, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotBetween(String value1, String value2) {
            addCriterion("wharf not between", value1, value2, "wharf");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeIsNull() {
            addCriterion("start_port_time is null");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeIsNotNull() {
            addCriterion("start_port_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeEqualTo(Date value) {
            addCriterion("start_port_time =", value, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeNotEqualTo(Date value) {
            addCriterion("start_port_time <>", value, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeGreaterThan(Date value) {
            addCriterion("start_port_time >", value, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_port_time >=", value, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeLessThan(Date value) {
            addCriterion("start_port_time <", value, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_port_time <=", value, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeIn(List<Date> values) {
            addCriterion("start_port_time in", values, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeNotIn(List<Date> values) {
            addCriterion("start_port_time not in", values, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeBetween(Date value1, Date value2) {
            addCriterion("start_port_time between", value1, value2, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andStartPortTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_port_time not between", value1, value2, "startPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeIsNull() {
            addCriterion("end_port_time is null");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeIsNotNull() {
            addCriterion("end_port_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeEqualTo(Date value) {
            addCriterion("end_port_time =", value, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeNotEqualTo(Date value) {
            addCriterion("end_port_time <>", value, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeGreaterThan(Date value) {
            addCriterion("end_port_time >", value, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_port_time >=", value, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeLessThan(Date value) {
            addCriterion("end_port_time <", value, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_port_time <=", value, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeIn(List<Date> values) {
            addCriterion("end_port_time in", values, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeNotIn(List<Date> values) {
            addCriterion("end_port_time not in", values, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeBetween(Date value1, Date value2) {
            addCriterion("end_port_time between", value1, value2, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andEndPortTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_port_time not between", value1, value2, "endPortTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeIsNull() {
            addCriterion("shutoff_box_time is null");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeIsNotNull() {
            addCriterion("shutoff_box_time is not null");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeEqualTo(Date value) {
            addCriterion("shutoff_box_time =", value, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeNotEqualTo(Date value) {
            addCriterion("shutoff_box_time <>", value, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeGreaterThan(Date value) {
            addCriterion("shutoff_box_time >", value, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shutoff_box_time >=", value, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeLessThan(Date value) {
            addCriterion("shutoff_box_time <", value, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeLessThanOrEqualTo(Date value) {
            addCriterion("shutoff_box_time <=", value, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeIn(List<Date> values) {
            addCriterion("shutoff_box_time in", values, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeNotIn(List<Date> values) {
            addCriterion("shutoff_box_time not in", values, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeBetween(Date value1, Date value2) {
            addCriterion("shutoff_box_time between", value1, value2, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andShutoffBoxTimeNotBetween(Date value1, Date value2) {
            addCriterion("shutoff_box_time not between", value1, value2, "shutoffBoxTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeIsNull() {
            addCriterion("box_cutoff_time is null");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeIsNotNull() {
            addCriterion("box_cutoff_time is not null");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeEqualTo(Date value) {
            addCriterion("box_cutoff_time =", value, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeNotEqualTo(Date value) {
            addCriterion("box_cutoff_time <>", value, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeGreaterThan(Date value) {
            addCriterion("box_cutoff_time >", value, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("box_cutoff_time >=", value, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeLessThan(Date value) {
            addCriterion("box_cutoff_time <", value, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeLessThanOrEqualTo(Date value) {
            addCriterion("box_cutoff_time <=", value, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeIn(List<Date> values) {
            addCriterion("box_cutoff_time in", values, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeNotIn(List<Date> values) {
            addCriterion("box_cutoff_time not in", values, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeBetween(Date value1, Date value2) {
            addCriterion("box_cutoff_time between", value1, value2, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andBoxCutoffTimeNotBetween(Date value1, Date value2) {
            addCriterion("box_cutoff_time not between", value1, value2, "boxCutoffTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeIsNull() {
            addCriterion("expect_ship_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeIsNotNull() {
            addCriterion("expect_ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeEqualTo(Date value) {
            addCriterion("expect_ship_time =", value, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeNotEqualTo(Date value) {
            addCriterion("expect_ship_time <>", value, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeGreaterThan(Date value) {
            addCriterion("expect_ship_time >", value, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_ship_time >=", value, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeLessThan(Date value) {
            addCriterion("expect_ship_time <", value, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_ship_time <=", value, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeIn(List<Date> values) {
            addCriterion("expect_ship_time in", values, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeNotIn(List<Date> values) {
            addCriterion("expect_ship_time not in", values, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeBetween(Date value1, Date value2) {
            addCriterion("expect_ship_time between", value1, value2, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectShipTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_ship_time not between", value1, value2, "expectShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeIsNull() {
            addCriterion("expect_open_ship_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeIsNotNull() {
            addCriterion("expect_open_ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeEqualTo(Date value) {
            addCriterion("expect_open_ship_time =", value, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeNotEqualTo(Date value) {
            addCriterion("expect_open_ship_time <>", value, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeGreaterThan(Date value) {
            addCriterion("expect_open_ship_time >", value, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_open_ship_time >=", value, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeLessThan(Date value) {
            addCriterion("expect_open_ship_time <", value, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_open_ship_time <=", value, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeIn(List<Date> values) {
            addCriterion("expect_open_ship_time in", values, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeNotIn(List<Date> values) {
            addCriterion("expect_open_ship_time not in", values, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeBetween(Date value1, Date value2) {
            addCriterion("expect_open_ship_time between", value1, value2, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andExpectOpenShipTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_open_ship_time not between", value1, value2, "expectOpenShipTime");
            return (Criteria) this;
        }

        public Criteria andAccordStateIsNull() {
            addCriterion("accord_state is null");
            return (Criteria) this;
        }

        public Criteria andAccordStateIsNotNull() {
            addCriterion("accord_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccordStateEqualTo(Integer value) {
            addCriterion("accord_state =", value, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateNotEqualTo(Integer value) {
            addCriterion("accord_state <>", value, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateGreaterThan(Integer value) {
            addCriterion("accord_state >", value, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("accord_state >=", value, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateLessThan(Integer value) {
            addCriterion("accord_state <", value, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateLessThanOrEqualTo(Integer value) {
            addCriterion("accord_state <=", value, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateIn(List<Integer> values) {
            addCriterion("accord_state in", values, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateNotIn(List<Integer> values) {
            addCriterion("accord_state not in", values, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateBetween(Integer value1, Integer value2) {
            addCriterion("accord_state between", value1, value2, "accordState");
            return (Criteria) this;
        }

        public Criteria andAccordStateNotBetween(Integer value1, Integer value2) {
            addCriterion("accord_state not between", value1, value2, "accordState");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNull() {
            addCriterion("creat_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNotNull() {
            addCriterion("creat_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDateEqualTo(Date value) {
            addCriterion("creat_date =", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotEqualTo(Date value) {
            addCriterion("creat_date <>", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThan(Date value) {
            addCriterion("creat_date >", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_date >=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThan(Date value) {
            addCriterion("creat_date <", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThanOrEqualTo(Date value) {
            addCriterion("creat_date <=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIn(List<Date> values) {
            addCriterion("creat_date in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotIn(List<Date> values) {
            addCriterion("creat_date not in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateBetween(Date value1, Date value2) {
            addCriterion("creat_date between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotBetween(Date value1, Date value2) {
            addCriterion("creat_date not between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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
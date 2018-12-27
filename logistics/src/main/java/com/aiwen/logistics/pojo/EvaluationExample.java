package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class EvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationExample() {
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

        public Criteria andOrdersNumIsNull() {
            addCriterion("orders_num is null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumIsNotNull() {
            addCriterion("orders_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumEqualTo(String value) {
            addCriterion("orders_num =", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotEqualTo(String value) {
            addCriterion("orders_num <>", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumGreaterThan(String value) {
            addCriterion("orders_num >", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumGreaterThanOrEqualTo(String value) {
            addCriterion("orders_num >=", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumLessThan(String value) {
            addCriterion("orders_num <", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumLessThanOrEqualTo(String value) {
            addCriterion("orders_num <=", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumLike(String value) {
            addCriterion("orders_num like", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotLike(String value) {
            addCriterion("orders_num not like", value, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumIn(List<String> values) {
            addCriterion("orders_num in", values, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotIn(List<String> values) {
            addCriterion("orders_num not in", values, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumBetween(String value1, String value2) {
            addCriterion("orders_num between", value1, value2, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andOrdersNumNotBetween(String value1, String value2) {
            addCriterion("orders_num not between", value1, value2, "ordersNum");
            return (Criteria) this;
        }

        public Criteria andStartAddressIsNull() {
            addCriterion("start_address is null");
            return (Criteria) this;
        }

        public Criteria andStartAddressIsNotNull() {
            addCriterion("start_address is not null");
            return (Criteria) this;
        }

        public Criteria andStartAddressEqualTo(String value) {
            addCriterion("start_address =", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotEqualTo(String value) {
            addCriterion("start_address <>", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressGreaterThan(String value) {
            addCriterion("start_address >", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressGreaterThanOrEqualTo(String value) {
            addCriterion("start_address >=", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLessThan(String value) {
            addCriterion("start_address <", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLessThanOrEqualTo(String value) {
            addCriterion("start_address <=", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLike(String value) {
            addCriterion("start_address like", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotLike(String value) {
            addCriterion("start_address not like", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressIn(List<String> values) {
            addCriterion("start_address in", values, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotIn(List<String> values) {
            addCriterion("start_address not in", values, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressBetween(String value1, String value2) {
            addCriterion("start_address between", value1, value2, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotBetween(String value1, String value2) {
            addCriterion("start_address not between", value1, value2, "startAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressIsNull() {
            addCriterion("arrive_address is null");
            return (Criteria) this;
        }

        public Criteria andArriveAddressIsNotNull() {
            addCriterion("arrive_address is not null");
            return (Criteria) this;
        }

        public Criteria andArriveAddressEqualTo(String value) {
            addCriterion("arrive_address =", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressNotEqualTo(String value) {
            addCriterion("arrive_address <>", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressGreaterThan(String value) {
            addCriterion("arrive_address >", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_address >=", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressLessThan(String value) {
            addCriterion("arrive_address <", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressLessThanOrEqualTo(String value) {
            addCriterion("arrive_address <=", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressLike(String value) {
            addCriterion("arrive_address like", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressNotLike(String value) {
            addCriterion("arrive_address not like", value, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressIn(List<String> values) {
            addCriterion("arrive_address in", values, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressNotIn(List<String> values) {
            addCriterion("arrive_address not in", values, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressBetween(String value1, String value2) {
            addCriterion("arrive_address between", value1, value2, "arriveAddress");
            return (Criteria) this;
        }

        public Criteria andArriveAddressNotBetween(String value1, String value2) {
            addCriterion("arrive_address not between", value1, value2, "arriveAddress");
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

        public Criteria andCarrierNameIsNull() {
            addCriterion("carrier_name is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNotNull() {
            addCriterion("carrier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualTo(String value) {
            addCriterion("carrier_name =", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualTo(String value) {
            addCriterion("carrier_name <>", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThan(String value) {
            addCriterion("carrier_name >", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_name >=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThan(String value) {
            addCriterion("carrier_name <", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("carrier_name <=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLike(String value) {
            addCriterion("carrier_name like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotLike(String value) {
            addCriterion("carrier_name not like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIn(List<String> values) {
            addCriterion("carrier_name in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotIn(List<String> values) {
            addCriterion("carrier_name not in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameBetween(String value1, String value2) {
            addCriterion("carrier_name between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotBetween(String value1, String value2) {
            addCriterion("carrier_name not between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationIsNull() {
            addCriterion("overall_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationIsNotNull() {
            addCriterion("overall_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationEqualTo(Integer value) {
            addCriterion("overall_evaluation =", value, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationNotEqualTo(Integer value) {
            addCriterion("overall_evaluation <>", value, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationGreaterThan(Integer value) {
            addCriterion("overall_evaluation >", value, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationGreaterThanOrEqualTo(Integer value) {
            addCriterion("overall_evaluation >=", value, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationLessThan(Integer value) {
            addCriterion("overall_evaluation <", value, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationLessThanOrEqualTo(Integer value) {
            addCriterion("overall_evaluation <=", value, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationIn(List<Integer> values) {
            addCriterion("overall_evaluation in", values, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationNotIn(List<Integer> values) {
            addCriterion("overall_evaluation not in", values, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationBetween(Integer value1, Integer value2) {
            addCriterion("overall_evaluation between", value1, value2, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andOverallEvaluationNotBetween(Integer value1, Integer value2) {
            addCriterion("overall_evaluation not between", value1, value2, "overallEvaluation");
            return (Criteria) this;
        }

        public Criteria andPunctualityIsNull() {
            addCriterion("punctuality is null");
            return (Criteria) this;
        }

        public Criteria andPunctualityIsNotNull() {
            addCriterion("punctuality is not null");
            return (Criteria) this;
        }

        public Criteria andPunctualityEqualTo(Integer value) {
            addCriterion("punctuality =", value, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityNotEqualTo(Integer value) {
            addCriterion("punctuality <>", value, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityGreaterThan(Integer value) {
            addCriterion("punctuality >", value, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("punctuality >=", value, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityLessThan(Integer value) {
            addCriterion("punctuality <", value, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityLessThanOrEqualTo(Integer value) {
            addCriterion("punctuality <=", value, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityIn(List<Integer> values) {
            addCriterion("punctuality in", values, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityNotIn(List<Integer> values) {
            addCriterion("punctuality not in", values, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityBetween(Integer value1, Integer value2) {
            addCriterion("punctuality between", value1, value2, "punctuality");
            return (Criteria) this;
        }

        public Criteria andPunctualityNotBetween(Integer value1, Integer value2) {
            addCriterion("punctuality not between", value1, value2, "punctuality");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityIsNull() {
            addCriterion("transport_integrity is null");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityIsNotNull() {
            addCriterion("transport_integrity is not null");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityEqualTo(Integer value) {
            addCriterion("transport_integrity =", value, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityNotEqualTo(Integer value) {
            addCriterion("transport_integrity <>", value, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityGreaterThan(Integer value) {
            addCriterion("transport_integrity >", value, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_integrity >=", value, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityLessThan(Integer value) {
            addCriterion("transport_integrity <", value, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityLessThanOrEqualTo(Integer value) {
            addCriterion("transport_integrity <=", value, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityIn(List<Integer> values) {
            addCriterion("transport_integrity in", values, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityNotIn(List<Integer> values) {
            addCriterion("transport_integrity not in", values, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityBetween(Integer value1, Integer value2) {
            addCriterion("transport_integrity between", value1, value2, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andTransportIntegrityNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_integrity not between", value1, value2, "transportIntegrity");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesIsNull() {
            addCriterion("other_messages is null");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesIsNotNull() {
            addCriterion("other_messages is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesEqualTo(String value) {
            addCriterion("other_messages =", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesNotEqualTo(String value) {
            addCriterion("other_messages <>", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesGreaterThan(String value) {
            addCriterion("other_messages >", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesGreaterThanOrEqualTo(String value) {
            addCriterion("other_messages >=", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesLessThan(String value) {
            addCriterion("other_messages <", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesLessThanOrEqualTo(String value) {
            addCriterion("other_messages <=", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesLike(String value) {
            addCriterion("other_messages like", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesNotLike(String value) {
            addCriterion("other_messages not like", value, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesIn(List<String> values) {
            addCriterion("other_messages in", values, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesNotIn(List<String> values) {
            addCriterion("other_messages not in", values, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesBetween(String value1, String value2) {
            addCriterion("other_messages between", value1, value2, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOtherMessagesNotBetween(String value1, String value2) {
            addCriterion("other_messages not between", value1, value2, "otherMessages");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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
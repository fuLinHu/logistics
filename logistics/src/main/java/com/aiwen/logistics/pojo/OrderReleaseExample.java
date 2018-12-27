package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderReleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderReleaseExample() {
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

        public Criteria andOrdersFlagIsNull() {
            addCriterion("orders_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagIsNotNull() {
            addCriterion("orders_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagEqualTo(Integer value) {
            addCriterion("orders_flag =", value, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagNotEqualTo(Integer value) {
            addCriterion("orders_flag <>", value, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagGreaterThan(Integer value) {
            addCriterion("orders_flag >", value, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_flag >=", value, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagLessThan(Integer value) {
            addCriterion("orders_flag <", value, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagLessThanOrEqualTo(Integer value) {
            addCriterion("orders_flag <=", value, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagIn(List<Integer> values) {
            addCriterion("orders_flag in", values, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagNotIn(List<Integer> values) {
            addCriterion("orders_flag not in", values, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagBetween(Integer value1, Integer value2) {
            addCriterion("orders_flag between", value1, value2, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_flag not between", value1, value2, "ordersFlag");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIsNull() {
            addCriterion("orders_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIsNotNull() {
            addCriterion("orders_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountEqualTo(Double value) {
            addCriterion("orders_amount =", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotEqualTo(Double value) {
            addCriterion("orders_amount <>", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountGreaterThan(Double value) {
            addCriterion("orders_amount >", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("orders_amount >=", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountLessThan(Double value) {
            addCriterion("orders_amount <", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountLessThanOrEqualTo(Double value) {
            addCriterion("orders_amount <=", value, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountIn(List<Double> values) {
            addCriterion("orders_amount in", values, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotIn(List<Double> values) {
            addCriterion("orders_amount not in", values, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountBetween(Double value1, Double value2) {
            addCriterion("orders_amount between", value1, value2, "ordersAmount");
            return (Criteria) this;
        }

        public Criteria andOrdersAmountNotBetween(Double value1, Double value2) {
            addCriterion("orders_amount not between", value1, value2, "ordersAmount");
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

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(Integer value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(Integer value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(Integer value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(Integer value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<Integer> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<Integer> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNull() {
            addCriterion("invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(Integer value) {
            addCriterion("invoice_id =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(Integer value) {
            addCriterion("invoice_id <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(Integer value) {
            addCriterion("invoice_id >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_id >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(Integer value) {
            addCriterion("invoice_id <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_id <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<Integer> values) {
            addCriterion("invoice_id in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<Integer> values) {
            addCriterion("invoice_id not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(Integer value1, Integer value2) {
            addCriterion("invoice_id between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_id not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdIsNull() {
            addCriterion("order_release_source_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdIsNotNull() {
            addCriterion("order_release_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdEqualTo(Integer value) {
            addCriterion("order_release_source_id =", value, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdNotEqualTo(Integer value) {
            addCriterion("order_release_source_id <>", value, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdGreaterThan(Integer value) {
            addCriterion("order_release_source_id >", value, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_release_source_id >=", value, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdLessThan(Integer value) {
            addCriterion("order_release_source_id <", value, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_release_source_id <=", value, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdIn(List<Integer> values) {
            addCriterion("order_release_source_id in", values, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdNotIn(List<Integer> values) {
            addCriterion("order_release_source_id not in", values, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("order_release_source_id between", value1, value2, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderReleaseSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_release_source_id not between", value1, value2, "orderReleaseSourceId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(String value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(String value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(String value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(String value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(String value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLike(String value) {
            addCriterion("complete_time like", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotLike(String value) {
            addCriterion("complete_time not like", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<String> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<String> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(String value1, String value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(String value1, String value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNull() {
            addCriterion("transport_mode is null");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNotNull() {
            addCriterion("transport_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTransportModeEqualTo(Integer value) {
            addCriterion("transport_mode =", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotEqualTo(Integer value) {
            addCriterion("transport_mode <>", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThan(Integer value) {
            addCriterion("transport_mode >", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_mode >=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThan(Integer value) {
            addCriterion("transport_mode <", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThanOrEqualTo(Integer value) {
            addCriterion("transport_mode <=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeIn(List<Integer> values) {
            addCriterion("transport_mode in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotIn(List<Integer> values) {
            addCriterion("transport_mode not in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeBetween(Integer value1, Integer value2) {
            addCriterion("transport_mode between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_mode not between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNull() {
            addCriterion("transport_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNotNull() {
            addCriterion("transport_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportIdEqualTo(Integer value) {
            addCriterion("transport_id =", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotEqualTo(Integer value) {
            addCriterion("transport_id <>", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThan(Integer value) {
            addCriterion("transport_id >", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_id >=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThan(Integer value) {
            addCriterion("transport_id <", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThanOrEqualTo(Integer value) {
            addCriterion("transport_id <=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdIn(List<Integer> values) {
            addCriterion("transport_id in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotIn(List<Integer> values) {
            addCriterion("transport_id not in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdBetween(Integer value1, Integer value2) {
            addCriterion("transport_id between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_id not between", value1, value2, "transportId");
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

        public Criteria andCarrierIdIsNull() {
            addCriterion("carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(Integer value) {
            addCriterion("carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(Integer value) {
            addCriterion("carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(Integer value) {
            addCriterion("carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(Integer value) {
            addCriterion("carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(Integer value) {
            addCriterion("carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<Integer> values) {
            addCriterion("carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<Integer> values) {
            addCriterion("carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(Integer value1, Integer value2) {
            addCriterion("carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Integer value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Integer value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Integer value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Integer value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Integer> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Integer> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIsNull() {
            addCriterion("transaction_time is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIsNotNull() {
            addCriterion("transaction_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeEqualTo(String value) {
            addCriterion("transaction_time =", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotEqualTo(String value) {
            addCriterion("transaction_time <>", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeGreaterThan(String value) {
            addCriterion("transaction_time >", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_time >=", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLessThan(String value) {
            addCriterion("transaction_time <", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLessThanOrEqualTo(String value) {
            addCriterion("transaction_time <=", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLike(String value) {
            addCriterion("transaction_time like", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotLike(String value) {
            addCriterion("transaction_time not like", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIn(List<String> values) {
            addCriterion("transaction_time in", values, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotIn(List<String> values) {
            addCriterion("transaction_time not in", values, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeBetween(String value1, String value2) {
            addCriterion("transaction_time between", value1, value2, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotBetween(String value1, String value2) {
            addCriterion("transaction_time not between", value1, value2, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andOfferIsNull() {
            addCriterion("offer is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsNotNull() {
            addCriterion("offer is not null");
            return (Criteria) this;
        }

        public Criteria andOfferEqualTo(Double value) {
            addCriterion("offer =", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotEqualTo(Double value) {
            addCriterion("offer <>", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThan(Double value) {
            addCriterion("offer >", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThanOrEqualTo(Double value) {
            addCriterion("offer >=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThan(Double value) {
            addCriterion("offer <", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThanOrEqualTo(Double value) {
            addCriterion("offer <=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferIn(List<Double> values) {
            addCriterion("offer in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotIn(List<Double> values) {
            addCriterion("offer not in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferBetween(Double value1, Double value2) {
            addCriterion("offer between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotBetween(Double value1, Double value2) {
            addCriterion("offer not between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andOtherAmountIsNull() {
            addCriterion("other_amount is null");
            return (Criteria) this;
        }

        public Criteria andOtherAmountIsNotNull() {
            addCriterion("other_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAmountEqualTo(Double value) {
            addCriterion("other_amount =", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountNotEqualTo(Double value) {
            addCriterion("other_amount <>", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountGreaterThan(Double value) {
            addCriterion("other_amount >", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("other_amount >=", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountLessThan(Double value) {
            addCriterion("other_amount <", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountLessThanOrEqualTo(Double value) {
            addCriterion("other_amount <=", value, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountIn(List<Double> values) {
            addCriterion("other_amount in", values, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountNotIn(List<Double> values) {
            addCriterion("other_amount not in", values, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountBetween(Double value1, Double value2) {
            addCriterion("other_amount between", value1, value2, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andOtherAmountNotBetween(Double value1, Double value2) {
            addCriterion("other_amount not between", value1, value2, "otherAmount");
            return (Criteria) this;
        }

        public Criteria andActualWeightIsNull() {
            addCriterion("actual_weight is null");
            return (Criteria) this;
        }

        public Criteria andActualWeightIsNotNull() {
            addCriterion("actual_weight is not null");
            return (Criteria) this;
        }

        public Criteria andActualWeightEqualTo(Double value) {
            addCriterion("actual_weight =", value, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightNotEqualTo(Double value) {
            addCriterion("actual_weight <>", value, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightGreaterThan(Double value) {
            addCriterion("actual_weight >", value, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("actual_weight >=", value, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightLessThan(Double value) {
            addCriterion("actual_weight <", value, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightLessThanOrEqualTo(Double value) {
            addCriterion("actual_weight <=", value, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightIn(List<Double> values) {
            addCriterion("actual_weight in", values, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightNotIn(List<Double> values) {
            addCriterion("actual_weight not in", values, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightBetween(Double value1, Double value2) {
            addCriterion("actual_weight between", value1, value2, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andActualWeightNotBetween(Double value1, Double value2) {
            addCriterion("actual_weight not between", value1, value2, "actualWeight");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(String value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(String value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(String value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(String value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(String value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLike(String value) {
            addCriterion("delivery_time like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotLike(String value) {
            addCriterion("delivery_time not like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<String> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<String> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(String value1, String value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(String value1, String value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeIsNull() {
            addCriterion("take_delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeIsNotNull() {
            addCriterion("take_delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeEqualTo(String value) {
            addCriterion("take_delivery_time =", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeNotEqualTo(String value) {
            addCriterion("take_delivery_time <>", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeGreaterThan(String value) {
            addCriterion("take_delivery_time >", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("take_delivery_time >=", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeLessThan(String value) {
            addCriterion("take_delivery_time <", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeLessThanOrEqualTo(String value) {
            addCriterion("take_delivery_time <=", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeLike(String value) {
            addCriterion("take_delivery_time like", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeNotLike(String value) {
            addCriterion("take_delivery_time not like", value, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeIn(List<String> values) {
            addCriterion("take_delivery_time in", values, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeNotIn(List<String> values) {
            addCriterion("take_delivery_time not in", values, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeBetween(String value1, String value2) {
            addCriterion("take_delivery_time between", value1, value2, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTakeDeliveryTimeNotBetween(String value1, String value2) {
            addCriterion("take_delivery_time not between", value1, value2, "takeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentIsNull() {
            addCriterion("order_document is null");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentIsNotNull() {
            addCriterion("order_document is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentEqualTo(String value) {
            addCriterion("order_document =", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentNotEqualTo(String value) {
            addCriterion("order_document <>", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentGreaterThan(String value) {
            addCriterion("order_document >", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentGreaterThanOrEqualTo(String value) {
            addCriterion("order_document >=", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentLessThan(String value) {
            addCriterion("order_document <", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentLessThanOrEqualTo(String value) {
            addCriterion("order_document <=", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentLike(String value) {
            addCriterion("order_document like", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentNotLike(String value) {
            addCriterion("order_document not like", value, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentIn(List<String> values) {
            addCriterion("order_document in", values, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentNotIn(List<String> values) {
            addCriterion("order_document not in", values, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentBetween(String value1, String value2) {
            addCriterion("order_document between", value1, value2, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentNotBetween(String value1, String value2) {
            addCriterion("order_document not between", value1, value2, "orderDocument");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsIsNull() {
            addCriterion("order_documents is null");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsIsNotNull() {
            addCriterion("order_documents is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsEqualTo(String value) {
            addCriterion("order_documents =", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsNotEqualTo(String value) {
            addCriterion("order_documents <>", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsGreaterThan(String value) {
            addCriterion("order_documents >", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsGreaterThanOrEqualTo(String value) {
            addCriterion("order_documents >=", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsLessThan(String value) {
            addCriterion("order_documents <", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsLessThanOrEqualTo(String value) {
            addCriterion("order_documents <=", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsLike(String value) {
            addCriterion("order_documents like", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsNotLike(String value) {
            addCriterion("order_documents not like", value, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsIn(List<String> values) {
            addCriterion("order_documents in", values, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsNotIn(List<String> values) {
            addCriterion("order_documents not in", values, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsBetween(String value1, String value2) {
            addCriterion("order_documents between", value1, value2, "orderDocuments");
            return (Criteria) this;
        }

        public Criteria andOrderDocumentsNotBetween(String value1, String value2) {
            addCriterion("order_documents not between", value1, value2, "orderDocuments");
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
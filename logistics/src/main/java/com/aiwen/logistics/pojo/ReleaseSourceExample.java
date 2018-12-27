package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReleaseSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseSourceExample() {
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

        public Criteria andSourceIdIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(Integer value) {
            addCriterion("source_id =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(Integer value) {
            addCriterion("source_id <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(Integer value) {
            addCriterion("source_id >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_id >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(Integer value) {
            addCriterion("source_id <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("source_id <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<Integer> values) {
            addCriterion("source_id in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<Integer> values) {
            addCriterion("source_id not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("source_id between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("source_id not between", value1, value2, "sourceId");
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

        public Criteria andPackIsNull() {
            addCriterion("pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("pack not between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(String value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(String value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(String value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(String value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(String value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLike(String value) {
            addCriterion("goods like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotLike(String value) {
            addCriterion("goods not like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<String> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<String> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(String value1, String value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(String value1, String value2) {
            addCriterion("goods not between", value1, value2, "goods");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(Integer value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(Integer value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(Integer value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(Integer value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<Integer> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<Integer> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(Integer value1, Integer value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andStrSupplierIsNull() {
            addCriterion("str_supplier is null");
            return (Criteria) this;
        }

        public Criteria andStrSupplierIsNotNull() {
            addCriterion("str_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andStrSupplierEqualTo(String value) {
            addCriterion("str_supplier =", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierNotEqualTo(String value) {
            addCriterion("str_supplier <>", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierGreaterThan(String value) {
            addCriterion("str_supplier >", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("str_supplier >=", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierLessThan(String value) {
            addCriterion("str_supplier <", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierLessThanOrEqualTo(String value) {
            addCriterion("str_supplier <=", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierLike(String value) {
            addCriterion("str_supplier like", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierNotLike(String value) {
            addCriterion("str_supplier not like", value, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierIn(List<String> values) {
            addCriterion("str_supplier in", values, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierNotIn(List<String> values) {
            addCriterion("str_supplier not in", values, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierBetween(String value1, String value2) {
            addCriterion("str_supplier between", value1, value2, "strSupplier");
            return (Criteria) this;
        }

        public Criteria andStrSupplierNotBetween(String value1, String value2) {
            addCriterion("str_supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andBiddingIsNull() {
            addCriterion("bidding is null");
            return (Criteria) this;
        }

        public Criteria andBiddingIsNotNull() {
            addCriterion("bidding is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingEqualTo(Integer value) {
            addCriterion("bidding =", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotEqualTo(Integer value) {
            addCriterion("bidding <>", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingGreaterThan(Integer value) {
            addCriterion("bidding >", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingGreaterThanOrEqualTo(Integer value) {
            addCriterion("bidding >=", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingLessThan(Integer value) {
            addCriterion("bidding <", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingLessThanOrEqualTo(Integer value) {
            addCriterion("bidding <=", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingIn(List<Integer> values) {
            addCriterion("bidding in", values, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotIn(List<Integer> values) {
            addCriterion("bidding not in", values, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingBetween(Integer value1, Integer value2) {
            addCriterion("bidding between", value1, value2, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotBetween(Integer value1, Integer value2) {
            addCriterion("bidding not between", value1, value2, "bidding");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNull() {
            addCriterion("return_reason is null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNotNull() {
            addCriterion("return_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonEqualTo(String value) {
            addCriterion("return_reason =", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotEqualTo(String value) {
            addCriterion("return_reason <>", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThan(String value) {
            addCriterion("return_reason >", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("return_reason >=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThan(String value) {
            addCriterion("return_reason <", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("return_reason <=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLike(String value) {
            addCriterion("return_reason like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotLike(String value) {
            addCriterion("return_reason not like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIn(List<String> values) {
            addCriterion("return_reason in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotIn(List<String> values) {
            addCriterion("return_reason not in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonBetween(String value1, String value2) {
            addCriterion("return_reason between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotBetween(String value1, String value2) {
            addCriterion("return_reason not between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andStartNameIsNull() {
            addCriterion("start_name is null");
            return (Criteria) this;
        }

        public Criteria andStartNameIsNotNull() {
            addCriterion("start_name is not null");
            return (Criteria) this;
        }

        public Criteria andStartNameEqualTo(String value) {
            addCriterion("start_name =", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotEqualTo(String value) {
            addCriterion("start_name <>", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameGreaterThan(String value) {
            addCriterion("start_name >", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameGreaterThanOrEqualTo(String value) {
            addCriterion("start_name >=", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameLessThan(String value) {
            addCriterion("start_name <", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameLessThanOrEqualTo(String value) {
            addCriterion("start_name <=", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameLike(String value) {
            addCriterion("start_name like", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotLike(String value) {
            addCriterion("start_name not like", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameIn(List<String> values) {
            addCriterion("start_name in", values, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotIn(List<String> values) {
            addCriterion("start_name not in", values, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameBetween(String value1, String value2) {
            addCriterion("start_name between", value1, value2, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotBetween(String value1, String value2) {
            addCriterion("start_name not between", value1, value2, "startName");
            return (Criteria) this;
        }

        public Criteria andStartPhoneIsNull() {
            addCriterion("start_phone is null");
            return (Criteria) this;
        }

        public Criteria andStartPhoneIsNotNull() {
            addCriterion("start_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStartPhoneEqualTo(String value) {
            addCriterion("start_phone =", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneNotEqualTo(String value) {
            addCriterion("start_phone <>", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneGreaterThan(String value) {
            addCriterion("start_phone >", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("start_phone >=", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneLessThan(String value) {
            addCriterion("start_phone <", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneLessThanOrEqualTo(String value) {
            addCriterion("start_phone <=", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneLike(String value) {
            addCriterion("start_phone like", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneNotLike(String value) {
            addCriterion("start_phone not like", value, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneIn(List<String> values) {
            addCriterion("start_phone in", values, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneNotIn(List<String> values) {
            addCriterion("start_phone not in", values, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneBetween(String value1, String value2) {
            addCriterion("start_phone between", value1, value2, "startPhone");
            return (Criteria) this;
        }

        public Criteria andStartPhoneNotBetween(String value1, String value2) {
            addCriterion("start_phone not between", value1, value2, "startPhone");
            return (Criteria) this;
        }

        public Criteria andArriveNameIsNull() {
            addCriterion("arrive_name is null");
            return (Criteria) this;
        }

        public Criteria andArriveNameIsNotNull() {
            addCriterion("arrive_name is not null");
            return (Criteria) this;
        }

        public Criteria andArriveNameEqualTo(String value) {
            addCriterion("arrive_name =", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameNotEqualTo(String value) {
            addCriterion("arrive_name <>", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameGreaterThan(String value) {
            addCriterion("arrive_name >", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_name >=", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameLessThan(String value) {
            addCriterion("arrive_name <", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameLessThanOrEqualTo(String value) {
            addCriterion("arrive_name <=", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameLike(String value) {
            addCriterion("arrive_name like", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameNotLike(String value) {
            addCriterion("arrive_name not like", value, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameIn(List<String> values) {
            addCriterion("arrive_name in", values, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameNotIn(List<String> values) {
            addCriterion("arrive_name not in", values, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameBetween(String value1, String value2) {
            addCriterion("arrive_name between", value1, value2, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArriveNameNotBetween(String value1, String value2) {
            addCriterion("arrive_name not between", value1, value2, "arriveName");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneIsNull() {
            addCriterion("arrive_phone is null");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneIsNotNull() {
            addCriterion("arrive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneEqualTo(String value) {
            addCriterion("arrive_phone =", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneNotEqualTo(String value) {
            addCriterion("arrive_phone <>", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneGreaterThan(String value) {
            addCriterion("arrive_phone >", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_phone >=", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneLessThan(String value) {
            addCriterion("arrive_phone <", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneLessThanOrEqualTo(String value) {
            addCriterion("arrive_phone <=", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneLike(String value) {
            addCriterion("arrive_phone like", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneNotLike(String value) {
            addCriterion("arrive_phone not like", value, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneIn(List<String> values) {
            addCriterion("arrive_phone in", values, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneNotIn(List<String> values) {
            addCriterion("arrive_phone not in", values, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneBetween(String value1, String value2) {
            addCriterion("arrive_phone between", value1, value2, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andArrivePhoneNotBetween(String value1, String value2) {
            addCriterion("arrive_phone not between", value1, value2, "arrivePhone");
            return (Criteria) this;
        }

        public Criteria andExpOfferIsNull() {
            addCriterion("exp_offer is null");
            return (Criteria) this;
        }

        public Criteria andExpOfferIsNotNull() {
            addCriterion("exp_offer is not null");
            return (Criteria) this;
        }

        public Criteria andExpOfferEqualTo(Double value) {
            addCriterion("exp_offer =", value, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferNotEqualTo(Double value) {
            addCriterion("exp_offer <>", value, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferGreaterThan(Double value) {
            addCriterion("exp_offer >", value, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferGreaterThanOrEqualTo(Double value) {
            addCriterion("exp_offer >=", value, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferLessThan(Double value) {
            addCriterion("exp_offer <", value, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferLessThanOrEqualTo(Double value) {
            addCriterion("exp_offer <=", value, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferIn(List<Double> values) {
            addCriterion("exp_offer in", values, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferNotIn(List<Double> values) {
            addCriterion("exp_offer not in", values, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferBetween(Double value1, Double value2) {
            addCriterion("exp_offer between", value1, value2, "expOffer");
            return (Criteria) this;
        }

        public Criteria andExpOfferNotBetween(Double value1, Double value2) {
            addCriterion("exp_offer not between", value1, value2, "expOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferIsNull() {
            addCriterion("plat_offer is null");
            return (Criteria) this;
        }

        public Criteria andPlatOfferIsNotNull() {
            addCriterion("plat_offer is not null");
            return (Criteria) this;
        }

        public Criteria andPlatOfferEqualTo(Double value) {
            addCriterion("plat_offer =", value, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferNotEqualTo(Double value) {
            addCriterion("plat_offer <>", value, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferGreaterThan(Double value) {
            addCriterion("plat_offer >", value, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferGreaterThanOrEqualTo(Double value) {
            addCriterion("plat_offer >=", value, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferLessThan(Double value) {
            addCriterion("plat_offer <", value, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferLessThanOrEqualTo(Double value) {
            addCriterion("plat_offer <=", value, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferIn(List<Double> values) {
            addCriterion("plat_offer in", values, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferNotIn(List<Double> values) {
            addCriterion("plat_offer not in", values, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferBetween(Double value1, Double value2) {
            addCriterion("plat_offer between", value1, value2, "platOffer");
            return (Criteria) this;
        }

        public Criteria andPlatOfferNotBetween(Double value1, Double value2) {
            addCriterion("plat_offer not between", value1, value2, "platOffer");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
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
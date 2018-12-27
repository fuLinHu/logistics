package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HotSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotSourceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andFreightWayIsNull() {
            addCriterion("freight_way is null");
            return (Criteria) this;
        }

        public Criteria andFreightWayIsNotNull() {
            addCriterion("freight_way is not null");
            return (Criteria) this;
        }

        public Criteria andFreightWayEqualTo(Integer value) {
            addCriterion("freight_way =", value, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayNotEqualTo(Integer value) {
            addCriterion("freight_way <>", value, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayGreaterThan(Integer value) {
            addCriterion("freight_way >", value, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_way >=", value, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayLessThan(Integer value) {
            addCriterion("freight_way <", value, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayLessThanOrEqualTo(Integer value) {
            addCriterion("freight_way <=", value, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayIn(List<Integer> values) {
            addCriterion("freight_way in", values, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayNotIn(List<Integer> values) {
            addCriterion("freight_way not in", values, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayBetween(Integer value1, Integer value2) {
            addCriterion("freight_way between", value1, value2, "freightWay");
            return (Criteria) this;
        }

        public Criteria andFreightWayNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_way not between", value1, value2, "freightWay");
            return (Criteria) this;
        }

        public Criteria andStartPlaceIsNull() {
            addCriterion("start_place is null");
            return (Criteria) this;
        }

        public Criteria andStartPlaceIsNotNull() {
            addCriterion("start_place is not null");
            return (Criteria) this;
        }

        public Criteria andStartPlaceEqualTo(String value) {
            addCriterion("start_place =", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceNotEqualTo(String value) {
            addCriterion("start_place <>", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceGreaterThan(String value) {
            addCriterion("start_place >", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("start_place >=", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceLessThan(String value) {
            addCriterion("start_place <", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceLessThanOrEqualTo(String value) {
            addCriterion("start_place <=", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceLike(String value) {
            addCriterion("start_place like", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceNotLike(String value) {
            addCriterion("start_place not like", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceIn(List<String> values) {
            addCriterion("start_place in", values, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceNotIn(List<String> values) {
            addCriterion("start_place not in", values, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceBetween(String value1, String value2) {
            addCriterion("start_place between", value1, value2, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceNotBetween(String value1, String value2) {
            addCriterion("start_place not between", value1, value2, "startPlace");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsIsNull() {
            addCriterion("description_goods is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsIsNotNull() {
            addCriterion("description_goods is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsEqualTo(String value) {
            addCriterion("description_goods =", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsNotEqualTo(String value) {
            addCriterion("description_goods <>", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsGreaterThan(String value) {
            addCriterion("description_goods >", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("description_goods >=", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsLessThan(String value) {
            addCriterion("description_goods <", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsLessThanOrEqualTo(String value) {
            addCriterion("description_goods <=", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsLike(String value) {
            addCriterion("description_goods like", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsNotLike(String value) {
            addCriterion("description_goods not like", value, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsIn(List<String> values) {
            addCriterion("description_goods in", values, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsNotIn(List<String> values) {
            addCriterion("description_goods not in", values, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsBetween(String value1, String value2) {
            addCriterion("description_goods between", value1, value2, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andDescriptionGoodsNotBetween(String value1, String value2) {
            addCriterion("description_goods not between", value1, value2, "descriptionGoods");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(Double value) {
            addCriterion("goods_weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(Double value) {
            addCriterion("goods_weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(Double value) {
            addCriterion("goods_weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(Double value) {
            addCriterion("goods_weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(Double value) {
            addCriterion("goods_weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<Double> values) {
            addCriterion("goods_weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<Double> values) {
            addCriterion("goods_weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(Double value1, Double value2) {
            addCriterion("goods_weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(Double value1, Double value2) {
            addCriterion("goods_weight not between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andStateGoodsIsNull() {
            addCriterion("state_goods is null");
            return (Criteria) this;
        }

        public Criteria andStateGoodsIsNotNull() {
            addCriterion("state_goods is not null");
            return (Criteria) this;
        }

        public Criteria andStateGoodsEqualTo(Integer value) {
            addCriterion("state_goods =", value, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsNotEqualTo(Integer value) {
            addCriterion("state_goods <>", value, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsGreaterThan(Integer value) {
            addCriterion("state_goods >", value, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_goods >=", value, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsLessThan(Integer value) {
            addCriterion("state_goods <", value, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("state_goods <=", value, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsIn(List<Integer> values) {
            addCriterion("state_goods in", values, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsNotIn(List<Integer> values) {
            addCriterion("state_goods not in", values, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsBetween(Integer value1, Integer value2) {
            addCriterion("state_goods between", value1, value2, "stateGoods");
            return (Criteria) this;
        }

        public Criteria andStateGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("state_goods not between", value1, value2, "stateGoods");
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
            addCriterionForJDBCDate("creat_date =", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("creat_date <>", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThan(Date value) {
            addCriterionForJDBCDate("creat_date >", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creat_date >=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThan(Date value) {
            addCriterionForJDBCDate("creat_date <", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creat_date <=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIn(List<Date> values) {
            addCriterionForJDBCDate("creat_date in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("creat_date not in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creat_date between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creat_date not between", value1, value2, "creatDate");
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
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
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
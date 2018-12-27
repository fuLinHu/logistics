package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class LandTransportationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LandTransportationExample() {
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

        public Criteria andCarInformationIdIsNull() {
            addCriterion("car_information_id is null");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdIsNotNull() {
            addCriterion("car_information_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdEqualTo(Integer value) {
            addCriterion("car_information_id =", value, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdNotEqualTo(Integer value) {
            addCriterion("car_information_id <>", value, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdGreaterThan(Integer value) {
            addCriterion("car_information_id >", value, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_information_id >=", value, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdLessThan(Integer value) {
            addCriterion("car_information_id <", value, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_information_id <=", value, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdIn(List<Integer> values) {
            addCriterion("car_information_id in", values, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdNotIn(List<Integer> values) {
            addCriterion("car_information_id not in", values, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("car_information_id between", value1, value2, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andCarInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_information_id not between", value1, value2, "carInformationId");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeIsNull() {
            addCriterion("departure_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeIsNotNull() {
            addCriterion("departure_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeEqualTo(String value) {
            addCriterion("departure_start_time =", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeNotEqualTo(String value) {
            addCriterion("departure_start_time <>", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeGreaterThan(String value) {
            addCriterion("departure_start_time >", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("departure_start_time >=", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeLessThan(String value) {
            addCriterion("departure_start_time <", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeLessThanOrEqualTo(String value) {
            addCriterion("departure_start_time <=", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeLike(String value) {
            addCriterion("departure_start_time like", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeNotLike(String value) {
            addCriterion("departure_start_time not like", value, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeIn(List<String> values) {
            addCriterion("departure_start_time in", values, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeNotIn(List<String> values) {
            addCriterion("departure_start_time not in", values, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeBetween(String value1, String value2) {
            addCriterion("departure_start_time between", value1, value2, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureStartTimeNotBetween(String value1, String value2) {
            addCriterion("departure_start_time not between", value1, value2, "departureStartTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeIsNull() {
            addCriterion("departure_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeIsNotNull() {
            addCriterion("departure_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeEqualTo(String value) {
            addCriterion("departure_end_time =", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeNotEqualTo(String value) {
            addCriterion("departure_end_time <>", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeGreaterThan(String value) {
            addCriterion("departure_end_time >", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("departure_end_time >=", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeLessThan(String value) {
            addCriterion("departure_end_time <", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeLessThanOrEqualTo(String value) {
            addCriterion("departure_end_time <=", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeLike(String value) {
            addCriterion("departure_end_time like", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeNotLike(String value) {
            addCriterion("departure_end_time not like", value, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeIn(List<String> values) {
            addCriterion("departure_end_time in", values, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeNotIn(List<String> values) {
            addCriterion("departure_end_time not in", values, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeBetween(String value1, String value2) {
            addCriterion("departure_end_time between", value1, value2, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureEndTimeNotBetween(String value1, String value2) {
            addCriterion("departure_end_time not between", value1, value2, "departureEndTime");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceIsNull() {
            addCriterion("departure_province is null");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceIsNotNull() {
            addCriterion("departure_province is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceEqualTo(String value) {
            addCriterion("departure_province =", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceNotEqualTo(String value) {
            addCriterion("departure_province <>", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceGreaterThan(String value) {
            addCriterion("departure_province >", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("departure_province >=", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceLessThan(String value) {
            addCriterion("departure_province <", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceLessThanOrEqualTo(String value) {
            addCriterion("departure_province <=", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceLike(String value) {
            addCriterion("departure_province like", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceNotLike(String value) {
            addCriterion("departure_province not like", value, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceIn(List<String> values) {
            addCriterion("departure_province in", values, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceNotIn(List<String> values) {
            addCriterion("departure_province not in", values, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceBetween(String value1, String value2) {
            addCriterion("departure_province between", value1, value2, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureProvinceNotBetween(String value1, String value2) {
            addCriterion("departure_province not between", value1, value2, "departureProvince");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIsNull() {
            addCriterion("departure_city is null");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIsNotNull() {
            addCriterion("departure_city is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureCityEqualTo(String value) {
            addCriterion("departure_city =", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotEqualTo(String value) {
            addCriterion("departure_city <>", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityGreaterThan(String value) {
            addCriterion("departure_city >", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityGreaterThanOrEqualTo(String value) {
            addCriterion("departure_city >=", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLessThan(String value) {
            addCriterion("departure_city <", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLessThanOrEqualTo(String value) {
            addCriterion("departure_city <=", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLike(String value) {
            addCriterion("departure_city like", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotLike(String value) {
            addCriterion("departure_city not like", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIn(List<String> values) {
            addCriterion("departure_city in", values, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotIn(List<String> values) {
            addCriterion("departure_city not in", values, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityBetween(String value1, String value2) {
            addCriterion("departure_city between", value1, value2, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotBetween(String value1, String value2) {
            addCriterion("departure_city not between", value1, value2, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaIsNull() {
            addCriterion("departure_area is null");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaIsNotNull() {
            addCriterion("departure_area is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaEqualTo(String value) {
            addCriterion("departure_area =", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaNotEqualTo(String value) {
            addCriterion("departure_area <>", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaGreaterThan(String value) {
            addCriterion("departure_area >", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaGreaterThanOrEqualTo(String value) {
            addCriterion("departure_area >=", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaLessThan(String value) {
            addCriterion("departure_area <", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaLessThanOrEqualTo(String value) {
            addCriterion("departure_area <=", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaLike(String value) {
            addCriterion("departure_area like", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaNotLike(String value) {
            addCriterion("departure_area not like", value, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaIn(List<String> values) {
            addCriterion("departure_area in", values, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaNotIn(List<String> values) {
            addCriterion("departure_area not in", values, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaBetween(String value1, String value2) {
            addCriterion("departure_area between", value1, value2, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDepartureAreaNotBetween(String value1, String value2) {
            addCriterion("departure_area not between", value1, value2, "departureArea");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceIsNull() {
            addCriterion("destination_province is null");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceIsNotNull() {
            addCriterion("destination_province is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceEqualTo(String value) {
            addCriterion("destination_province =", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceNotEqualTo(String value) {
            addCriterion("destination_province <>", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceGreaterThan(String value) {
            addCriterion("destination_province >", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("destination_province >=", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceLessThan(String value) {
            addCriterion("destination_province <", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceLessThanOrEqualTo(String value) {
            addCriterion("destination_province <=", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceLike(String value) {
            addCriterion("destination_province like", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceNotLike(String value) {
            addCriterion("destination_province not like", value, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceIn(List<String> values) {
            addCriterion("destination_province in", values, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceNotIn(List<String> values) {
            addCriterion("destination_province not in", values, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceBetween(String value1, String value2) {
            addCriterion("destination_province between", value1, value2, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationProvinceNotBetween(String value1, String value2) {
            addCriterion("destination_province not between", value1, value2, "destinationProvince");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIsNull() {
            addCriterion("destination_city is null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIsNotNull() {
            addCriterion("destination_city is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityEqualTo(String value) {
            addCriterion("destination_city =", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNotEqualTo(String value) {
            addCriterion("destination_city <>", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityGreaterThan(String value) {
            addCriterion("destination_city >", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityGreaterThanOrEqualTo(String value) {
            addCriterion("destination_city >=", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityLessThan(String value) {
            addCriterion("destination_city <", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityLessThanOrEqualTo(String value) {
            addCriterion("destination_city <=", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityLike(String value) {
            addCriterion("destination_city like", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNotLike(String value) {
            addCriterion("destination_city not like", value, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIn(List<String> values) {
            addCriterion("destination_city in", values, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNotIn(List<String> values) {
            addCriterion("destination_city not in", values, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityBetween(String value1, String value2) {
            addCriterion("destination_city between", value1, value2, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNotBetween(String value1, String value2) {
            addCriterion("destination_city not between", value1, value2, "destinationCity");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIsNull() {
            addCriterion("destination_area is null");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIsNotNull() {
            addCriterion("destination_area is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaEqualTo(String value) {
            addCriterion("destination_area =", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNotEqualTo(String value) {
            addCriterion("destination_area <>", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaGreaterThan(String value) {
            addCriterion("destination_area >", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaGreaterThanOrEqualTo(String value) {
            addCriterion("destination_area >=", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaLessThan(String value) {
            addCriterion("destination_area <", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaLessThanOrEqualTo(String value) {
            addCriterion("destination_area <=", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaLike(String value) {
            addCriterion("destination_area like", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNotLike(String value) {
            addCriterion("destination_area not like", value, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIn(List<String> values) {
            addCriterion("destination_area in", values, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNotIn(List<String> values) {
            addCriterion("destination_area not in", values, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaBetween(String value1, String value2) {
            addCriterion("destination_area between", value1, value2, "destinationArea");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNotBetween(String value1, String value2) {
            addCriterion("destination_area not between", value1, value2, "destinationArea");
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

        public Criteria andDepartureIsNull() {
            addCriterion("departure is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNotNull() {
            addCriterion("departure is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEqualTo(String value) {
            addCriterion("departure =", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotEqualTo(String value) {
            addCriterion("departure <>", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThan(String value) {
            addCriterion("departure >", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThanOrEqualTo(String value) {
            addCriterion("departure >=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThan(String value) {
            addCriterion("departure <", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThanOrEqualTo(String value) {
            addCriterion("departure <=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLike(String value) {
            addCriterion("departure like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotLike(String value) {
            addCriterion("departure not like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureIn(List<String> values) {
            addCriterion("departure in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotIn(List<String> values) {
            addCriterion("departure not in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureBetween(String value1, String value2) {
            addCriterion("departure between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotBetween(String value1, String value2) {
            addCriterion("departure not between", value1, value2, "departure");
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

        public Criteria andorderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andorderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andorderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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
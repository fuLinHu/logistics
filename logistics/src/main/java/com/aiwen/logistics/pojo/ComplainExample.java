package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainExample() {
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

        public Criteria andProblemDescriptionIsNull() {
            addCriterion("problem_description is null");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionIsNotNull() {
            addCriterion("problem_description is not null");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionEqualTo(String value) {
            addCriterion("problem_description =", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionNotEqualTo(String value) {
            addCriterion("problem_description <>", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionGreaterThan(String value) {
            addCriterion("problem_description >", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("problem_description >=", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionLessThan(String value) {
            addCriterion("problem_description <", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionLessThanOrEqualTo(String value) {
            addCriterion("problem_description <=", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionLike(String value) {
            addCriterion("problem_description like", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionNotLike(String value) {
            addCriterion("problem_description not like", value, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionIn(List<String> values) {
            addCriterion("problem_description in", values, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionNotIn(List<String> values) {
            addCriterion("problem_description not in", values, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionBetween(String value1, String value2) {
            addCriterion("problem_description between", value1, value2, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andProblemDescriptionNotBetween(String value1, String value2) {
            addCriterion("problem_description not between", value1, value2, "problemDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionIsNull() {
            addCriterion("detailed_description is null");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionIsNotNull() {
            addCriterion("detailed_description is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionEqualTo(String value) {
            addCriterion("detailed_description =", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionNotEqualTo(String value) {
            addCriterion("detailed_description <>", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionGreaterThan(String value) {
            addCriterion("detailed_description >", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_description >=", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionLessThan(String value) {
            addCriterion("detailed_description <", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionLessThanOrEqualTo(String value) {
            addCriterion("detailed_description <=", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionLike(String value) {
            addCriterion("detailed_description like", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionNotLike(String value) {
            addCriterion("detailed_description not like", value, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionIn(List<String> values) {
            addCriterion("detailed_description in", values, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionNotIn(List<String> values) {
            addCriterion("detailed_description not in", values, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionBetween(String value1, String value2) {
            addCriterion("detailed_description between", value1, value2, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andDetailedDescriptionNotBetween(String value1, String value2) {
            addCriterion("detailed_description not between", value1, value2, "detailedDescription");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesIsNull() {
            addCriterion("related_annexes is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesIsNotNull() {
            addCriterion("related_annexes is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesEqualTo(String value) {
            addCriterion("related_annexes =", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesNotEqualTo(String value) {
            addCriterion("related_annexes <>", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesGreaterThan(String value) {
            addCriterion("related_annexes >", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesGreaterThanOrEqualTo(String value) {
            addCriterion("related_annexes >=", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesLessThan(String value) {
            addCriterion("related_annexes <", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesLessThanOrEqualTo(String value) {
            addCriterion("related_annexes <=", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesLike(String value) {
            addCriterion("related_annexes like", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesNotLike(String value) {
            addCriterion("related_annexes not like", value, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesIn(List<String> values) {
            addCriterion("related_annexes in", values, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesNotIn(List<String> values) {
            addCriterion("related_annexes not in", values, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesBetween(String value1, String value2) {
            addCriterion("related_annexes between", value1, value2, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andRelatedAnnexesNotBetween(String value1, String value2) {
            addCriterion("related_annexes not between", value1, value2, "relatedAnnexes");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
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
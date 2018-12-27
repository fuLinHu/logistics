package com.aiwen.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class TransactionRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionRecordExample() {
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

        public Criteria andTransactionRecordIdIsNull() {
            addCriterion("transaction_record_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdIsNotNull() {
            addCriterion("transaction_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdEqualTo(Integer value) {
            addCriterion("transaction_record_id =", value, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdNotEqualTo(Integer value) {
            addCriterion("transaction_record_id <>", value, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdGreaterThan(Integer value) {
            addCriterion("transaction_record_id >", value, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_record_id >=", value, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdLessThan(Integer value) {
            addCriterion("transaction_record_id <", value, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_record_id <=", value, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdIn(List<Integer> values) {
            addCriterion("transaction_record_id in", values, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdNotIn(List<Integer> values) {
            addCriterion("transaction_record_id not in", values, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("transaction_record_id between", value1, value2, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_record_id not between", value1, value2, "transactionRecordId");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeIsNull() {
            addCriterion("transaction_code is null");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeIsNotNull() {
            addCriterion("transaction_code is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeEqualTo(Integer value) {
            addCriterion("transaction_code =", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeNotEqualTo(Integer value) {
            addCriterion("transaction_code <>", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeGreaterThan(Integer value) {
            addCriterion("transaction_code >", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_code >=", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeLessThan(Integer value) {
            addCriterion("transaction_code <", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_code <=", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeIn(List<Integer> values) {
            addCriterion("transaction_code in", values, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeNotIn(List<Integer> values) {
            addCriterion("transaction_code not in", values, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeBetween(Integer value1, Integer value2) {
            addCriterion("transaction_code between", value1, value2, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_code not between", value1, value2, "transactionCode");
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

        public Criteria andTransactionTypeIsNull() {
            addCriterion("transaction_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("transaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(Integer value) {
            addCriterion("transaction_type =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(Integer value) {
            addCriterion("transaction_type <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(Integer value) {
            addCriterion("transaction_type >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_type >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(Integer value) {
            addCriterion("transaction_type <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_type <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<Integer> values) {
            addCriterion("transaction_type in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<Integer> values) {
            addCriterion("transaction_type not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(Integer value1, Integer value2) {
            addCriterion("transaction_type between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_type not between", value1, value2, "transactionType");
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

        public Criteria andTransactionAmountIsNull() {
            addCriterion("transaction_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIsNotNull() {
            addCriterion("transaction_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountEqualTo(Double value) {
            addCriterion("transaction_amount =", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotEqualTo(Double value) {
            addCriterion("transaction_amount <>", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountGreaterThan(Double value) {
            addCriterion("transaction_amount >", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("transaction_amount >=", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountLessThan(Double value) {
            addCriterion("transaction_amount <", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountLessThanOrEqualTo(Double value) {
            addCriterion("transaction_amount <=", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIn(List<Double> values) {
            addCriterion("transaction_amount in", values, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotIn(List<Double> values) {
            addCriterion("transaction_amount not in", values, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountBetween(Double value1, Double value2) {
            addCriterion("transaction_amount between", value1, value2, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotBetween(Double value1, Double value2) {
            addCriterion("transaction_amount not between", value1, value2, "transactionAmount");
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
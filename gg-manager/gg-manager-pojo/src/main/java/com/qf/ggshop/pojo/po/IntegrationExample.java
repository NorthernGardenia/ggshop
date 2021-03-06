package com.qf.ggshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegrationExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Long value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Long value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Long value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Long value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Long value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Long value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Long> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Long> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Long value1, Long value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Long value1, Long value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andSbst1IsNull() {
            addCriterion("sbst1 is null");
            return (Criteria) this;
        }

        public Criteria andSbst1IsNotNull() {
            addCriterion("sbst1 is not null");
            return (Criteria) this;
        }

        public Criteria andSbst1EqualTo(String value) {
            addCriterion("sbst1 =", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1NotEqualTo(String value) {
            addCriterion("sbst1 <>", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1GreaterThan(String value) {
            addCriterion("sbst1 >", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1GreaterThanOrEqualTo(String value) {
            addCriterion("sbst1 >=", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1LessThan(String value) {
            addCriterion("sbst1 <", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1LessThanOrEqualTo(String value) {
            addCriterion("sbst1 <=", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1Like(String value) {
            addCriterion("sbst1 like", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1NotLike(String value) {
            addCriterion("sbst1 not like", value, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1In(List<String> values) {
            addCriterion("sbst1 in", values, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1NotIn(List<String> values) {
            addCriterion("sbst1 not in", values, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1Between(String value1, String value2) {
            addCriterion("sbst1 between", value1, value2, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst1NotBetween(String value1, String value2) {
            addCriterion("sbst1 not between", value1, value2, "sbst1");
            return (Criteria) this;
        }

        public Criteria andSbst2IsNull() {
            addCriterion("sbst2 is null");
            return (Criteria) this;
        }

        public Criteria andSbst2IsNotNull() {
            addCriterion("sbst2 is not null");
            return (Criteria) this;
        }

        public Criteria andSbst2EqualTo(String value) {
            addCriterion("sbst2 =", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2NotEqualTo(String value) {
            addCriterion("sbst2 <>", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2GreaterThan(String value) {
            addCriterion("sbst2 >", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2GreaterThanOrEqualTo(String value) {
            addCriterion("sbst2 >=", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2LessThan(String value) {
            addCriterion("sbst2 <", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2LessThanOrEqualTo(String value) {
            addCriterion("sbst2 <=", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2Like(String value) {
            addCriterion("sbst2 like", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2NotLike(String value) {
            addCriterion("sbst2 not like", value, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2In(List<String> values) {
            addCriterion("sbst2 in", values, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2NotIn(List<String> values) {
            addCriterion("sbst2 not in", values, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2Between(String value1, String value2) {
            addCriterion("sbst2 between", value1, value2, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst2NotBetween(String value1, String value2) {
            addCriterion("sbst2 not between", value1, value2, "sbst2");
            return (Criteria) this;
        }

        public Criteria andSbst3IsNull() {
            addCriterion("sbst3 is null");
            return (Criteria) this;
        }

        public Criteria andSbst3IsNotNull() {
            addCriterion("sbst3 is not null");
            return (Criteria) this;
        }

        public Criteria andSbst3EqualTo(String value) {
            addCriterion("sbst3 =", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3NotEqualTo(String value) {
            addCriterion("sbst3 <>", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3GreaterThan(String value) {
            addCriterion("sbst3 >", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3GreaterThanOrEqualTo(String value) {
            addCriterion("sbst3 >=", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3LessThan(String value) {
            addCriterion("sbst3 <", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3LessThanOrEqualTo(String value) {
            addCriterion("sbst3 <=", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3Like(String value) {
            addCriterion("sbst3 like", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3NotLike(String value) {
            addCriterion("sbst3 not like", value, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3In(List<String> values) {
            addCriterion("sbst3 in", values, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3NotIn(List<String> values) {
            addCriterion("sbst3 not in", values, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3Between(String value1, String value2) {
            addCriterion("sbst3 between", value1, value2, "sbst3");
            return (Criteria) this;
        }

        public Criteria andSbst3NotBetween(String value1, String value2) {
            addCriterion("sbst3 not between", value1, value2, "sbst3");
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
package com.qf.ggshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIsNull() {
            addCriterion("comment_user is null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIsNotNull() {
            addCriterion("comment_user is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUserEqualTo(String value) {
            addCriterion("comment_user =", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserNotEqualTo(String value) {
            addCriterion("comment_user <>", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserGreaterThan(String value) {
            addCriterion("comment_user >", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserGreaterThanOrEqualTo(String value) {
            addCriterion("comment_user >=", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserLessThan(String value) {
            addCriterion("comment_user <", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserLessThanOrEqualTo(String value) {
            addCriterion("comment_user <=", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserLike(String value) {
            addCriterion("comment_user like", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserNotLike(String value) {
            addCriterion("comment_user not like", value, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserIn(List<String> values) {
            addCriterion("comment_user in", values, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserNotIn(List<String> values) {
            addCriterion("comment_user not in", values, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserBetween(String value1, String value2) {
            addCriterion("comment_user between", value1, value2, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCommentUserNotBetween(String value1, String value2) {
            addCriterion("comment_user not between", value1, value2, "commentUser");
            return (Criteria) this;
        }

        public Criteria andCContentIsNull() {
            addCriterion("c_content is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("c_content is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("c_content =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("c_content <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("c_content >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_content >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("c_content <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("c_content <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("c_content like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("c_content not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("c_content in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("c_content not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("c_content between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("c_content not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andRepContentIsNull() {
            addCriterion("rep_content is null");
            return (Criteria) this;
        }

        public Criteria andRepContentIsNotNull() {
            addCriterion("rep_content is not null");
            return (Criteria) this;
        }

        public Criteria andRepContentEqualTo(String value) {
            addCriterion("rep_content =", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotEqualTo(String value) {
            addCriterion("rep_content <>", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentGreaterThan(String value) {
            addCriterion("rep_content >", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentGreaterThanOrEqualTo(String value) {
            addCriterion("rep_content >=", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentLessThan(String value) {
            addCriterion("rep_content <", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentLessThanOrEqualTo(String value) {
            addCriterion("rep_content <=", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentLike(String value) {
            addCriterion("rep_content like", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotLike(String value) {
            addCriterion("rep_content not like", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentIn(List<String> values) {
            addCriterion("rep_content in", values, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotIn(List<String> values) {
            addCriterion("rep_content not in", values, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentBetween(String value1, String value2) {
            addCriterion("rep_content between", value1, value2, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotBetween(String value1, String value2) {
            addCriterion("rep_content not between", value1, value2, "repContent");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeIsNull() {
            addCriterion("rep_time is null");
            return (Criteria) this;
        }

        public Criteria andRepTimeIsNotNull() {
            addCriterion("rep_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepTimeEqualTo(Date value) {
            addCriterion("rep_time =", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotEqualTo(Date value) {
            addCriterion("rep_time <>", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeGreaterThan(Date value) {
            addCriterion("rep_time >", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rep_time >=", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeLessThan(Date value) {
            addCriterion("rep_time <", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeLessThanOrEqualTo(Date value) {
            addCriterion("rep_time <=", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeIn(List<Date> values) {
            addCriterion("rep_time in", values, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotIn(List<Date> values) {
            addCriterion("rep_time not in", values, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeBetween(Date value1, Date value2) {
            addCriterion("rep_time between", value1, value2, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotBetween(Date value1, Date value2) {
            addCriterion("rep_time not between", value1, value2, "repTime");
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
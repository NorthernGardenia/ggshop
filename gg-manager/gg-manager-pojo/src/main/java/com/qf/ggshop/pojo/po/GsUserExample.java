package com.qf.ggshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GsUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GsUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Byte value) {
            addCriterion("is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Byte value) {
            addCriterion("is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Byte value) {
            addCriterion("is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Byte value) {
            addCriterion("is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Byte value) {
            addCriterion("is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Byte> values) {
            addCriterion("is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Byte> values) {
            addCriterion("is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Byte value1, Byte value2) {
            addCriterion("is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Byte value1, Byte value2) {
            addCriterion("is_admin not between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Byte value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Byte value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Byte value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Byte value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Byte value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Byte value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Byte> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Byte> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Byte value1, Byte value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Byte value1, Byte value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andItgIdIsNull() {
            addCriterion("itg_id is null");
            return (Criteria) this;
        }

        public Criteria andItgIdIsNotNull() {
            addCriterion("itg_id is not null");
            return (Criteria) this;
        }

        public Criteria andItgIdEqualTo(Integer value) {
            addCriterion("itg_id =", value, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdNotEqualTo(Integer value) {
            addCriterion("itg_id <>", value, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdGreaterThan(Integer value) {
            addCriterion("itg_id >", value, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("itg_id >=", value, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdLessThan(Integer value) {
            addCriterion("itg_id <", value, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdLessThanOrEqualTo(Integer value) {
            addCriterion("itg_id <=", value, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdIn(List<Integer> values) {
            addCriterion("itg_id in", values, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdNotIn(List<Integer> values) {
            addCriterion("itg_id not in", values, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdBetween(Integer value1, Integer value2) {
            addCriterion("itg_id between", value1, value2, "itgId");
            return (Criteria) this;
        }

        public Criteria andItgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("itg_id not between", value1, value2, "itgId");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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
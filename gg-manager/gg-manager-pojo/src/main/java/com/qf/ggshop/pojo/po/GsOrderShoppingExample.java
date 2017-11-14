package com.qf.ggshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GsOrderShoppingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GsOrderShoppingExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIsNull() {
            addCriterion("receiver_tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIsNotNull() {
            addCriterion("receiver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTelEqualTo(String value) {
            addCriterion("receiver_tel =", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotEqualTo(String value) {
            addCriterion("receiver_tel <>", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelGreaterThan(String value) {
            addCriterion("receiver_tel >", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_tel >=", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLessThan(String value) {
            addCriterion("receiver_tel <", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLessThanOrEqualTo(String value) {
            addCriterion("receiver_tel <=", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLike(String value) {
            addCriterion("receiver_tel like", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotLike(String value) {
            addCriterion("receiver_tel not like", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIn(List<String> values) {
            addCriterion("receiver_tel in", values, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotIn(List<String> values) {
            addCriterion("receiver_tel not in", values, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelBetween(String value1, String value2) {
            addCriterion("receiver_tel between", value1, value2, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotBetween(String value1, String value2) {
            addCriterion("receiver_tel not between", value1, value2, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcIsNull() {
            addCriterion("receiver_prvc is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcIsNotNull() {
            addCriterion("receiver_prvc is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcEqualTo(String value) {
            addCriterion("receiver_prvc =", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcNotEqualTo(String value) {
            addCriterion("receiver_prvc <>", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcGreaterThan(String value) {
            addCriterion("receiver_prvc >", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_prvc >=", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcLessThan(String value) {
            addCriterion("receiver_prvc <", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcLessThanOrEqualTo(String value) {
            addCriterion("receiver_prvc <=", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcLike(String value) {
            addCriterion("receiver_prvc like", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcNotLike(String value) {
            addCriterion("receiver_prvc not like", value, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcIn(List<String> values) {
            addCriterion("receiver_prvc in", values, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcNotIn(List<String> values) {
            addCriterion("receiver_prvc not in", values, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcBetween(String value1, String value2) {
            addCriterion("receiver_prvc between", value1, value2, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverPrvcNotBetween(String value1, String value2) {
            addCriterion("receiver_prvc not between", value1, value2, "receiverPrvc");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityEqualTo(String value) {
            addCriterion("receiver_city =", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotEqualTo(String value) {
            addCriterion("receiver_city <>", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThan(String value) {
            addCriterion("receiver_city >", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_city >=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThan(String value) {
            addCriterion("receiver_city <", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThanOrEqualTo(String value) {
            addCriterion("receiver_city <=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLike(String value) {
            addCriterion("receiver_city like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotLike(String value) {
            addCriterion("receiver_city not like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIn(List<String> values) {
            addCriterion("receiver_city in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotIn(List<String> values) {
            addCriterion("receiver_city not in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityBetween(String value1, String value2) {
            addCriterion("receiver_city between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotBetween(String value1, String value2) {
            addCriterion("receiver_city not between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictIsNull() {
            addCriterion("receiver_district is null");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictIsNotNull() {
            addCriterion("receiver_district is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictEqualTo(String value) {
            addCriterion("receiver_district =", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictNotEqualTo(String value) {
            addCriterion("receiver_district <>", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictGreaterThan(String value) {
            addCriterion("receiver_district >", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_district >=", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictLessThan(String value) {
            addCriterion("receiver_district <", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictLessThanOrEqualTo(String value) {
            addCriterion("receiver_district <=", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictLike(String value) {
            addCriterion("receiver_district like", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictNotLike(String value) {
            addCriterion("receiver_district not like", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictIn(List<String> values) {
            addCriterion("receiver_district in", values, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictNotIn(List<String> values) {
            addCriterion("receiver_district not in", values, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictBetween(String value1, String value2) {
            addCriterion("receiver_district between", value1, value2, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictNotBetween(String value1, String value2) {
            addCriterion("receiver_district not between", value1, value2, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailIsNull() {
            addCriterion("receiver_detail is null");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailIsNotNull() {
            addCriterion("receiver_detail is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailEqualTo(String value) {
            addCriterion("receiver_detail =", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailNotEqualTo(String value) {
            addCriterion("receiver_detail <>", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailGreaterThan(String value) {
            addCriterion("receiver_detail >", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_detail >=", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailLessThan(String value) {
            addCriterion("receiver_detail <", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailLessThanOrEqualTo(String value) {
            addCriterion("receiver_detail <=", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailLike(String value) {
            addCriterion("receiver_detail like", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailNotLike(String value) {
            addCriterion("receiver_detail not like", value, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailIn(List<String> values) {
            addCriterion("receiver_detail in", values, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailNotIn(List<String> values) {
            addCriterion("receiver_detail not in", values, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailBetween(String value1, String value2) {
            addCriterion("receiver_detail between", value1, value2, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailNotBetween(String value1, String value2) {
            addCriterion("receiver_detail not between", value1, value2, "receiverDetail");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeIsNull() {
            addCriterion("receiver_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeIsNotNull() {
            addCriterion("receiver_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeEqualTo(String value) {
            addCriterion("receiver_code =", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeNotEqualTo(String value) {
            addCriterion("receiver_code <>", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeGreaterThan(String value) {
            addCriterion("receiver_code >", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_code >=", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeLessThan(String value) {
            addCriterion("receiver_code <", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_code <=", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeLike(String value) {
            addCriterion("receiver_code like", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeNotLike(String value) {
            addCriterion("receiver_code not like", value, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeIn(List<String> values) {
            addCriterion("receiver_code in", values, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeNotIn(List<String> values) {
            addCriterion("receiver_code not in", values, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeBetween(String value1, String value2) {
            addCriterion("receiver_code between", value1, value2, "receiverCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCodeNotBetween(String value1, String value2) {
            addCriterion("receiver_code not between", value1, value2, "receiverCode");
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
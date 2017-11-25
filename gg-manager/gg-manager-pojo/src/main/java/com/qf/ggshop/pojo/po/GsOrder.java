package com.qf.ggshop.pojo.po;

import java.util.Date;

public class GsOrder {
    private String orderId;  //订单号

    private String payment;

    private Integer paymentType;

    private String postFee;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private Date paymentTime;

    private Date consignTime;

    private Date endTime;

    private Date closeTime;

    private String shoppingName;

    private String shopingCode; //物流单号

    private Long userId;

    private String buyerMessage;

    private String buyerNick;

    private Integer buyerRate;

    private String sbst1;

    private String sbst2;

    private String sbst3;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShoppingName() {
        return shoppingName;
    }

    public void setShoppingName(String shoppingName) {
        this.shoppingName = shoppingName == null ? null : shoppingName.trim();
    }

    public String getShopingCode() {
        return shopingCode;
    }

    public void setShopingCode(String shopingCode) {
        this.shopingCode = shopingCode == null ? null : shopingCode.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public Integer getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }

    public String getSbst1() {
        return sbst1;
    }

    public void setSbst1(String sbst1) {
        this.sbst1 = sbst1 == null ? null : sbst1.trim();
    }

    public String getSbst2() {
        return sbst2;
    }

    public void setSbst2(String sbst2) {
        this.sbst2 = sbst2 == null ? null : sbst2.trim();
    }

    public String getSbst3() {
        return sbst3;
    }

    public void setSbst3(String sbst3) {
        this.sbst3 = sbst3 == null ? null : sbst3.trim();
    }
}
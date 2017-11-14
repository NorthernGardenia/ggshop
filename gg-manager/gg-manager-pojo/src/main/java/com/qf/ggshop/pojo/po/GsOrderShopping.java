package com.qf.ggshop.pojo.po;

import java.util.Date;

public class GsOrderShopping {
    private String orderId;

    private String receiverName;

    private String receiverTel;

    private String receiverMobile;

    private String receiverPrvc;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverDetail;

    private String receiverCode;

    private Date gmtCreate;

    private Date gmtModified;

    private String sbst1;

    private String sbst2;

    private String sbst3;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel == null ? null : receiverTel.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverPrvc() {
        return receiverPrvc;
    }

    public void setReceiverPrvc(String receiverPrvc) {
        this.receiverPrvc = receiverPrvc == null ? null : receiverPrvc.trim();
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    public String getReceiverDetail() {
        return receiverDetail;
    }

    public void setReceiverDetail(String receiverDetail) {
        this.receiverDetail = receiverDetail == null ? null : receiverDetail.trim();
    }

    public String getReceiverCode() {
        return receiverCode;
    }

    public void setReceiverCode(String receiverCode) {
        this.receiverCode = receiverCode == null ? null : receiverCode.trim();
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
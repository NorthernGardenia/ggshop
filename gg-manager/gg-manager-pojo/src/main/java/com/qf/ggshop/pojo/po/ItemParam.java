package com.qf.ggshop.pojo.po;

import java.util.Date;

public class ItemParam {
    private Long id;

    private Long itemCatId;

    private Date gmtCreate;

    private Date gmtModified;

    private String text1;

    private String text2;

    private String paramDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
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

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1 == null ? null : text1.trim();
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }

    public String getParamDate() {
        return paramDate;
    }

    public void setParamDate(String paramDate) {
        this.paramDate = paramDate == null ? null : paramDate.trim();
    }
}
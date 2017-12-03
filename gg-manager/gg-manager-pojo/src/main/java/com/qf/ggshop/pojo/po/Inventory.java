package com.qf.ggshop.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class Inventory {
    private Long id;

    private Long itemId;

    private String sellNum;

    private String itemNum;

    private String itemTotal;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getSellNum() {
        return sellNum;
    }

    public void setSellNum(String sellNum) {
        this.sellNum = sellNum;
    }

    public String getItemNum() {
        return itemNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public String getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(String itemTotal) {
        this.itemTotal = itemTotal;
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

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", sellNum=" + sellNum +
                ", itemNum=" + itemNum +
                ", itemTotal=" + itemTotal +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
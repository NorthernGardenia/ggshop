package com.qf.ggshop.pojo.vo;

import com.qf.ggshop.pojo.po.GsOrder;

import java.math.BigDecimal;

public class OrderCustom extends GsOrder{

     private String  itemname;
     private String  username;
     private Integer num;
     private BigDecimal price;
     private BigDecimal totalFee;
     private String receiverName;
     private String receiverMobile;
     private String receiverPrvc;
    
    
    public String getItemname() {
        return itemname;
    }
    
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public Integer getNum() {
        return num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public BigDecimal getTotalFee() {
        return totalFee;
    }
    
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }
    
    public String getReceiverName() {
        return receiverName;
    }
    
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    
    public String getReceiverMobile() {
        return receiverMobile;
    }
    
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }
    
    public String getReceiverPrvc() {
        return receiverPrvc;
    }
    
    public void setReceiverPrvc(String receiverPrvc) {
        this.receiverPrvc = receiverPrvc;
    }
}

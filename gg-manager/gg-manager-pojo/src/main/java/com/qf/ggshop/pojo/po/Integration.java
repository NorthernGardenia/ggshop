package com.qf.ggshop.pojo.po;

import java.util.Date;

public class Integration {
    private Long id;

    private Long credit;

    private Date gmtCreate;

    private Date gmtModified;

    private String operator;

    private String sbst1;

    private String sbst2;

    private String sbst3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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
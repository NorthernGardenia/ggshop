package com.qf.ggshop.pojo.po;

import java.util.Date;

public class Comment {
    private Long id;

    private Long itemId;

    private String commentUser;

    private String cContent;

    private String repContent;

    private Date commentTime;

    private Date repTime;

    private String sbst1;

    private String sbst2;

    private String sbst3;

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

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser == null ? null : commentUser.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public String getRepContent() {
        return repContent;
    }

    public void setRepContent(String repContent) {
        this.repContent = repContent == null ? null : repContent.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getRepTime() {
        return repTime;
    }

    public void setRepTime(Date repTime) {
        this.repTime = repTime;
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
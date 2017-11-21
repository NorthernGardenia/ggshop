package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.Comment;

import java.util.List;
import java.util.Map;

public interface ItemCommentMapper {
    int countComments(Map<String, Object> map);


    List<Comment> listCommentsByPage(Map<String,Object> map);
}

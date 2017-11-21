package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.dao.ItemCommentMapper;
import com.qf.ggshop.pojo.po.Comment;
import com.qf.ggshop.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private ItemCommentMapper itemCommentDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result<Comment> listCommentsByPage(Long itemId, Page page) {
        Result<Comment> result = null;
        try{
            result = new Result<Comment>();

            Map<String,Object> map = new HashMap<>();
            map.put("itemId",itemId);
            map.put("page",page);

            int i = itemCommentDao.countComments(map);

            List<Comment> list = itemCommentDao.listCommentsByPage(map);

            result.setTotal(i);
            result.setRows(list);


        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return result;
    }



}

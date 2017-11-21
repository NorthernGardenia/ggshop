package com.qf.ggshop.web;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.Comment;
import com.qf.ggshop.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentAction {
    @Autowired
    private CommentService commentService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * 请求地址： comments/itemId/{itemId}
     * @param itemId
     * @param page
     * @return
     */

    @ResponseBody
    @RequestMapping("/comments/itemId/{itemId}")
    public Result<Comment> listCommentsByPage(@PathVariable("itemId") Long itemId, Page page){
        Result<Comment> result = null;
        try {
            result = new Result<Comment>();
            result = commentService.listCommentsByPage(itemId,page);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }


        return result;
    }



}

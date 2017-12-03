package com.qf.ggshop.search.web;

import com.qf.ggshop.pojo.vo.SearchItemResult;
import com.qf.ggshop.service.SearchItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;

@Controller
public class SearchIndexAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SearchItemService searchItemService;

    @RequestMapping("/")
    public  String searchIndex(String keyword, @RequestParam(defaultValue = "1") Integer page, Model model){

        if (keyword != null) {
            try {
                keyword=new String(keyword.getBytes("iso-8859-1"),"utf-8");
                //查询商品列表
                SearchItemResult searchResult=searchItemService.search(keyword,page,60);
                model.addAttribute("query", keyword);
                model.addAttribute("totalPages", searchResult.getTotalPages());
                model.addAttribute("page", page);
                model.addAttribute("recourdCount", searchResult.getRecordCount());
                model.addAttribute("itemList", searchResult.getItemList());
                //把结果传给页面

            } catch (UnsupportedEncodingException e) {
                logger.error(e.getMessage(),e);
                e.printStackTrace();
            }
        }
        return "search";
    }
}

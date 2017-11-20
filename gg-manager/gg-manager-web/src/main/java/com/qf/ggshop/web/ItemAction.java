package com.qf.ggshop.web;



import com.qf.ggshop.pojo.vo.ItemCustom;
import com.qf.ggshop.service.ItemService;
import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Scope("prototype")
public class ItemAction {
    @Autowired
    private ItemService itemService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @ResponseBody
    @RequestMapping("/items")
    public Result<ItemCustom> listItemsByPage(Page page){
        Result<ItemCustom> result = null;
        try{
            result = new Result<ItemCustom>();

            result = itemService.listItemsByPage(page);

        }catch (Exception e){

            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return result;
    }

    @ResponseBody
    @RequestMapping("/items/batch")
    public int updateBatch(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=itemService.updateBatch(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/items/down")
    public int downItems(@RequestParam("ids[]") List<Long> ids){
        int i = 0;
        try {
            i = itemService.downItems(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/items/up")
    public int upItems(@RequestParam("ids[]") List<Long> ids){
        int i = 0;
        try {
            i = itemService.upItems(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}

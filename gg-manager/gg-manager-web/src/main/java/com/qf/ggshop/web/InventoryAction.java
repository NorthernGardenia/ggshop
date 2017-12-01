package com.qf.ggshop.web;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.Inventory;
import com.qf.ggshop.service.InventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
public class InventoryAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private InventoryService inventoryService;

    @ResponseBody
    @RequestMapping("/inventory")
    public Result<Inventory> listGsUserByPage(Page page){
        Result<Inventory> result = null;
        try{
            result = new Result<Inventory>();

            result = inventoryService.listGsUserByPage(page);


        }catch (Exception e){

            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return result;

    }
}

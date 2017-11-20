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
import org.springframework.web.bind.annotation.ResponseBody;

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


}

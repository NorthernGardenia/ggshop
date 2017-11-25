package com.qf.ggshop.web;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.vo.OrderCustom;
import com.qf.ggshop.pojo.vo.OrderQuery;
import com.qf.ggshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderAction {
    
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private OrderService orderService;
    
    @ResponseBody
    @RequestMapping("/orders")
    public Result<OrderCustom> listOrdersByPage(Page page, OrderQuery query){
       
         Result<OrderCustom> result=null;
        try {
            result = new Result<OrderCustom>();
        
            result = orderService.listOrdersByPage(page,query);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        
        return result;
    }
    
}

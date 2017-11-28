package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.dao.ItemCustomMapper;
import com.qf.ggshop.dao.OrderCustomMapper;
import com.qf.ggshop.pojo.vo.ItemCustom;
import com.qf.ggshop.pojo.vo.OrderCustom;
import com.qf.ggshop.pojo.vo.OrderQuery;
import com.qf.ggshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private OrderCustomMapper orderCustomDao;
    
    @Override
    public Result<OrderCustom> listOrdersByPage(Page page, OrderQuery query) {
    
        Result<OrderCustom> result = null;
    
        try{
            result = new Result<OrderCustom>();
        
            Map<String,Object> map = new HashMap<>();
            map.put("page",page);
            map.put("query", query);
        
            int i = orderCustomDao.countOrders(map);
            List<OrderCustom> list = orderCustomDao.listOrdersByPage(map);
        
            
            result.setTotal(i);
            result.setRows(list);
        
        
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        
        return result;
    }
}

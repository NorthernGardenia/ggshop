package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.vo.ItemCustom;
import com.qf.ggshop.pojo.vo.OrderCustom;

import java.util.List;
import java.util.Map;

public interface OrderCustomMapper {
    
    
    int countOrders(Map<String, Object> map);
    
    List<OrderCustom> listOrdersByPage(Map<String, Object> map);
}

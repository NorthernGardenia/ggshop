package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.vo.OrderCustom;
import com.qf.ggshop.pojo.vo.OrderQuery;

public interface OrderService {
    //分页查找所有订单
    Result<OrderCustom> listOrdersByPage(Page page, OrderQuery query);
}

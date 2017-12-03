package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.GsOrder;
import com.qf.ggshop.pojo.po.GsOrderExample;
import com.qf.ggshop.pojo.po.Inventory;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface InventoryCustomMapper {
    int countInventory();

    List<Inventory> listInventoryByPage(Map<String,Object> map);

    Inventory selectInventoryById(Long id);

    int updateInventory(Inventory inventory);
}
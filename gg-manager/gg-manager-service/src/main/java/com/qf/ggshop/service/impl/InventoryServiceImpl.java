package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.dao.InventoryCustomMapper;
import com.qf.ggshop.dao.InventoryMapper;
import com.qf.ggshop.pojo.po.Inventory;
import com.qf.ggshop.service.InventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryCustomMapper inventoryCustomDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Result<Inventory> listGsUserByPage(Page page) {
        Result<Inventory> result = null;
        try{
            result = new Result<Inventory>();

            Map<String,Object> map =new HashMap<>();
            map.put("page",page);

            int i =inventoryCustomDao.countInventory();
            List<Inventory> list =inventoryCustomDao.listInventoryByPage(map);

            result.setTotal(i);
            result.setRows(list);



        }catch (Exception e){

            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
}

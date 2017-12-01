package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.Inventory;

public interface InventoryService {

    Result<Inventory> listGsUserByPage(Page page);

}

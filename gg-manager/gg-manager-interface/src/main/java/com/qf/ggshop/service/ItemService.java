package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.vo.ItemCustom;

public interface ItemService {


    Result<ItemCustom> listItemsByPage(Page page);
}

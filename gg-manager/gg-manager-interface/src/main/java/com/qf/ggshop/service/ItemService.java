package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.Item;
import com.qf.ggshop.pojo.po.ItmeDesc;
import com.qf.ggshop.pojo.vo.ItemCustom;

import java.util.List;

public interface ItemService {


    Result<ItemCustom> listItemsByPage(Page page);

    int updateBatch(List<Long> ids);

    int downItems(List<Long> ids);

    int upItems(List<Long> ids);

    Item seleceItemById(Long id);

    ItmeDesc selectDescById(Long id);
}

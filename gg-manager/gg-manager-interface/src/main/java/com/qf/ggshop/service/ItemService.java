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

    /**
     *  新增商品
     * @param Item 商品实体类
     * @param content 商品描述
     * @return 受到影响的行数
     */
    int  saveItem(Item Item, String content, String paramDate);

    ItmeDesc selectDescById(Long id);
}

package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.Item;
import com.qf.ggshop.pojo.vo.ItemCustom;

import java.util.List;
import java.util.Map;

public interface ItemCustomMapper {

    int countItems();

    List<ItemCustom> listItemsByPage(Map map);

}

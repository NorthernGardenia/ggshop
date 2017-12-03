package com.qf.ggshop.service;

import com.qf.ggshop.pojo.vo.SearchItemResult;

public interface SearchItemService {
    //查找所有商品
    boolean importAllItems();

    SearchItemResult search(String keyword, Integer page, int rows);
    //搜索
    
}

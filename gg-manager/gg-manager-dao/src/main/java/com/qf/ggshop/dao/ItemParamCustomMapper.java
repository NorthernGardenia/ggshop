package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.vo.ItemParamCustom;

import java.util.List;
import java.util.Map;

public interface ItemParamCustomMapper {
    //查询规格参数数据总数量
    int countItemParams();
    
    //分页查找每页的数据量
    List<ItemParamCustom> listItemParamsByPage(Map<String, Object> map);
    
    
}

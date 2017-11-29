package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.ItemParam;
import com.qf.ggshop.pojo.vo.ItemParamCustom;

public interface ItemParamService {
    Result<ItemParamCustom> listItemParamsByPage(Page page);
    
    int addGroupParams(Long cid, ItemParam itemParam);

    /**
     * 通过分类的ID查询ItemParam
     * @param  cid
     */
    ItemParam getItemParamByCid(Long cid);

}

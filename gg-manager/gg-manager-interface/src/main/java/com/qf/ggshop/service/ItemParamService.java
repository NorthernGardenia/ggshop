package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.vo.ItemParamCustom;

public interface ItemParamService {
    Result<ItemParamCustom> listItemParamsByPage(Page page);
}

package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.GsUser;

import java.util.List;

public interface GsUserService {
    Result<GsUser> listGsUserByPage(Page page);

    int freezeGsUser(List<Long> ids);

    int unfreezeGsUser(List<Long> ids);
}

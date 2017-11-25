package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.GsUser;
import com.qf.ggshop.pojo.vo.UserQuery;

import java.util.List;

public interface GsUserService {
    Result<GsUser> listGsUserByPage(Page page, UserQuery query);


    int freezeGsUser(List<Long> ids);
}

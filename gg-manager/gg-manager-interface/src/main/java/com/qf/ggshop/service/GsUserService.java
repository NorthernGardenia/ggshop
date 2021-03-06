package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.GsUser;
import com.qf.ggshop.pojo.vo.UserQuery;

import java.util.List;

public interface GsUserService {
    Result<GsUser> listGsUserByPage(Page page, UserQuery query);


    int freezeGsUser(List<Long> ids);

    int unfreezeGsUser(List<Long> ids);

    int saveGsUser(GsUser gsUser, String content);

    GsUser selevByUser(String username,String password);

    int selectGsUser(GsUser gsUser, String content);
}

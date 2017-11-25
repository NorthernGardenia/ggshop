package com.qf.ggshop.dao;


import com.qf.ggshop.pojo.po.GsUser;

import java.util.List;
import java.util.Map;

public interface GsUserCustomMapper {

    int countGsUser();

    List<GsUser> listGsUserByPage(Map<String,Object> map);
}
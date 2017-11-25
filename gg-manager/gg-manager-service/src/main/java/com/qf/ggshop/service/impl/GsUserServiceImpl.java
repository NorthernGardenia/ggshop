package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.dao.GsUserCustomMapper;
import com.qf.ggshop.pojo.po.GsUser;
import com.qf.ggshop.pojo.vo.UserQuery;
import com.qf.ggshop.service.GsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class GsUserServiceImpl implements GsUserService {

    @Autowired
    private GsUserCustomMapper gsUserCustomDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result<GsUser> listGsUserByPage(Page page, UserQuery query) {
        Result<GsUser> result = null;
        try{
            result = new Result<GsUser>();

            Map<String,Object> map =new HashMap<>();
            map.put("page",page);
            map.put("query",query);
            int i =gsUserCustomDao.countGsUser();
            List<GsUser> list =gsUserCustomDao.listGsUserByPage(map);

            result.setTotal(i);
            result.setRows(list);



        }catch (Exception e){

            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return result;
    }
}

package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.dao.GsUserCustomMapper;
import com.qf.ggshop.dao.GsUserMapper;
import com.qf.ggshop.pojo.po.GsUser;
import com.qf.ggshop.pojo.po.GsUserExample;
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

    @Autowired
    private GsUserMapper gsUserDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result<GsUser> listGsUserByPage(Page page) {
        Result<GsUser> result = null;
        try{
            result = new Result<GsUser>();

            Map<String,Object> map =new HashMap<>();
            map.put("page",page);

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

    @Override
    public int freezeGsUser(List<Long> ids) {
        int i=0;
        try {


            //准备商品对象,这个对象包含了状态为3的字段
            GsUser record = new GsUser();
            record.setStatus((byte)2);
            //创建更新模板
            GsUserExample example=new GsUserExample();
            GsUserExample.Criteria criteria=example.createCriteria();
            criteria.andIdIn(ids);
            //执行更新
            i=gsUserDao.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
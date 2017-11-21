package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.dao.ItemParamCustomMapper;
import com.qf.ggshop.dao.ItemParamMapper;
import com.qf.ggshop.pojo.po.ItemParam;
import com.qf.ggshop.pojo.vo.ItemParamCustom;
import com.qf.ggshop.service.ItemParamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemParamServiceImpl implements ItemParamService {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private ItemParamCustomMapper itemParamCustomDao;
    
    @Autowired
    private ItemParamMapper  itemParamDao;
    
    
    
    @Override
    public Result<ItemParamCustom> listItemParamsByPage(Page page) {
        Result<ItemParamCustom> result=null;
        try {
            Map<String, Object> map = new HashMap<String,Object>();
            map.put("page", page);
            //取出tb_item_param这张表的记录总数
            int count = itemParamCustomDao.countItemParams();
            //查找每页的数据集合
            List<ItemParamCustom> list = itemParamCustomDao.listItemParamsByPage(map);
            result=new Result<ItemParamCustom>();
            result.setTotal(count);
            result.setRows(list);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
    
    
    @Override
    public int addGroupParams(Long cid, ItemParam itemParam) {
        int i=0;
        try {
            itemParam.setId(cid);
            itemParam.setGmtCreate(new Date());
            itemParam.setGmtModified(new Date());
            
            //执行插入操作
            i+=itemParamDao.insertSelective(itemParam);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}

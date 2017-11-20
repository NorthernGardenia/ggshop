package com.qf.ggshop.service.impl;

import com.qf.ggshop.dao.ItemMapper;
import com.qf.ggshop.pojo.po.Item;
import com.qf.ggshop.pojo.po.ItemExample;
import com.qf.ggshop.pojo.vo.ItemCustom;
import com.qf.ggshop.service.ItemService;
import com.qf.ggshop.dao.ItemCustomMapper;
import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemCustomMapper itemCustomDao;

    @Autowired
    private ItemMapper itemDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result<ItemCustom> listItemsByPage(Page page) {
        Result<ItemCustom> result = null;
        try{
            result = new Result<ItemCustom>();

            Map<String,Object> map = new HashMap<>();
            map.put("page",page);

            int i = itemCustomDao.countItems();
            List<ItemCustom> list = itemCustomDao.listItemsByPage(map);



            result.setTotal(i);
            result.setRows(list);


        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;

    }

    @Override
    public int updateBatch(List<Long> ids) {
        int i=0;
        try {


            //准备商品对象,这个对象包含了状态为3的字段
            Item record = new Item();
            record.setStatus((byte)3);
            //创建更新模板
            ItemExample example=new ItemExample();
            ItemExample.Criteria criteria=example.createCriteria();
            criteria.andIdIn(ids);
            //执行更新
            i=itemDao.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}

package com.qf.ggshop.service.impl;

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
}

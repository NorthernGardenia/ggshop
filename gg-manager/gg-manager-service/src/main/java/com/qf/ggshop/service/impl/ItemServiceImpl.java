package com.qf.ggshop.service.impl;

import com.qf.ggshop.common.util.IDUtils;
import com.qf.ggshop.dao.ItemMapper;
import com.qf.ggshop.dao.ItmeDescMapper;
import com.qf.ggshop.pojo.po.Item;
import com.qf.ggshop.pojo.po.ItemExample;
import com.qf.ggshop.pojo.po.ItmeDesc;
import com.qf.ggshop.pojo.po.ItmeDescExample;
import com.qf.ggshop.pojo.vo.ItemCustom;
import com.qf.ggshop.service.ItemService;
import com.qf.ggshop.dao.ItemCustomMapper;
import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemCustomMapper itemCustomDao;

    @Autowired
    private ItemMapper itemDao;

    @Autowired
    private ItmeDescMapper itemDescDao;

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

    @Override
    public int downItems(List<Long> ids) {
        int i =0;
        try {
            Item record = new Item();
            record.setStatus((byte)2);

            ItemExample example = new ItemExample();
            ItemExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);

            i = itemDao.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int upItems(List<Long> ids) {
        int i =0;
        try {
            Item record = new Item();
            record.setStatus((byte)1);

            ItemExample example = new ItemExample();
            ItemExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);

            i = itemDao.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return 0;
    }


    /*
    * 通过id查询商品
    * */
    @Override
    public Item seleceItemById(Long id) {
        ItemExample example = new ItemExample();
        example.createCriteria().andIdEqualTo(id);
        List<Item> items = itemDao.selectByExample(example);
        return items.get(0);
    }


    /*
        获取商品详情By 商品Id
     */
    @Override
    public ItmeDesc selectDescById(Long id) {
        ItmeDescExample example = new ItmeDescExample();
        example.createCriteria().andItemIdEqualTo(id);
        List<ItmeDesc> itemDescs = itemDescDao.selectByExampleWithBLOBs(example);
        System.out.println(itemDescs);
        if(itemDescs != null && itemDescs.size()>0){
            return itemDescs.get(0);
        }
        return null;
    }

    /**
     * 新增商品
     */
    //加上注解@Transactional之后，这个方法就变成了事务方法
    //并不是事务方法越多越好，查询方法不需要添加为事务方法
    @Transactional
    @Override
    public int saveItem(Item Item, String content) {
        int i = 0;
        try {
            //这个方法中需要处理两张表格tb_item tb_item_desc
            //调用工具类生成商品的ID
            //处理tb_item
            Long itemId = IDUtils.getItemId();
            Item.setId(itemId);
            Item.setStatus((byte)2);
            Item.setId(itemId);
            i = itemDao.insert(Item);
            //处理tb_item_desc
            ItmeDesc desc = new ItmeDesc();
            desc.setItemId(itemId);
            desc.setItemDesc(content);

            i += itemDescDao.insert(desc);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

}

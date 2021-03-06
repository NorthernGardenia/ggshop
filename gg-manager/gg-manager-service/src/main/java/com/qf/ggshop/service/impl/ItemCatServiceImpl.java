package com.qf.ggshop.service.impl;


import com.qf.ggshop.common.dto.TreeNode;
import com.qf.ggshop.dao.ItemCatMapper;
import com.qf.ggshop.pojo.po.ItemCat;
import com.qf.ggshop.pojo.po.ItemCatExample;
import com.qf.ggshop.service.ItemCatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemCatServiceImpl implements ItemCatService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ItemCatMapper itemCatDao;

    @Override
    public List<TreeNode> listItemCatsByPid(Long parentId) {
        List<TreeNode> treeNodeList = null;
        try {
            //创建查询模板
            ItemCatExample example = new ItemCatExample();
            ItemCatExample.Criteria criteria = example.createCriteria();
            criteria.andParentIdEqualTo(parentId);
            //执行查询
            List<ItemCat> itemCatList = itemCatDao.selectByExample(example);
            //要序列化成JSON的列表对象
            treeNodeList = new ArrayList<TreeNode>();
            //遍历原有列表生成新列表
            for (int i=0;i<itemCatList.size();i++){
                ItemCat itemCat = itemCatList.get(i);
                TreeNode treeNode = new TreeNode();
                treeNode.setId(itemCat.getId());
                treeNode.setText(itemCat.getName());
                treeNode.setState(itemCat.getIsParent()? "closed":"open");

                treeNodeList.add(treeNode);
            }
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return treeNodeList;
    }
}

/*
package com.qf.ggshop.test;


import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.dao.ItemCustomMapper;
import com.qf.ggshop.pojo.vo.ItemCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class ItemServiceTest {
    @Autowired
    private ItemCustomMapper itemCustomDao;

    @Test
    public  void itemServiceTest(){

        int i = itemCustomDao.countItems();
        System.out.println(i);

        Page page = new Page();
        page.setPage(1);
        page.setRows(5);

        Map<String,Object> map = new HashMap<>();
        map.put("page",page);

        List<ItemCustom> list = itemCustomDao.listItemsByPage(map);

        System.out.println(list);

    }
}
*/

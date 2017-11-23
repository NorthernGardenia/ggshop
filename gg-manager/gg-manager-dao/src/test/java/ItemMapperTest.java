import com.qf.ggshop.dao.ItemMapper;
import com.qf.ggshop.pojo.po.Item;
import com.qf.ggshop.pojo.po.ItemExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class ItemMapperTest {

    @Autowired
    private ItemMapper itemDao;

    @Test
    public void selectByPrimaryKey() throws  Exception{
        ItemExample example = new ItemExample();
        example.createCriteria().andIdEqualTo(536563L);
        List<Item> items = itemDao.selectByExample(example);
        System.out.println(items);

    }

}
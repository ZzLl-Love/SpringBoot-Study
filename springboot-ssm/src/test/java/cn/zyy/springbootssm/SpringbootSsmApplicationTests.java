package cn.zyy.springbootssm;

import cn.zyy.springbootssm.domain.Item;
import cn.zyy.springbootssm.mapper.ItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSsmApplicationTests {

    @Autowired
    ItemMapper itemMapper;

    @Test
    void contextLoads() {

        Item item = new Item();
        item.setName("雷蛇");
        item.setRemark("高端游戏鼠标");
        itemMapper.saveItem(item);

        Item queryItem = itemMapper.queryItemById(1);
        System.out.println(queryItem);

    }

}

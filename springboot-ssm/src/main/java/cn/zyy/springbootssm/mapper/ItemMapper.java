package cn.zyy.springbootssm.mapper;

import cn.zyy.springbootssm.domain.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: Zz
 * @Date: 2023/11/18/17:16
 * @Description: 致敬
 */
@Mapper
public interface ItemMapper {

    @Select("select * from item where id = #{id}")
    Item queryItemById(Integer id);

    @Insert("insert into item(name, remark) value(#{name}, #{remark})")
    int saveItem(Item item);
}

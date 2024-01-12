package cn.zyy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Zz
 * @Date: 2023/12/02/17:01
 * @Description: 致敬
 */



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monster {
    private Integer id;
    private String name;
    private Integer age;
    private String skill;

}

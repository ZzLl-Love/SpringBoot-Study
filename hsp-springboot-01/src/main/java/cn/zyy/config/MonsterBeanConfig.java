package cn.zyy.config;

import cn.zyy.domain.Monster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Zz
 * @Date: 2023/12/02/17:20
 * @Description: 致敬
 */

@Configuration
public class MonsterBeanConfig {

    @Bean
    public Monster monster01(){
        return new Monster(1,"孙悟空",100,"翻跟头");
    }
}

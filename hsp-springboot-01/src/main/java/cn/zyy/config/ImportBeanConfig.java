package cn.zyy.config;

import cn.zyy.domain.Dog;
import cn.zyy.domain.Mine;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: Zz
 * @Date: 2023/12/02/17:46
 * @Description: 测试使用@Import注解来注入bean
 */
@Import({Dog.class})
@Configuration
@EnableConfigurationProperties(Mine.class)
public class ImportBeanConfig {
}

package cn.zyy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @Author: Zz
 * @Date: 2023/12/02/18:39
 * @Description: 致敬
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component
@ConfigurationProperties(prefix="zyy")
public class Mine {

    private String name;
    private Integer age;
    private String job;
}

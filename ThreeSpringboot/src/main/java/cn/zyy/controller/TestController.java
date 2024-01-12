package cn.zyy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zz
 * @Date: 2023/11/18/14:33
 * @Description: 致敬
 */
@RestController
public class TestController {

    @Value("${sy.name}")
    private String name;

    @Value("${sy.password}")
    private String password;

    @GetMapping("/test1")
    public String test1(){
        System.out.println(name);
        System.out.println(password);
        return "进来test1方法";

    }
}

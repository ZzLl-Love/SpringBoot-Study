package cn.zyy.springbootssm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zz
 * @Date: 2023/11/18/17:36
 * @Description: 致敬
 */
@RestController
public class Test1Controller {


    @GetMapping("/test1")
    public String test1(){
        System.out.println("热部署布置成功");
        System.out.println("测试是否成功");
        System.out.println("成功了我很开心");
        return "我是test1";
    }



}

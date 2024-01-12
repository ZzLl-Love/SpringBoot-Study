package cn.zyy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zz
 * @Date: 2023/11/17/16:20
 * @Description: 致敬
 */

@RestController
public class TestSecondController {

    @GetMapping("/test2")
    public String test2(){
        return "使用idea构建springboot项目的初始化....";

    }
}

package cn.zyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zz
 * @Date: 2023/11/17/16:04
 * @Description: 致敬
 */

@RestController
public class TestController {


    @GetMapping("/test")
    public String test1(){
        return "我进来了，ok";
    }
}

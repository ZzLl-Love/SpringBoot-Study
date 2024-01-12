package cn.zyy.controller;

import cn.zyy.domain.Mine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Zz
 * @Date: 2023/12/02/18:43
 * @Description: 致敬
 */
@Controller
public class MyController {

    @Autowired
    Mine mine;

    @RequestMapping("/test1")
    @ResponseBody
    public  String test1(){
        return "test1";
    }


    @RequestMapping("/my")
    @ResponseBody
    public Mine mine(){
        return mine;
    }
}

package cn.zyy.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @Author: Zz
 * @Date: 2023/12/05/20:42
 * @Description:  使用该controller 来复习巩固Rest风格
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {



    @GetMapping("/get")
    public String query(){
        return "GET风格--请求--查询";
    }


    @PostMapping("/post")
    public String save(){
        return "POST风格--请求--保存";
    }

    @PutMapping("/put")
    public String update(){
        System.out.println("1111");
        return "PUT风格--请求--修改";
    }


    @DeleteMapping("/del")
    public String delete(){
        return "DELETE风格--请求--删除";
    }

}

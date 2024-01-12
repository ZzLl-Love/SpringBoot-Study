package cn.zyy.parameter;

import cn.zyy.pojo.Mine;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: Zz
 * @Date: 2023/12/05/21:24
 * @Description: 测试使用不同的注解【@PathVariable】接受前端传递过来的参数
 */

@RestController
@Log4j
public class PathVariableController {


    /**
     * 获取类路径的参数值 --- PathVariable
     * @param name
     * @param age
     * @param map
     * @return
     */
    @GetMapping("/pathVar/{name}/{age}")
    public String testPathVariable(@PathVariable("name") String name,
                                   @PathVariable("age") String age,
                                   @PathVariable Map<String,String> map){
        System.out.println(map);
        return "姓名: " + name + "--年龄：" + age;
    }


    /**
     * 获取请求头信息  ---- RequestHeader
     * @param host
     * @param accept
     * @param allInfo
     * @return
     */
    @GetMapping("/requestHeader")
    public String  requestHeader(@RequestHeader("host") String host,
                                 @RequestHeader("accept") String accept,
                                 @RequestHeader Map<String,String> allInfo){

        System.out.println("host----" + host);
        System.out.println("accept---" + accept);
        System.out.println(allInfo);
      return "<h1 color=red>success</h1>";
    }


    /**
     * 测试使用@RequestParam注解
     * @param name
     * @param fruits
     * @param allInfo
     * @return
     */
    @GetMapping("/param")
    public String testRequestParam(@RequestParam("name") String name,
                                   @RequestParam("fruit") List<String> fruits,
                                   @RequestParam Map<String, String> allInfo){

        System.out.println("name   ----" + name);
        System.out.println("fruits ----" + fruits);
        System.out.println("allInfo ----" + allInfo);
        return "<h1 color=>success</h1>";
    }


    /**
     * 测试springboot中使用自定义对象来封装前端传递的参数值
     *
     * ！！！ 注意： Mine对象有一个属性 Girlfirend[class] llfriend 又是一个对象  ==> 测试springboot是否可以完成级联赋值
     * @param mine
     * @return
     */
    @PostMapping("/testObject")
    public String testCustomObject(Mine mine){
        System.out.println("mine  " +  mine);
        return "success";
    }


}

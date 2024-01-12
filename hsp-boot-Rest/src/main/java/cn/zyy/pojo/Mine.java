package cn.zyy.pojo;

import lombok.Data;

/**
 * @Author: Zz
 * @Date: 2023/12/05/23:03
 * @Description:  My 我的类 -- 介绍自己的类
 */
@Data
public class Mine {

    private String name;
    private String age;
    private String address;

    //女朋友类
    private Girlfriend llFired;
}

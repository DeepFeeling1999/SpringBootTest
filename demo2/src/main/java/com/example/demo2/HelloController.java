package com.example.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DeepFeeling1999
 * @create 2021/10/23
 */
@RestController
public class HelloController {

    /**
     * 通过配置文件注入预设的值
     */
    @Value("${mysql.name}")
    private String name;

    @Value("${mysql.password}")
    private String password;

    @RequestMapping("/hello")
    public String hello(){
        return name+password;
    }
}

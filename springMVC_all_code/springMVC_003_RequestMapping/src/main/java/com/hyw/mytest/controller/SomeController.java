package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: SomeController
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/28 16:55
 * @Version 1.0
 */
@Controller
public class SomeController {
    @RequestMapping(value = "/")
    public String a(){
        return "index";
    }

    @RequestMapping(value = {"/test/{id}/{name}/{age}"})//RESTful风格，主要用于Ajax请求中
    public String b(
            @PathVariable("id")
            String a,
            @PathVariable("name")
            String b,
            @PathVariable("age")
            String c){
        System.out.println(a+","+b+","+c);
        return "success";
    }
}

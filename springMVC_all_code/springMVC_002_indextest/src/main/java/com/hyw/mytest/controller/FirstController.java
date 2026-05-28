package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: FirstController
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/28 10:15
 * @Version 1.0
 */
@Controller
public class FirstController {

    @RequestMapping(value = "/haha")
    public String haha(){
        System.out.println("处理haha请求");
        return "hehe";
    }

    @RequestMapping(value = "/other")
    public String other(){
        System.out.println("处理other请求");
        return "other";
    }
}

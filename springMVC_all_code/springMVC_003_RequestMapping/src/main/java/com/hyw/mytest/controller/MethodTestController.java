package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName: MethodTestController
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/29 15:57
 * @Version 1.0
 */
@Controller
public class MethodTestController {
    @RequestMapping(value = "/postmethod")
    public String MethodTest(){
        return "method";
    }
}

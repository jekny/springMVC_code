package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
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
}

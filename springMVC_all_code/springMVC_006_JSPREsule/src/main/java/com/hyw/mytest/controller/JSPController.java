package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName: JSPController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/6 18:23
 * @Version 1.0
 */
@Controller
public class JSPController {
    @PostMapping("/jsptest")
    public String JSTTest(){
        return "jsptest";
    }
}

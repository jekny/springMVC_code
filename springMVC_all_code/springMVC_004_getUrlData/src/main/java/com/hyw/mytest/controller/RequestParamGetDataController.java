package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: RequestParamGetDataController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/2 11:09
 * @Version 1.0
 */
@Controller
public class RequestParamGetDataController {
    @PostMapping(value = {"/getparam"})
    public String a(
            @RequestParam(value = "id")
            String id,
            @RequestParam("name")
            String name
    ){
        System.out.println("by @RequestParam ");
        System.out.println(id);
        System.out.println(name);
        return "success";
    }
}

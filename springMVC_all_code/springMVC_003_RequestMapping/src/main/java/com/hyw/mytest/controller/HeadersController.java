package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: HeadersController
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/30 18:16
 * @Version 1.0
 */
@Controller
public class HeadersController {
    @GetMapping(value = {"/path/header"},headers = {"Connection","Host"})
    public String a(){
        System.out.println("映射成功!");
        return "success";
    }
}

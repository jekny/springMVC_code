package com.hyw.mytest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName: ForwardController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/7 11:08
 * @Version 1.0
 */
@Controller
public class ForwardController {
    @PostMapping({"/a"})
    public String a(HttpServletRequest request){
        System.out.println("a方法执行");
        request.setAttribute("name","张三");
        return "redirect:/b";
    }

    @GetMapping("/b")
    public String b(){
        System.out.println("b方法执行");
        return "test";
    }
}

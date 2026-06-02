package com.hyw.mytest.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName: YuanShengServletGetDataController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/2 9:18
 * @Version 1.0
 */
@Controller
public class YuanShengServletGetDataController {//通过原生servlet获取前端数据
    @PostMapping(value = {"/register"})
    public String a(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        System.out.println(id);
        System.out.println(name);
        return "success";
    }
}

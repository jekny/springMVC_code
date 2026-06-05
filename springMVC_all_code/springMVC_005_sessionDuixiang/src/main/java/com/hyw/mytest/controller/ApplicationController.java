package com.hyw.mytest.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName: ApplicationController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/5 17:17
 * @Version 1.0
 */
@Controller
public class ApplicationController {
    @PostMapping("/application/test")
    public String test(HttpServletRequest request){
        ServletContext servletContext = request.getServletContext();
        String realPath = servletContext.getRealPath("success.html");
        servletContext.setAttribute("key",realPath);
        return "success";
    }
}

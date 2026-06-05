package com.hyw.mytest.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * ClassName: SessionController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/5 16:38
 * @Version 1.0
 */
@Controller
@SessionAttributes(value = {"key1","key2"})
public class SessionController {
    @PostMapping("/session/test1")
    public String test1(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("name1","data1我是数据");
        return "success";
    }

    @PostMapping("/session/test2")
    public String test2(ModelMap map){
        map.addAttribute("key1","zhangshan");
        map.addAttribute("key2","lisi");
        return "success";
    }
}

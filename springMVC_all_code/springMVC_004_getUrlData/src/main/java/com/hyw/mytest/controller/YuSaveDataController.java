package com.hyw.mytest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: YuSaveData
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/4 11:29
 * @Version 1.0
 */
@Controller
public class YuSaveDataController {
    @PostMapping("/test1")
    public String test1(HttpServletRequest request){
        Map map = new HashMap();
        map.put("a",12);
        map.put("b","zhangshan");
        request.setAttribute("test1",map);
        request.setAttribute("test2","从域中取出来的数据");
        return "yu";
    }

    @PostMapping("/test2")
    public String test2(Model model){
        model.addAttribute("test22","我是数据");
        return "yu";
    }
}

package com.hyw.mytest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public String test2(Model model){//这里的model和servlet，map，modelmap都得要spingMVC框架帮助我们进行注入，这里一共有5个方式，一个是servlet，map，model，modelmap，modelandview
        //但是modelandview不用框架帮我们注入，是我们自己手动new出来的，返回值是modelandview而不是String，
        model.addAttribute("test22","我是数据");
        return "yu";
    }

    @PostMapping("/test3")
    public ModelAndView test3(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test3","数据");
        modelAndView.setViewName("yu");
        return modelAndView;
    }

}

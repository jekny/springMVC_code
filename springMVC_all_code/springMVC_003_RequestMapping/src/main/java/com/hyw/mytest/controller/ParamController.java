package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: PramController
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/30 18:04
 * @Version 1.0
 */
@Controller
public class ParamController {
    @GetMapping(value = {"/path/pram"},params = {"id","name"})
    public String a(){
        System.out.println("映射成功了");
        return "success";
    }
}

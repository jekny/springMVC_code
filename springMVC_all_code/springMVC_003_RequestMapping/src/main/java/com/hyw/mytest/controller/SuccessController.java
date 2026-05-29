package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName: SuccessController
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/29 16:01
 * @Version 1.0
 */
@Controller
public class SuccessController {
    //@RequestMapping(value = {"/success"},method = {RequestMethod.POST})
    @PostMapping(value = {"/success"})
    public String Success(){
        return "success";
    }
}

package com.hyw.mytest.controller;

import com.hyw.mytest.javaDTO.UserJavaBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName: JavaBeanGetDataController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/2 18:45
 * @Version 1.0
 */
@Controller
public class JavaBeanGetDataController {
    @PostMapping("/javabean")
    public String a(UserJavaBean userJavaBean){
        System.out.println(userJavaBean.toString());
        return "success";
    }
}

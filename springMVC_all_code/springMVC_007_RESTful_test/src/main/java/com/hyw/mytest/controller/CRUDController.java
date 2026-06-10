package com.hyw.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: CRUDController
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/10 11:03
 * @Version 1.0
 */
@Controller
public class CRUDController {
    @GetMapping(value = {"/user/{id}"})
    public String getById(
            @PathVariable("id")
            String id){
        System.out.println(id);
        return "success";
    }

    @PostMapping("/user/{id}")
    public String postUser(@PathVariable("id") String id){
        System.out.println("新增Post");
        return "success";
    }

    @PutMapping("/user/{id}")
    public String putUser(@PathVariable("id") String id){
        System.out.println("修改Put");
        return "success";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") String id){
        System.out.println("删除delete");
        return "success";
    }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@RestController类中的所有方法只能返回String、Object、Json等实体对象，不能跳转到模版页面。
@RestController
public class HelloController {
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    String hello(@PathVariable String name){
        return name + ", hello";
    }
}

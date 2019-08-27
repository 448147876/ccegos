package com.cceg.crm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellocrm")
public class HelloCrmController {

    @GetMapping("/hello")
    public String hello(String name){
        System.out.println("crm 系统："+name);
        return "crm 系统:"+name;
    }



}

package com.cceg.msg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hellomsg")
public class HelloMsgController {


    @GetMapping("/hello")
    public String hello(String name){
        System.out.println("msg 系统："+name);
        return "msg 系统:"+name;
    }

}

package com.cceg.msg.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hellomsg")
public class HelloMsgController {


    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        System.out.println("msg 系统："+name);
        return "msg 系统:"+name;
    }

}

package com.cceg.crm.controller;


import com.cceg.msg.api.HelloMsgApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reign")
public class FeignDemoController {


    @Autowired
    HelloMsgApi helloMsgApi;

    @GetMapping("/hello")
    public String helloMsgFeignDemo(String name){
        return helloMsgApi.addCart(name);
    }


}

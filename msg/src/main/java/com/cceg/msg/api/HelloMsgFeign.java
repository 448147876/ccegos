package com.cceg.msg.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("helloMsgFeign")
public interface HelloMsgFeign {

    @GetMapping(value="/hello")
    String sayHello(String name);

}

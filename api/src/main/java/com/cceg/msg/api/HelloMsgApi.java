package com.cceg.msg.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name  = "msg")
public interface HelloMsgApi {


    @RequestMapping(value = "/hellomsg/hello",method = RequestMethod.GET)
    String addCart(@RequestParam String name);

}

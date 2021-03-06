package com.offcn.springsessiondemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
    @RequestMapping("/myControllerTest")
    public String test(){
        return "myControllerTest";
    }
}

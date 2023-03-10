package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@Slf4j
public class TestCtrl {

    @ResponseBody
    @RequestMapping("hello")
    public String Rtvodchndata() {
        return "Hello World!";
    }
    @ResponseBody
    @RequestMapping("xiaoyi")
    public String Rtvodchndata() {
        return "Hello XiaoYi!";
    }
}

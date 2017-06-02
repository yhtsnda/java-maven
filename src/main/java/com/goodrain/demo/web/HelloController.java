package com.goodrain.demo.web;

import com.goodrain.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String home() {
        helloService.say();
        return "Hello World! 你好，世界!!!";
    }
}
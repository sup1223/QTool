package com.example.qtool.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/test")
    public String testController() {
        System.out.println("hello, world");
        System.out.println("so boring");
        return "hello, world";
    }

}

package com.itszt.DDDrItszt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        System.out.println("HelloWorldController.index456789");
        return "usercenter";
    }
}
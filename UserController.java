package com.itszt.DDDrItszt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2018/4/19.
 */
@Controller
@RequestMapping("/usercenter")
public class UserController {
    @RequestMapping("/login")
    public String login(String username, String userpwd, HttpSession session){
        System.out.println("UserController.login");
        return "usercenter";
    }
}

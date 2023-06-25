package com.example.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AdminController {

    @RequestMapping("/home")
    public String indexPage() {

        return "index";
    }
    @RequestMapping("/login")
    public String loginPage() {

        return "authentication-login";
    }
    @RequestMapping("/register")
    public String registerPage() {

        return "authentication-register";
    }
}

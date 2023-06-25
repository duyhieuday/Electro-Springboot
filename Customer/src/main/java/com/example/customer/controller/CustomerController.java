package com.example.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class CustomerController {

    @RequestMapping("/home")
    public String indexPage() {

        return "index";
    }
    @RequestMapping("/checkout")
    public String checkoutPage() {

        return "checkout";
    }
    @RequestMapping("/product")
    public String productPage() {

        return "product";
    }
    @RequestMapping("/store")
    public String storePage() {

        return "store";
    }

}

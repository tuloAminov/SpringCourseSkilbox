package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostponedController {

    @GetMapping("/postponed")
    public String postponedPage(){
        return "/postponed";
    }
    
    @GetMapping("/about")
    public String about(){
        return "/about";
    }
    
    @GetMapping("/contacts")
    public String contacts(){
        return "/contacts";
    }
}

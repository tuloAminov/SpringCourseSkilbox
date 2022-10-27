package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop/genres")
public class GenresController {

    @GetMapping()
    public String genres() {
        return "genres/genres";
    }

}
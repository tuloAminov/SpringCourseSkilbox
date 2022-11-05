package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainPageController {

    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("recommendedBooks")
    public List<Book> recommendedBooks(){
        return bookService.getBooksData();
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/recent")
    public String recentPage(){
        return "/books/recent";
    }

    @GetMapping("/popular")
    public String popularPage(){
        return "/books/popular";
    }

    @GetMapping("/postponed")
    public String postponedPage(){
        return "/postponed";
    }

    @GetMapping("/cart")
    public String cartPage(){
        return "/cart";
    }

    @GetMapping("/signing")
    public String signingPage(){
        return "/signing";
    }

    @GetMapping("/search")
    public String searchPage(){
        return "/search/index";
    }

    @GetMapping("/documents")
    public String documentsPage(){
        return "/documents/index";
    }

    @GetMapping("/about")
    public String about(){
        return "/about";
    }

    @GetMapping("/faq")
    public String faq(){
        return "/faq";
    }

    @GetMapping("/contacts")
    public String contacts(){
        return "/contacts";
    }
}

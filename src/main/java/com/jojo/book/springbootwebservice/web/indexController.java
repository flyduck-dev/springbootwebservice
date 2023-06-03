package com.jojo.book.springbootwebservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}

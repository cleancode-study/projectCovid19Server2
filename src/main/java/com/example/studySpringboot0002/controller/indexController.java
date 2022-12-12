package com.example.studySpringboot0002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("header/header")
    public String header() {
        return "header/header";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}

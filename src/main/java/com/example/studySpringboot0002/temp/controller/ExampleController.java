//package com.example.studySpringboot0002.temp.controller;
//
//import com.example.from.dto.formValueReturn;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class ExampleController {
//
//    @GetMapping("/")
//    public String main() {
//        return "main";
//    }
//
//    @PostMapping("/getForm")
//    public String getForm(Model model, formValueReturn form) {
//        System.out.println(form.toString());
//        model.addAttribute("form", form);
//        return "test";
//    }
//
//
//
//}

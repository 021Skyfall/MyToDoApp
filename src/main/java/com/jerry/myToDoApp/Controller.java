package com.jerry.myToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String mainPage() {
        System.out.println("다시 변경");
        return "To-Do Application";
    }
}
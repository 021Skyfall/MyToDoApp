package com.jerry.myToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String mainPage() {
        System.out.println("To-do Application !");
        return "To-Do Application";
    }
}
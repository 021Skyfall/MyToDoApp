package com.jerry.myToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String mainPage() {
        return "To-Do Application";
    }
}
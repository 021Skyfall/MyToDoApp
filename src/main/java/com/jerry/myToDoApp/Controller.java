package com.jerry.myToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String mainPage() {
        System.out.println("깃 브랜치 설정 feat -> dev");
        return "To-Do Application";
    }
}
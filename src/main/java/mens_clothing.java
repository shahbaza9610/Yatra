package com.example.onlineshoopingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class mens_clothing {
    @GetMapping("/mens_clothing")
    public String getData(){
        return  "Please purchase cloths online";
    }
}
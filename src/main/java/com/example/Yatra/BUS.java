package com.example.Yatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BUS {
    @GetMapping("/MyBUS")
    public String getData(){
        return  "Please BOOK THE TICKET for BUS";
    }
}
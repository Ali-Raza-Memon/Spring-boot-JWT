package com.learning.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/welcome")
    public String welcome(){
        String text = "this is private page ";
                text+="this page is not allowed to unauthenticated users ";
        return text;
    }

    @GetMapping("/getUser")
    public String getUser(){

        return "{\"name\":\"Ali Raza\"}";
    }


}

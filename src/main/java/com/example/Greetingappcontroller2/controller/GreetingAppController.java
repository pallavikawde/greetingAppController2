package com.example.Greetingappcontroller2.controller;

import com.example.Greetingappcontroller2.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome")
public class GreetingAppController {

//    @Autowired
//    private GreetingAppService greetingAppService;

    @GetMapping(value = "/welcomeToThe-GreetingApp")
    public String welcome(){
        return "welcome to greeting app";
    }
}

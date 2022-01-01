package com.primus.springdi.controllers;

import com.primus.springdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}

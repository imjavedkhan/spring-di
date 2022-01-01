package com.primus.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hi Everyone...");

        return "Hi Primus";
    }
}

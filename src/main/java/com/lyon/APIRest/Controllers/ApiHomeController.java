package com.lyon.APIRest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiHomeController {

    @GetMapping(value = "/")
    public String getHomePage(){
        return "hello world";
    }
}

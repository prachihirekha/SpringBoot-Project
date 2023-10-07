package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping(path="/hello")
    public String getController(){
        return "<h1>hello world</h1>";
    }


}

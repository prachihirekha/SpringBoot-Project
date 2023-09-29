package com.student.student.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class TestController {
    @RequestMapping("/test")
    public String run(){
        return "just for fun !";
    }

}

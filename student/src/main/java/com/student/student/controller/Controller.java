package com.student.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
        @GetMapping(path = "/request")
        public String getBook(){
            return "sout";
        }
    }


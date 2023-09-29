package com.student.student.controller;

import com.student.student.model.User;
import com.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/school")
public class StudentController {
    @Autowired
    StudentService s;
  @PostMapping("/student")
    public User insert(@RequestBody User users){

      return s.insertStudent(users);
    }

}

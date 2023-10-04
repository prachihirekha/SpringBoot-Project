package com.student.student.controller;

import com.student.student.model.User;
import com.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @PostMapping("/multiple-student")
    public String insertMultiple(@RequestBody List<User> user){
     s.insertMultipleStudent(user);
     return "ooohhooo!!!!";
    }
    @GetMapping("/get-all")
    public List<User> getAll(){
      return s.getAll();
    }
    @GetMapping("/get-element/{id}")
    public Optional<User>getByID(@PathVariable ("id") int id){
      return s.getByID(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteByID(@PathVariable("id") int deleteId){
      s.deleteById(deleteId);
      return "delete data";
    }


}

package com.springjdbc.JDBCTemplate.controller;

import com.springjdbc.JDBCTemplate.dao.UserRepository;
import com.springjdbc.JDBCTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userRepository.insertUser(user);
    }
    @DeleteMapping("/user/{id}")
    public String  deleteUser(@PathVariable int id){
        return userRepository.deleteById(id);
    }
    @PutMapping("/user/update")
    public User updateUser(@RequestBody User user){
        return  userRepository.updateUser(user);
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userRepository.getAllUser();
    }
    @GetMapping("/user/{id}")
    public User getById(@PathVariable int id){
        return  userRepository.getBYId(id);
    }

}

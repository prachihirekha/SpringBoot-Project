package com.student.student.service;

import com.student.student.model.User;
import com.student.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class StudentService {
    @Autowired
    StudentRepository sr ;

    public User insertStudent(User u){
        return sr.save(u);

    }

}

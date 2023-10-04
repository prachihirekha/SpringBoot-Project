package com.student.student.service;

import com.student.student.model.User;
import com.student.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository sr ;

    public User insertStudent(User u){
        return sr.save(u);

    }

    public void insertMultipleStudent(List<User> user) {
        for (User u : user) {
            //System.out.println(u);
         sr.save(u);

        }
    }

    public List<User> getAll() {
        return sr.findAll();
    }
    public Optional<User> getByID(int id){
        return sr.findById(id);

    }


    public void deleteById(int id) {
      sr.deleteById(id);
    }
}

package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public String insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
//        return "insert successfully";

    }
    @GetMapping("/student/{id}")
    public Object getStudent(@PathVariable int id) {
        try {
            return studentService.getStudent(id);
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
    @GetMapping("/student")
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable("id") int id,@RequestBody Student student){
        return  studentService.updateStudent(id,student);
    }
    @DeleteMapping("/delete_student/{id}")
    public String deleteStudent(@PathVariable ("id") int id ){
        studentService.deleteStudent(id);
        return  "delete successfully";
    }
    @GetMapping("/student/branch/{branch}")
    public List<Student> getBranch(@PathVariable String branch ){
        return  studentService.getBranch(branch);

    }




}
// {
//         "rollNumber": 1,
//         "name": "raju",
//         "age": 22,
//         "gender": "male",
//         "branch": "CS",
//         "year": 2,
//         "semester": 3
//         },
//         {
//         "rollNumber": 2,
//         "name": "raju",
//         "age": 22,
//         "gender": "male",
//         "branch": "CSE",
//         "year": 2,
//         "semester": 3
//         },
//         {
//         "rollNumber": 3,
//         "name": "raju",
//         "age": 22,
//         "gender": "male",
//         "branch": "CS",
//         "year": 2,
//         "semester": 3
//         },
//         {
//         "rollNumber": 4,
//         "name": "raju",
//         "age": 22,
//         "gender": "male",
//         "branch": "CSE",
//         "year": 2,
//         "semester": 3
//         }
//         ]

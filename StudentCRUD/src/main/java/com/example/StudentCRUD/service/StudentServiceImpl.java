package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.repository.StudentReo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
   private StudentReo studentReo;

    @Override
    public String insertStudent(Student student) {
        return studentReo.insertStudent(student);
    }

    @Override
    public Object getStudent(int id) {
        return studentReo.getStudent(id);
    }

    @Override
    public List<Student> getStudentList() {
        return studentReo.getStudentList();
    }

    @Override
    public Student updateStudent(int id, Student student) {
        return studentReo.updateStudent(id,student);
    }

    @Override
    public String deleteStudent(int id) {
      return   studentReo.deleteStudent(id);
    }

    @Override
    public List<Student> getBranch(String branch) {
        return  studentReo.getBranch(branch);
    }


}

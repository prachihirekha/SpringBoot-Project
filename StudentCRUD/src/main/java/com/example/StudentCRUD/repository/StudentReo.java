package com.example.StudentCRUD.repository;

import com.example.StudentCRUD.model.Student;

import java.util.List;

public interface StudentReo {
   String insertStudent(Student student);

    Object getStudent(int id);

    List<Student> getStudentList();

      Student updateStudent(int id, Student student) ;

    String deleteStudent(int id);

    List<Student> getBranch(String branch);
}


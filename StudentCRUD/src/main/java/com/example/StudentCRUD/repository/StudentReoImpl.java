package com.example.StudentCRUD.repository;

import com.example.StudentCRUD.StudentCrudApplication;
import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentReoImpl implements  StudentReo{
    // to store in inmemory
    // in hasMap we use key value in key rollNo jo change nhi hota hai and  in value  we store object
    private Map<Integer,Student> studentMap =new HashMap<>();
    @Override
    public String insertStudent(Student student) {
        if(existStudent(student)){
            return "Already exist";
        }
        studentMap.put(student.getRollNumber(), student);
            return "insert successfully";
        }
        public  boolean existStudent(Student student) {

            return existStudent(student.getRollNumber());
        }
        public boolean existStudent(int id){
            if (studentMap.containsKey(id)) {
                return  true;
            }
            return false;
        }
    @Override
    // we also use object because object is parent class
    // we have  id is not exit mgs show in this  why we have object and we want string there for we use Object and object is a parent class
    public Object getStudent(int id)  throws RuntimeException{
        if(existStudent(id)){
            return studentMap.get(id);
        }
        throw new RuntimeException("id not exist!");
    }

    @Override
    public List<Student> getStudentList() {
        ArrayList<Student>students=new ArrayList<Student>();
        for(Integer n :studentMap.keySet()){
            students.add(studentMap.get(n));
        }
        return students;
    }
    @Override
    public Student updateStudent(int id,Student student){
        if(studentMap.containsKey(id)){
            // put for update
            studentMap.put(id, student);
            return student;
        }
        return null;
    }

    @Override
    public String deleteStudent(int id) {
        // remove for delete
        studentMap.remove(id);
        return "Student delete successfully";
    }

    @Override
    public List<Student> getBranch(String branch) {
        List<Student>students =new ArrayList<>();
        for (Integer s:studentMap.keySet()){
            Student student =studentMap.get(s);
            if(student.getBranch().equals(branch))
            students.add(student);

        }
        return students;
    }
}




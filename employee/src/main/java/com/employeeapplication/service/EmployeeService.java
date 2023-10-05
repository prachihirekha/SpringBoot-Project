package com.employeeapplication.service;

import com.employeeapplication.model.Employee;
import com.employeeapplication.repository.EmployeeReo;
import com.employeeapplication.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeReo employeeReo;

    public  List<Employee> insertRandom(int size) {

            List<Employee> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Employee employee = Employee.builder()
                        .fullName(GenerateEmployeeName.employeeName())
                        .address(GenerateAddress.generateAddress())
                        .gender(GenerateGender.gender())
                        .mobile(GenerateMobileNO.mobileNo())
                        .joiningDate(RandomDate.date()).build();

               // System.out.println(employee);

                list.add(employee);
                //employeeReo.saveAll(list);

            }
            return employeeReo.saveAll(list);


    }


    public List<Employee> getAllEmployee() {
        return employeeReo.findAll();
    }
    public Optional<Employee> getBYEmployeeID(int id){
        return employeeReo.findById(id);
    }
    public  void deleteByID(int id){
        employeeReo.deleteById(id);
    }
    public Optional<Employee> updateBYID(int id,Employee employee){
          Optional<Employee> employee1=employeeReo.findById(id);
          if(employee1!=null){
              employee.setEmployeeId(id);
              employeeReo.save(employee);
          }
          return employee1;
    }
}

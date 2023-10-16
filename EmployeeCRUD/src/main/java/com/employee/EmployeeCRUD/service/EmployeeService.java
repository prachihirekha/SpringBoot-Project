package com.employee.EmployeeCRUD.service;

import com.employee.EmployeeCRUD.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee insertEmployee(Employee employee);

    String insertEmployeeMessage(Employee employee);


    List<Employee> getAllEmployee();

    Object getById(int id);

    Object deleteById(int id);

    Object updateById(int id, Employee employee);
}

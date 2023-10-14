package com.employee.EmployeeCRUD.reopsitory;

import com.employee.EmployeeCRUD.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {
    Employee insertEmployee(Employee employee);

    String insertEmployeeMessage(Employee employee);

    List<Employee> getAllEmployee();

    Object getById(int id);

    Object deleteById(int id);

    Object updateById(int id, Employee employee);
}

package com.employee.EmployeeCRUD.service;

import com.employee.EmployeeCRUD.entity.Employee;
import com.employee.EmployeeCRUD.reopsitory.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee insertEmployee(Employee employee) {
        return  employeeRepo.insertEmployee(employee);

    }

    @Override
    public String insertEmployeeMessage(Employee employee) {
        return employeeRepo.insertEmployeeMessage(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.getAllEmployee();
    }

    @Override
    public Object getById(int id) {
        return employeeRepo.getById(id);
    }

    @Override
    public Object deleteById(int id) {
        return employeeRepo.deleteById(id);
    }

    @Override
    public Object updateById(int id, Employee employee) {
        return employeeRepo.updateById(id,employee);
    }
}

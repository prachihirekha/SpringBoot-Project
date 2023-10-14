package com.employee.EmployeeCRUD.controller;

import com.employee.EmployeeCRUD.entity.Employee;
import com.employee.EmployeeCRUD.reopsitory.EmployeeRepo;
import com.employee.EmployeeCRUD.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/insert")
    public Employee insertEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }

    @PostMapping("/employee")
    public String insertEmployeeMessage(@RequestBody Employee employee) {
        return employeeService.insertEmployeeMessage(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();

    }
// when we have any mgs  pass Object Parent clas
    @GetMapping("/get-by-id/{id}")
    public Object getById(@PathVariable("id") int id) {
        try {
            return employeeService.getById(id);
        } catch (Exception exception) {
             return exception.getMessage();
        }
    }
    @DeleteMapping("/delete-by-id/{id}")
    public Object deleteById(@PathVariable("id") int id){
        try{
            return employeeService.deleteById(id);

        }catch (Exception exception){
            return exception.getMessage();
        }
    }
    @PutMapping("/update/{id}")
    public  Object updateById(@PathVariable int id, @RequestBody Employee employee){
        try{
            return employeeService.updateById(id,employee);
        }catch (Exception e){
            return e.getMessage();
        }
    }

}

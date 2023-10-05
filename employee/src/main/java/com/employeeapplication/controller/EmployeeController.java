package com.employeeapplication.controller;

import com.employeeapplication.model.Employee;
import com.employeeapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
    private  EmployeeService employeeService;
    @PostMapping( "/{value}")
    public List<Employee> insertRandom(@PathVariable("value") int value){
        System.out.println("insert successfully");
        return employeeService.insertRandom(value);
    }
    @GetMapping("/get_all_data")
    public List<Employee> getAllList(){
        return  employeeService.getAllEmployee();
    }
    @GetMapping("/get_by_id/{id}")
    public Optional<Employee> getByID(@PathVariable("id") int id){
        return employeeService.getBYEmployeeID(id);
    }
    @DeleteMapping("/delete_by_Id/{id}")
    public String delete(@PathVariable("id") int id){
        employeeService.deleteByID(id);
        return "delete successfully";

    }
    @PutMapping("/update/{id}")
    public Optional<Employee> updateBYID(@PathVariable ("id") int id,@RequestBody Employee employee){
        return  employeeService.updateBYID(id,employee);
    }
}

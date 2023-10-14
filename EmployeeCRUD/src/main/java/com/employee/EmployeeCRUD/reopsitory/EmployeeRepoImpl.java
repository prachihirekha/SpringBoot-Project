package com.employee.EmployeeCRUD.reopsitory;

import com.employee.EmployeeCRUD.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
    Map<Integer,Employee>employeeMap=new HashMap<>();
    @Override
    public Employee insertEmployee(Employee employee) {
      employeeMap.put(employee.getId(),employee);
      return employee;
    }

    @Override
    public String insertEmployeeMessage(Employee employee) {
        if(existEmployee(employee)){
            return "already exist";
        }
        employeeMap.put(employee.getId(),employee);
        return "insert successFully";
    }

    @Override
    public List<Employee> getAllEmployee() {
       List<Employee> list =new ArrayList<>();
       for (Integer n:employeeMap.keySet()){
           list.add(employeeMap.get(n));
       }
       return  list;
    }

    @Override
    public Object getById(int id) throws RuntimeException{
      if(existEmployee(id)) {
          return employeeMap.get(id);
      }
      throw new RuntimeException("id does not exist");
    }

    @Override
    public Object deleteById(int id) throws RuntimeException{
        if(existEmployee(id)){
            return  "delete id";

        }
        throw new RuntimeException("id is not present");
    }

    @Override
    public Object updateById(int id, Employee employee) {
        if (employeeMap.containsKey(id)) {
            // put for update
            employeeMap.put(id, employee);
            return "update successfully";
        }
        return employee;
    }

    public boolean existEmployee(Employee employee){
        return  existEmployee(employee.getId());
    }
    // method overloading
    public boolean existEmployee(int id){
        if(employeeMap.containsKey(id)){
            return  true;
        }
        return false;
    }

}

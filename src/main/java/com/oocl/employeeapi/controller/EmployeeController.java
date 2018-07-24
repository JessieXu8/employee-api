package com.oocl.employeeapi.controller;

import com.oocl.employeeapi.entity.Employee;
import com.oocl.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee addEmployees(@RequestBody Employee newEmployee){
        return employeeService.addEmployee(newEmployee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployee();
    }

    @DeleteMapping("/employees/{id}")
    public Employee delEmployees(@PathVariable int  id){
        return employeeService.delEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployees(@PathVariable int id,@RequestBody Employee newEmployee){
        return employeeService.updateEmployee(id,newEmployee);
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployees(@PathVariable int id){
        return employeeService.findEmployee(id);
    }

}

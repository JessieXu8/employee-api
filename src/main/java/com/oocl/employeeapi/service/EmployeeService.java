package com.oocl.employeeapi.service;

import com.oocl.employeeapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    List<Employee> employees;

    public List<Employee> addEmployee(Employee employee){
        employees.add(employee);
        return employees;
    }
}

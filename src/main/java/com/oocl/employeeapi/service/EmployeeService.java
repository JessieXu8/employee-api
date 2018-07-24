package com.oocl.employeeapi.service;

import com.oocl.employeeapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

//    List<Employee> employees = new ArrayList<>();
    private Map<Integer,Employee> employees = new HashMap<>();

    public Employee addEmployee(Employee employee) {
        employees.put(employee.getId(),employee);
        return employee;
    }


    public List<Employee> getEmployee() {
        List<Employee> employeesList = new ArrayList<>();
        for (Integer id : employees.keySet()){
            employeesList.add(employees.get(id));
        }
        return employeesList;
    }

    public Employee delEmployee(int id) {
        if(employees.containsKey(id)){
           return employees.remove(id);
        }
        return null;
    }

    public Employee updateEmployee(int id, Employee newEmployee) {
        if(employees.containsKey(id)){
            return employees.replace(id,newEmployee);
        }
        return null;
    }

    public Employee findEmployee(int id) {
        if(employees.containsKey(id)){
            return employees.get(id);
        }
        return null;
    }
}

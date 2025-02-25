package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {
//     UC1 codefiles  :- It provide a simple Get API to return all employees
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}

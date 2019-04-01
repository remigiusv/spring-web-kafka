package com.accelerate.kafka.demo.controller;

import com.accelerate.kafka.demo.model.Employee;
import com.accelerate.kafka.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;



    @GetMapping("list")
    public List<Employee> listEmployee() {

        return employeeService.getAll();
    }

    @PostMapping("create")
    public Employee createEmployee(@RequestBody Employee data){
        return employeeService.addEmp(data);
    }

}

package com.accelerate.kafka.demo.service;

import com.accelerate.kafka.demo.model.Employee;
import com.accelerate.kafka.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public Employee addEmp(Employee data) {
        return employeeRepo.save(data);
    }
}

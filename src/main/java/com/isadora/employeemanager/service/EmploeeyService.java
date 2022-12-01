package com.isadora.employeemanager.service;

import com.isadora.employeemanager.model.Employee;
import com.isadora.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmploeeyService {
    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmploeeyService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
}

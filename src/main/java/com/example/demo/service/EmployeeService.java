package com.example.demo.service;

import com.example.demo.entity.Employee;

public interface EmployeeService {
    Employee getEmployee(int empId);

    void createEmployee(Employee employee);
}

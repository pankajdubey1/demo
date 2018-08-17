package com.example.demo.service.impl;

import com.example.demo.dao.EmpDao;
import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PrototypeDemo;
import com.example.demo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    PrototypeDemo prototypeDemo;

    @Autowired
    private EmpDao empDao;

    @Override
    public Employee getEmployee(int empId) {
        Employee employee = new Employee();
        employee.setId(empId);
        employee.setName("demo");
        employee.setRole("demo");
        prototypeDemo.demo();
        return employee;
    }

    @Override
    public void createEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        newEmployee.setId(employee.getId());
        newEmployee.setName(employee.getName());
        newEmployee.setRole(employee.getRole());
        Address address = new Address();
        address.setAddressId(employee.getAddress().getAddressId());
        address.setCity(employee.getAddress().getCity());
        newEmployee.setAddress(address);
        empDao.saveEmp(newEmployee);
    }

    public static String callingStaticMethod() {
        return Util.staticMethod();
    }

    private String privateMethod() {
        return "private";
    }
}

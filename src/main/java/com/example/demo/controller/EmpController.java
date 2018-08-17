package com.example.demo.controller;

import com.example.demo.constant.Constants;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = Constants.EMP)
public class EmpController {

    @Autowired
    private EmployeeService empService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable int id) {
        return empService.getEmployee(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseDTO createEmployee(@RequestBody Employee employee) {
        empService.createEmployee(employee);
        return Util.getResponseDTO();
    }
}

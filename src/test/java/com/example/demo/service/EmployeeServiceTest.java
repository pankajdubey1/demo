package com.example.demo.service;

import com.example.demo.service.impl.EmployeeServiceImpl;
import com.example.demo.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Test
    public void testGetEmployeeById() {
        Employee expected = getEmployee();
        Employee returned = employeeService.getEmployee(2);
        assertEquals(expected.getId(), returned.getId());
    }

    @Test
    public void testPrivateMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String expected = "private";
        Method method = EmployeeServiceImpl.class.getDeclaredMethod("privateMethod");
        method.setAccessible(true);
        assertEquals(expected, method.invoke(employeeService));
    }

    private Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("demo");
        employee.setRole("demo");
        return employee;
    }


}

package com.example.demo.controller;

import com.example.demo.GoodCategory;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@Category(GoodCategory.class)
public class EmpControllerTest {

    @InjectMocks
    EmpController empController;

    @Mock
    EmployeeService employeeService;

    private Employee expected;

    @Before
    public void createDataForTest() {
        expected = getEmployee();
        when(employeeService.getEmployee(2)).thenReturn(expected);
    }

    @After
    public void cleanDataForTest() {
        expected = null;
    }

    @Test(timeout = 100)
    public void testGetEmployeeById() {
        Employee returned = empController.getEmployee(2);
        assertEquals(expected.getName(), returned.getName());
    }

    private Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(3);
        employee.setName("demo from mock");
        employee.setRole("demo");
        return employee;
    }
}

package com.example.demo;

import com.example.demo.controller.EmpControllerTest;
import com.example.demo.service.EmployeeServiceTest;
import com.example.demo.service.TrackingServiceTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(GoodCategory.class)
@Suite.SuiteClasses({EmpControllerTest.class,
        EmployeeServiceTest.class,
        TrackingServiceTest.class})
public class GoodCategorySuite {
}

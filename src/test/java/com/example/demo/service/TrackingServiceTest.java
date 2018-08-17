package com.example.demo.service;

import com.example.demo.GoodCategory;
import com.example.demo.service.impl.TrackingServiceImpl;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TrackingServiceTest {

    @InjectMocks
    TrackingServiceImpl trackingService;

    @Test
    @Category(GoodCategory.class)
    public void testInitialGetTotal() {
        assertEquals(0, trackingService.getTotal());
    }

    @Test(expected = Exception.class)
    public void addProteinTest() throws Exception {
        trackingService.addProtein(10);
        assertEquals(10, trackingService.getTotal());
    }

    @Test
    public void privateMethodTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = TrackingServiceImpl.class.getDeclaredMethod("privateMethod");
        method.setAccessible(true);
        assertEquals("private", method.invoke(trackingService));
    }
}

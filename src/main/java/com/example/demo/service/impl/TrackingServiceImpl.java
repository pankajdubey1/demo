package com.example.demo.service.impl;

import com.example.demo.service.TrackingService;
import org.springframework.stereotype.Service;

@Service
public class TrackingServiceImpl implements TrackingService{

    private int total;

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void addProtein(int amount) throws Exception {
        total = total + amount;
        System.out.println(privateMethod());
        throw new Exception();
    }

    private String privateMethod() {
        return "private";
    }

    public static String staticMethod() {
        return "static";
    }
}

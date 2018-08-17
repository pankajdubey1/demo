package com.example.demo.creational.factory;

public class Factory {

    public OS getInstance(String osName) {
        if (osName.equalsIgnoreCase("android")) {
            return new Android();
        } else {
            return new IOS();
        }
    }
}

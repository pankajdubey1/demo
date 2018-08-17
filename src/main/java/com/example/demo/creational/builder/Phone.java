package com.example.demo.creational.builder;

public class Phone {

    String ram;
    String battery;

    public Phone(String ram, String battery) {
        this.ram = ram;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram='" + ram + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}

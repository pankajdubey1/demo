package com.example.demo.creational.builder;

public class Builder {

    String ram;
    String battery;

    public Builder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public Builder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(ram, battery);
    }
}

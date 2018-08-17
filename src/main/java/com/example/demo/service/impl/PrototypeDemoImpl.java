package com.example.demo.service.impl;

import com.example.demo.service.PrototypeDemo;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeDemoImpl extends PrototypeDemo {

    private PrototypeDemoImpl() {

    }

    @Override
    public void demo() {
        System.out.println(this.hashCode());
    }
}

package com.example.demo.dao.impl;

import com.example.demo.dao.EmpDao;
import com.example.demo.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveEmp(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}

package com.example.demo.dao.impl;

import com.example.demo.dao.StockDao;
import com.example.demo.entity.Stock;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class StockDaoImpl implements StockDao{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void saveStock(Stock stock) {
        sessionFactory.getCurrentSession().save(stock);
    }

    @Override
    public Stock getStock(int stockId) {
        return sessionFactory.getCurrentSession().get(Stock.class, new Integer(stockId));
    }
}

package com.example.demo.service.impl;

import com.example.demo.dao.StockDao;
import com.example.demo.entity.Stock;
import com.example.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockDao stockDao;

    @Override
    public void createStock(Stock stock) {
        stockDao.saveStock(stock);
    }

    @Override
    public Stock getStock(int stockId) {
        return stockDao.getStock(stockId);
    }
}

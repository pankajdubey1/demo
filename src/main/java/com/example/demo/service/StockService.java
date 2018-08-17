package com.example.demo.service;

import com.example.demo.entity.Stock;

public interface StockService {

    void createStock(Stock stock);

    Stock getStock(int stockId);
}

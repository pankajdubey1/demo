package com.example.demo.controller;

import com.example.demo.service.StockService;
import com.example.demo.constant.Constants;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.Stock;
import com.example.demo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Constants.STOCK)
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping(value = "/create")
    public ResponseDTO createStock(@RequestBody Stock stock) {
        stockService.createStock(stock);
        return Util.getResponseDTO();
    }

    @RequestMapping(value = "/{stockId}")
    public Stock getStock(@PathVariable int stockId) {
        return stockService.getStock(stockId);
    }

}

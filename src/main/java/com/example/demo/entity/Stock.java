package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "stock")
public class Stock {

    @Id
    @Column(name = "stock_id")
    private int stockId;

    @Column(name = "stock_code")
    private String stockCode;

    @Column(name = "stock_name")
    private String stockName;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL/*, mappedBy = "stock"*/)
    private StockDetails stockDetails;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "stock_category", catalog = "demo", joinColumns = {
            @JoinColumn(name = "stock_id", nullable = false, updatable = false)},
    inverseJoinColumns = {@JoinColumn(name = "category_id", nullable = false, updatable = false)})
    private Set<Category> categories = new HashSet<>();

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public StockDetails getStockDetails() {
        return stockDetails;
    }

    public void setStockDetails(StockDetails stockDetails) {
        this.stockDetails = stockDetails;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}

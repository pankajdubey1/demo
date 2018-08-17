package com.example.demo.entity;

import javax.persistence.*;

@Entity(name = "stock_details")
public class StockDetails {

    @Id
    @Column(name = "stock_id")
    private int stockId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "remark")
    private String remark;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Stock stock;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}

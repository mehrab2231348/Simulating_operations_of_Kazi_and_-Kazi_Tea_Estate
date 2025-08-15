package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

import java.time.LocalDate;

public class CoordinateInventory {

    private String productId;
    private String productName;
    private int availableStock;
    private LocalDate lastSync;
    private String status;

    public CoordinateInventory(String productId, String productName, int availableStock, LocalDate lastSync, String status) {
        this.productId = productId;
        this.productName = productName;
        this.availableStock = availableStock;
        this.lastSync = lastSync;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public LocalDate getLastSync() {
        return lastSync;
    }

    public void setLastSync(LocalDate lastSync) {
        this.lastSync = lastSync;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CoordinateInventory{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", availableStock=" + availableStock +
                ", lastSync=" + lastSync +
                ", status='" + status + '\'' +
                '}';
    }
}


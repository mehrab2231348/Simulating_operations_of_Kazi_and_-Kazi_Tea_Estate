package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class Product {
    private String productName;
    private String category;
    private String batchNo;
    private double price;
    private String description;

    public Product(String productName, String category, String batchNo, double price, String description) {
        this.productName = productName;
        this.category = category;
        this.batchNo = batchNo;
        this.price = price;
        this.description = description;
    }


    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

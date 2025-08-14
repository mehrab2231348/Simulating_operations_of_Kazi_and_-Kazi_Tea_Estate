package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class ManageProductListings {

    private String productId;
    private String productImage; // You can store image path or URL
    private String name;
    private double price;
    private int stockQty;
    private String status;
    private String description;

    public ManageProductListings(String productId, String productImage, String name, double price, int stockQty, String status, String description) {
        this.productId = productId;
        this.productImage = productImage;
        this.name = name;
        this.price = price;
        this.stockQty = stockQty;
        this.status = status;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


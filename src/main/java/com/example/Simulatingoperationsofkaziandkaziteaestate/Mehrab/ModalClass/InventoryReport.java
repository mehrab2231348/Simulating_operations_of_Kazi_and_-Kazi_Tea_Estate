package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class InventoryReport {
    private String product;
    private String category;
    private String location;
    private int quantity;
    private String date;

    public InventoryReport(String product, String category, String location, int quantity, String date) {
        this.product = product;
        this.category = category;
        this.location = location;
        this.quantity = quantity;
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDate() {
        return date;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "InventoryReport{" +
                "product='" + product + '\'' +
                ", category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", quantity=" + quantity +
                ", date='" + date + '\'' +
                '}';
    }
}

package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class SalesReport {
    private String date;
    private String product;
    private String category;
    private String region;
    private int quantity;
    private double totalSale;

    public SalesReport(String date, String product, String category, String region, int quantity, double totalSale) {
        this.date = date;
        this.product = product;
        this.category = category;
        this.region = region;
        this.quantity = quantity;
        this.totalSale = totalSale;
    }

    public String getDate() {
        return date;
    }

    public String getProduct() {
        return product;
    }

    public String getCategory() {
        return category;
    }

    public String getRegion() {
        return region;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "date='" + date + '\'' +
                ", product='" + product + '\'' +
                ", category='" + category + '\'' +
                ", region='" + region + '\'' +
                ", quantity=" + quantity +
                ", totalSale=" + totalSale +
                '}';
    }
}



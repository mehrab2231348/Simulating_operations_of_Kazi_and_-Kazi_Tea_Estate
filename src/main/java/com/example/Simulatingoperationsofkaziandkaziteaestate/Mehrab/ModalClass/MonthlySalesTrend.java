package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class MonthlySalesTrend {
    private String date;
    private String product;
    private int quantity;
    private double revenue;

    public MonthlySalesTrend(String date, String product, int quantity, double revenue) {
        this.date = date;
        this.product = product;
        this.quantity = quantity;
        this.revenue = revenue;
    }

    public String getDate() {
        return date;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "MonthlySalesTrend{" +
                "date='" + date + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", revenue=" + revenue +
                '}';
    }
}

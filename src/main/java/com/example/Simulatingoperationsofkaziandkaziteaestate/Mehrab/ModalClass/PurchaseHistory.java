package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class PurchaseHistory {
    private String date;
    private String product;
    private int quantity;
    private double total;

    public PurchaseHistory(String date, String product, int quantity, double total) {
        this.date = date;
        this.product = product;
        this.quantity = quantity;
        this.total = total;
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

    public double getTotal() {
        return total;
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

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PurchaseHistory{" +
                "date='" + date + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}

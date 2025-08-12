package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class DailyHarvest {
    private String date;
    private String product;
    private int quantity;

    public DailyHarvest(String date, String product, int quantity) {
        this.date = date;
        this.product = product;
        this.quantity = quantity;
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DailyHarvest{" +
                "date='" + date + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class LowStockAlert {
    private String product;
    private int currentQuantity;
    private int threshold;

    public LowStockAlert(String product, int currentQuantity, int threshold) {
        this.product = product;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getProduct() {
        return product;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "LowStockAlert{" +
                "product='" + product + '\'' +
                ", currentQuantity=" + currentQuantity +
                ", threshold=" + threshold +
                '}';
    }
}

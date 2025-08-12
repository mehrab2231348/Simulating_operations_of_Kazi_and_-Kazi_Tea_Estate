package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class InvoiceProduct {
    private String productId;
    private String productName;
    private int currentQuantity;
    private int updatedQuantity;

    public InvoiceProduct(String productId, String productName, int currentQuantity, int updatedQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.currentQuantity = currentQuantity;
        this.updatedQuantity = updatedQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getUpdatedQuantity() {
        return updatedQuantity;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public void setUpdatedQuantity(int updatedQuantity) {
        this.updatedQuantity = updatedQuantity;
    }

    @Override
    public String toString() {
        return "InvoiceProduct{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", currentQuantity=" + currentQuantity +
                ", updatedQuantity=" + updatedQuantity +
                '}';
    }
}

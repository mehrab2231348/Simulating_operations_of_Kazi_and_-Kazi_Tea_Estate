package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class ArchivedProduct {
    private String productId;
    private String name;
    private String status;
    private String expiryDate;

    public ArchivedProduct(String productId, String name, String status, String expiryDate) {
        this.productId = productId;
        this.name = name;
        this.status = status;
        this.expiryDate = expiryDate;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ArchivedProduct{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
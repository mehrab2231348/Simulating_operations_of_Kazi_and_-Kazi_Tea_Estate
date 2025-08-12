package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class SyncStock {
    private String product;
    private int localQty;
    private int ecomQty;
    private String status;

    public SyncStock(String product, int localQty, int ecomQty, String status) {
        this.product = product;
        this.localQty = localQty;
        this.ecomQty = ecomQty;
        this.status = status;
    }

    public String getProduct() {
        return product;
    }

    public int getLocalQty() {
        return localQty;
    }

    public int getEcomQty() {
        return ecomQty;
    }

    public String getStatus() {
        return status;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setLocalQty(int localQty) {
        this.localQty = localQty;
    }

    public void setEcomQty(int ecomQty) {
        this.ecomQty = ecomQty;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SyncStock{" +
                "product='" + product + '\'' +
                ", localQty=" + localQty +
                ", ecomQty=" + ecomQty +
                ", status='" + status + '\'' +
                '}';
    }
}

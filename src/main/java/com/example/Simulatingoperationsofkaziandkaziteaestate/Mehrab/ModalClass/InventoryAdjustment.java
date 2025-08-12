package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class InventoryAdjustment {
    private String productId;
    private String adjustmentType;
    private int quantity;

    public InventoryAdjustment(String productId, String adjustmentType, int quantity) {
        this.productId = productId;
        this.adjustmentType = adjustmentType;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "InventoryAdjustment{" +
                "productId='" + productId + '\'' +
                ", adjustmentType='" + adjustmentType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

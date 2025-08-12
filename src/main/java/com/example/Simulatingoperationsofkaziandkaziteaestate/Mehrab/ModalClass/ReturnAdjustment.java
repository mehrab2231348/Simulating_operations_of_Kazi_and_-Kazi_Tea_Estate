package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class ReturnAdjustment {
    private String invoiceId;
    private String productId;
    private int returnQuantity;
    private String reason;

    public ReturnAdjustment(String invoiceId, String productId, int returnQuantity, String reason) {
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.returnQuantity = returnQuantity;
        this.reason = reason;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getProductId() {
        return productId;
    }

    public int getReturnQuantity() {
        return returnQuantity;
    }

    public String getReason() {
        return reason;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setReturnQuantity(int returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ReturnAdjustment{" +
                "invoiceId='" + invoiceId + '\'' +
                ", productId='" + productId + '\'' +
                ", returnQuantity=" + returnQuantity +
                ", reason='" + reason + '\'' +
                '}';
    }
}

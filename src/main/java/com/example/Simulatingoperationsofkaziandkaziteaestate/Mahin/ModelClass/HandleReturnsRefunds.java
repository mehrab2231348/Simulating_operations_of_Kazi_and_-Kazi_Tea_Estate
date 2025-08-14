package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class HandleReturnsRefunds {

    private String returnId;
    private String orderId;
    private String product;
    private String reason;
    private String status;


    public HandleReturnsRefunds(String returnId, String orderId, String product, String reason, String status) {
        this.returnId = returnId;
        this.orderId = orderId;
        this.product = product;
        this.reason = reason;
        this.status = status;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandleReturnsRefunds{" +
                "returnId='" + returnId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", product='" + product + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

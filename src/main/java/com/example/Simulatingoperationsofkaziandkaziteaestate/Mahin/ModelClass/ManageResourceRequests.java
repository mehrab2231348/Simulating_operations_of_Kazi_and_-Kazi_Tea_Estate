package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class ManageResourceRequests {

    private String resourceType;
    private int quantity;
    private String targetZone;
    private String reason;

    public ManageResourceRequests(String resourceType, int quantity, String targetZone, String reason) {
        this.resourceType = resourceType;
        this.quantity = quantity;
        this.targetZone = targetZone;
        this.reason = reason;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTargetZone() {
        return targetZone;
    }

    public void setTargetZone(String targetZone) {
        this.targetZone = targetZone;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ManageResourceRequests{" +
                "resourceType='" + resourceType + '\'' +
                ", quantity=" + quantity +
                ", targetZone='" + targetZone + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}

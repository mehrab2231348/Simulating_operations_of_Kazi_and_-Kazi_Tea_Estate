package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

import java.time.LocalDate;

public class FertilizerUsage {

    private String zone;
    private String fertilizerType;
    private double amountUsed;
    private double stock;
    private String status;
    private LocalDate lastUpdated;

    public FertilizerUsage(String zone, String fertilizerType, double amountUsed, double stock, String status, LocalDate lastUpdated) {
        this.zone = zone;
        this.fertilizerType = fertilizerType;
        this.amountUsed = amountUsed;
        this.stock = stock;
        this.status = status;
        this.lastUpdated = lastUpdated;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getFertilizerType() {
        return fertilizerType;
    }

    public void setFertilizerType(String fertilizerType) {
        this.fertilizerType = fertilizerType;
    }

    public double getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(double amountUsed) {
        this.amountUsed = amountUsed;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "FertilizerUsage{" +
                "zone='" + zone + '\'' +
                ", fertilizerType='" + fertilizerType + '\'' +
                ", amountUsed=" + amountUsed +
                ", stock=" + stock +
                ", status='" + status + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}

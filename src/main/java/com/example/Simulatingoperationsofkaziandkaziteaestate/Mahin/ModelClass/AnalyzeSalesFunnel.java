package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class AnalyzeSalesFunnel {

    private String funnelStage;
    private int visits;
    private int addsToCart;
    private int checkouts;
    private double conversionRate;

    public AnalyzeSalesFunnel(String funnelStage, int visits, int addsToCart, int checkouts, double conversionRate) {
        this.funnelStage = funnelStage;
        this.visits = visits;
        this.addsToCart = addsToCart;
        this.checkouts = checkouts;
        this.conversionRate = conversionRate;
    }

    public String getFunnelStage() {
        return funnelStage;
    }

    public void setFunnelStage(String funnelStage) {
        this.funnelStage = funnelStage;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public int getAddsToCart() {
        return addsToCart;
    }

    public void setAddsToCart(int addsToCart) {
        this.addsToCart = addsToCart;
    }

    public int getCheckouts() {
        return checkouts;
    }

    public void setCheckouts(int checkouts) {
        this.checkouts = checkouts;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }
}

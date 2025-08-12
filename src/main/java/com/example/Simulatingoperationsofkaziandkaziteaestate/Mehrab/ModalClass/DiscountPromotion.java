package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class DiscountPromotion {
    private String productId;
    private double discount;
    private String campaign;

    public DiscountPromotion(String productId, double discount, String campaign) {
        this.productId = productId;
        this.discount = discount;
        this.campaign = campaign;
    }

    public String getProductId() {
        return productId;
    }

    public double getDiscount() {
        return discount;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    @Override
    public String toString() {
        return "DiscountPromotion{" +
                "productId='" + productId + '\'' +
                ", discount=" + discount +
                ", campaign='" + campaign + '\'' +
                '}';
    }
}
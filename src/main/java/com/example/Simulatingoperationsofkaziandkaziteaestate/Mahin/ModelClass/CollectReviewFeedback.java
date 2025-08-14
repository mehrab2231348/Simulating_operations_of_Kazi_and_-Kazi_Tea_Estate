package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class CollectReviewFeedback {

    private String customer;
    private String orderId;
    private int rating;
    private String comment;

    public CollectReviewFeedback(String customer, String orderId, int rating, String comment) {
        this.customer = customer;
        this.orderId = orderId;
        this.rating = rating;
        this.comment = comment;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}


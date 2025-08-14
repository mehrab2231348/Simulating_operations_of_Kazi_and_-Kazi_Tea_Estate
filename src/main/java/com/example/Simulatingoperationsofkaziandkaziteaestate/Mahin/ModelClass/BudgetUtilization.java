package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

public class BudgetUtilization {

    private String category;
    private double budgetAllocated;
    private double spent;
    private double remaining;
    private String proposal;

    public BudgetUtilization(String category, double budgetAllocated, double spent, double remaining, String proposal) {
        this.category = category;
        this.budgetAllocated = budgetAllocated;
        this.spent = spent;
        this.remaining = remaining;
        this.proposal = proposal;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBudgetAllocated() {
        return budgetAllocated;
    }

    public void setBudgetAllocated(double budgetAllocated) {
        this.budgetAllocated = budgetAllocated;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    public double getRemaining() {
        return remaining;
    }

    public void setRemaining(double remaining) {
        this.remaining = remaining;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }
}

package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class SalesTrendReport {
    private String productId;
    private String productName;
    private int quantitySold;
    private double totalSales;
    private String region;

    public SalesTrendReport(String productId, String productName, int quantitySold, double totalSales, String region) {
        this.productId = productId;
        this.productName = productName;
        this.quantitySold = quantitySold;
        this.totalSales = totalSales;
        this.region = region;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public String getRegion() {
        return region;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "SalesTrendReport{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantitySold=" + quantitySold +
                ", totalSales=" + totalSales +
                ", region='" + region + '\'' +
                '}';
    }
}

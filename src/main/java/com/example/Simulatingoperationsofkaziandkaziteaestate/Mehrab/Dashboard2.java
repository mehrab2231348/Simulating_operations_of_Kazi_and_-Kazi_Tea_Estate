package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Dashboard2
{
    @javafx.fxml.FXML
    private BorderPane dashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void salesTrendReportOnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("salestrendreport.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void applyDiscountsPromotionsButtonOnclicked(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ApplyDiscountsPromotions.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void cancelVoidInvoiceButtonOnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CancelVoidInvoice.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void salesReportButtonOnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SalesReport.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void monthlySalesTrendReportButtonOnClicked(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MonthlySalesTrendReport.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void updateInvoiceQuantityButtonOnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UpdateInvoiceQuantity.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void customerPurchaseHistoryButtonOnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerPurchaseHistory.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void signOutButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReturnsAdjustmentsButtonOnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HandleReturnsAdjustments.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}
}
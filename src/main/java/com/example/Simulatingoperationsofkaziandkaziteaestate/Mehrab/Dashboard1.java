package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Dashboard1
{
    @javafx.fxml.FXML
    private BorderPane dashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStockOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UpdateStock.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void syncStockOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SyncStock.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void signOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateInventoryReportOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GenerateInventoryReport.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void lowStockAlertsOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LowStockAlerts.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void adjustInventoryOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdjustInventory.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void archiveProductsOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ArchiveProducts.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void addNewProductOnclick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddNewProduct.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}

    @javafx.fxml.FXML
    public void recordDailyHarvestOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RecordDailyHarvest.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);}
}
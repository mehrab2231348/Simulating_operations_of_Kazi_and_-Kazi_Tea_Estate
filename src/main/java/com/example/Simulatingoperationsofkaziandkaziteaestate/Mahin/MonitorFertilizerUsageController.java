package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.FertilizerUsage;
import javafx.scene.control.*;

import java.time.LocalDate;

public class MonitorFertilizerUsageController
{
    @javafx.fxml.FXML
    private Button updateBtn;
    @javafx.fxml.FXML
    private TableColumn<FertilizerUsage, String> zoneColumn;
    @javafx.fxml.FXML
    private DatePicker PrevioustUpdatedDate;
    @javafx.fxml.FXML
    private TableColumn<FertilizerUsage, Double> amountColumn;
    @javafx.fxml.FXML
    private TextField TotalAmount;
    @javafx.fxml.FXML
    private TableColumn<FertilizerUsage, String> typeColumn;
    @javafx.fxml.FXML
    private TextField TypeFertilizerTExtFeild;
    @javafx.fxml.FXML
    private TableView<FertilizerUsage> fertilizerTable;
    @javafx.fxml.FXML
    private TableColumn<FertilizerUsage, LocalDate> lastUpdatedColumn;
    @javafx.fxml.FXML
    private TableColumn<FertilizerUsage, Double> StockList;
    @javafx.fxml.FXML
    private Button requestBtn;
    @javafx.fxml.FXML
    private ComboBox<String> ZoneComboBoxFertilizer;
    @javafx.fxml.FXML
    private TableColumn<FertilizerUsage, String> FertilizerStatusColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }}
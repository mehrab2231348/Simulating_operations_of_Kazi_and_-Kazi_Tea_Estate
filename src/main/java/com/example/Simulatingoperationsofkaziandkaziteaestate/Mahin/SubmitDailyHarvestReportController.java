package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.DailyHarvest;
import javafx.scene.control.*;

import java.time.LocalDate;

public class SubmitDailyHarvestReportController
{
    @javafx.fxml.FXML
    private Button ViewDailyHarvestAllBtn;
    @javafx.fxml.FXML
    private DatePicker harvestDate;
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest, LocalDate> DailyDateTableCol;
    @javafx.fxml.FXML
    private Button submitBtn;
    @javafx.fxml.FXML
    private TextField DailyPluckerName;
    @javafx.fxml.FXML
    private TextField QualityTextFeildHarvest;
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest, String> zoneCol;
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest, String> qualityCol;
    @javafx.fxml.FXML
    private Label DailyLable;
    @javafx.fxml.FXML
    private TextField HarvestDaily;
    @javafx.fxml.FXML
    private TableView<DailyHarvest> harvestTable;
    @javafx.fxml.FXML
    private Label ZoneName;
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest, Double> harvestQtyCol;
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest, String> pluckerCol;

    @javafx.fxml.FXML
    public void initialize() {
    }}
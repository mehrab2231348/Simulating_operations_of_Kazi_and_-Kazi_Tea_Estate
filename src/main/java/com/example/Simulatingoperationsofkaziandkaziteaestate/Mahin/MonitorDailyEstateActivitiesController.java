package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.DailyEstateMonitoring;
import javafx.scene.control.*;
import javafx.scene.shape.Line;

import java.time.LocalDate;

public class MonitorDailyEstateActivitiesController
{
    @javafx.fxml.FXML
    private TableColumn<DailyEstateMonitoring, Double> RainfallColumn;
    @javafx.fxml.FXML
    private TextField absentField;
    @javafx.fxml.FXML
    private TableColumn<DailyEstateMonitoring, Integer> AbsentList;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ComboBox<String> zoneSelector;
    @javafx.fxml.FXML
    private Button ViewUpdateBtn;
    @javafx.fxml.FXML
    private TableColumn<DailyEstateMonitoring, String> DetailsMonitoringColumn;
    @javafx.fxml.FXML
    private Line DailyEstateLine;
    @javafx.fxml.FXML
    private TableColumn<DailyEstateMonitoring, LocalDate> DateColumn;
    @javafx.fxml.FXML
    private TableColumn<DailyEstateMonitoring, Double> PluckedList;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private TableView<DailyEstateMonitoring> MonitoringTable;
    @javafx.fxml.FXML
    private TextField rainfallField;
    @javafx.fxml.FXML
    private TextField pluckingField;
    @javafx.fxml.FXML
    private TableColumn<DailyEstateMonitoring, String> ZoneColumn;
    @javafx.fxml.FXML
    private Button saveBtn;

    @javafx.fxml.FXML
    public void initialize() {
    }}
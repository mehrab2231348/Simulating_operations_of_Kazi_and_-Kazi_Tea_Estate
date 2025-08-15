package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.EstateOperationLog;
import javafx.collections.ObservableList;
import javafx.scene.control.*;

import java.time.LocalDate;

public class MonitorEstateOperatorController
{
    @javafx.fxml.FXML
    private TextField pluckedField;
    @javafx.fxml.FXML
    private TextField absenteeField;
    @javafx.fxml.FXML
    private TableColumn<EstateOperationLog, Double> pluckedCol;
    @javafx.fxml.FXML
    private TableColumn<EstateOperationLog, String> zoneCol;
    @javafx.fxml.FXML
    private DatePicker activityDatePicker;
    @javafx.fxml.FXML
    private Button viewUpdatesBtn;
    @javafx.fxml.FXML
    private TableView<EstateOperationLog> dailyLogsTable;
    @javafx.fxml.FXML
    private TableColumn<EstateOperationLog, Integer> absenteeCol;
    @javafx.fxml.FXML
    private ComboBox<String> zoneComboBox;
    @javafx.fxml.FXML
    private TableColumn<EstateOperationLog, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<EstateOperationLog, String> rainfallCol;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private TextField rainfallField;
    @javafx.fxml.FXML
    private Button saveEntryBtn;
    @javafx.fxml.FXML
    private TableColumn<EstateOperationLog, String> remarksCol;

    private ObservableList<EstateOperationLog> operationLogs;

    @javafx.fxml.FXML
    public void initialize() {
    }}
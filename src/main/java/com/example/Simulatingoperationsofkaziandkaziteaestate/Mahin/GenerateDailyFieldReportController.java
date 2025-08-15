package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.GenerateDailyFieldReport;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GenerateDailyFieldReportController
{
    @FXML
    private TextField AbsentWorkerTextFeild;

    @FXML
    private TextArea NotesArea;

    @FXML
    private TableColumn<GenerateDailyFieldReport, Double> pluckedColumn;

    @FXML
    private DatePicker reportDate;

    @FXML
    private TableColumn<GenerateDailyFieldReport, String> zoneColumn;

    @FXML
    private TextField weightTextFeild;

    @FXML
    private Button GenerateBtn;

    @FXML
    private TableColumn<GenerateDailyFieldReport, String> NoteColumn;

    @FXML
    private Button shareBtn;

    @FXML
    private TableColumn<GenerateDailyFieldReport, Integer> absentColumn;

    @FXML
    private ComboBox<String> ZoneComboBox;

    @FXML
    private TableView<GenerateDailyFieldReport> zoneReportTable;

    private ObservableList<GenerateDailyFieldReport> reportList;

    @javafx.fxml.FXML
    public void initialize() {
    }}
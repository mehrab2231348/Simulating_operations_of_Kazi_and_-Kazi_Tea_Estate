package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.EquipmentLog;
import javafx.scene.control.*;

import java.time.LocalDate;

public class TrackEquipmentLogsContoller
{
    @javafx.fxml.FXML
    private TextField conditionBox;
    @javafx.fxml.FXML
    private DatePicker lastUseDatePicker;
    @javafx.fxml.FXML
    private Button updateBtn;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog, String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog, String> conditionCol;
    @javafx.fxml.FXML
    private TableView<EquipmentLog> equipmentTable;
    @javafx.fxml.FXML
    private TextField equipmentNameBox;
    @javafx.fxml.FXML
    private Button notifyBtn;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog, String> equipNameCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog, LocalDate> userCol;
    @javafx.fxml.FXML
    private TableColumn<EquipmentLog, LocalDate> equipmentServiceDateCol;
    @javafx.fxml.FXML
    private DatePicker serviceDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }}
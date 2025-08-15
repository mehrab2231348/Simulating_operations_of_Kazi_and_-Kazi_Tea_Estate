package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.AssignManageWorkerShifts;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.Line;

public class AssignManageWorkerShiftsController
{
    @FXML
    private Button assignBtn;

    @FXML
    private ComboBox<String> zoneComboBox;

    @FXML
    private TableView<AssignManageWorkerShifts> WorkerShiftTable;

    @FXML
    private Line line;

    @FXML
    private RadioButton morningBtn;

    @FXML
    private RadioButton eveningBtn;

    @FXML
    private ComboBox<String> taskTypeCombo;

    @FXML
    private TableColumn<AssignManageWorkerShifts, String> WorkerTask;

    @FXML
    private TextField workerName;

    @FXML
    private TableColumn<AssignManageWorkerShifts, String> WorkingZone;

    @FXML
    private TableColumn<AssignManageWorkerShifts, String> WorkerName;

    private ObservableList<AssignManageWorkerShifts> workerShiftData;

    @javafx.fxml.FXML
    public void initialize() {
    }}
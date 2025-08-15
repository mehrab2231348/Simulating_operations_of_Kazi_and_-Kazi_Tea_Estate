package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.ManageResourceRequests;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.Line;

public class ManageResourceRequestsController
{
    @FXML
    private Line ManageLine;
    @FXML
    private ComboBox<String> zoneComboBox;
    @FXML
    private Button sendBtn;
    @FXML
    private TableColumn<ManageResourceRequests, String> ManageReserceRequestZoneTable;
    @FXML
    private TableColumn<ManageResourceRequests, String> TypeTable;
    @FXML
    private TableColumn<ManageResourceRequests, Integer> QuantityTable;
    @FXML
    private TableColumn<ManageResourceRequests, String> ReasonTableColumn;
    @FXML
    private TableView<ManageResourceRequests> InformationBox;
    @FXML
    private TextArea reasonArea;
    @FXML
    private ComboBox<String> resourceTypeBox;
    @FXML
    private TextField quantityField;

    private ObservableList<ManageResourceRequests> requestList;

    @javafx.fxml.FXML
    public void initialize() {
    }}
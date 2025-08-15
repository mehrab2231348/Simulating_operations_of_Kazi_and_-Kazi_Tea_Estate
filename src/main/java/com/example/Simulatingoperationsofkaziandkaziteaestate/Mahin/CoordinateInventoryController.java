package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.CoordinateInventory;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CoordinateInventoryController
{
    @FXML
    private TableView<CoordinateInventory> inventoryTable;
    @FXML
    private TableColumn<CoordinateInventory, String> prodIdCol;
    @FXML
    private TableColumn<CoordinateInventory, String> nameCol;
    @FXML
    private TableColumn<CoordinateInventory, Integer> stockCol;
    @FXML
    private TableColumn<CoordinateInventory, LocalDate> lastUpdateCol;
    @FXML
    private TableColumn<CoordinateInventory, String> StatusInventoryCoordinatorTable;
    @FXML
    private Button syncBtn;
    @FXML
    private TextField ItemName;
    @FXML
    private TextField PoductIDCheckBox;
    @FXML
    private ComboBox<String> StatusCheckBox;
    private ObservableList<CoordinateInventory> inventoryList;

    @javafx.fxml.FXML
    public void initialize() {
    }}
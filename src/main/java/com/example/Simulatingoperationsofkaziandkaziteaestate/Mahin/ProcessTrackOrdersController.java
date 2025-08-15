package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.Order;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ProcessTrackOrdersController
{
    @javafx.fxml.FXML
    private ComboBox<String> StatusOdeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Order, String> customerCol;
    @javafx.fxml.FXML
    private Button updateBtn;
    @javafx.fxml.FXML
    private TableColumn<Order, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Order, String> statusCol;
    @javafx.fxml.FXML
    private TextField idBox;
    @javafx.fxml.FXML
    private Button viewDetailsBtn;
    @javafx.fxml.FXML
    private TableView<Order> ordersTable;
    @javafx.fxml.FXML
    private TableColumn<Order, Double> totalCol;
    @javafx.fxml.FXML
    private Label id;
    @javafx.fxml.FXML
    private TableColumn<Order, String> orderIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }}
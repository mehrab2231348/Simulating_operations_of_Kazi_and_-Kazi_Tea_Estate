package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.ManageProductListings;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.Line;

public class ManageProductListingsController
{
    @FXML
    private TableColumn<ManageProductListings, Integer> stockCol;
    @FXML
    private Button imageBtn;
    @FXML
    private TableColumn<ManageProductListings, String> ImageViewOnTable;
    @FXML
    private ComboBox<String> statusCombo;
    @FXML
    private TableColumn<ManageProductListings, String> DescriptionTable;
    @FXML
    private TextField nameField;
    @FXML
    private TextField stockField;
    @FXML
    private TableView<ManageProductListings> productsTable;
    @FXML
    private javafx.scene.shape.Line ProductListingManagementLine;
    @FXML
    private TableColumn<ManageProductListings, String> prodIdCol;
    @FXML
    private TableColumn<ManageProductListings, Double> priceCol;
    @FXML
    private TextArea descriptionArea;
    @FXML
    private TableColumn<ManageProductListings, String> statusCol;
    @FXML
    private TextField priceField;
    @FXML
    private TableColumn<ManageProductListings, String> nameCol;
    @FXML
    private Button saveProductBtn;
    @FXML
    private TextField nameField1; // Product ID input

    private ObservableList<ManageProductListings> productList;

    @javafx.fxml.FXML
    public void initialize() {
    }}
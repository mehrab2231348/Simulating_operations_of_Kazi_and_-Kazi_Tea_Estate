package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.VendorSubmission;
import javafx.scene.control.*;

import java.time.LocalDate;

public class MonitorVendorSubmissionsController
{
    @javafx.fxml.FXML
    private TableColumn<VendorSubmission, String>vendorNameCol;
    @javafx.fxml.FXML
    private Button UpdateBtn;
    @javafx.fxml.FXML
    private TableColumn<VendorSubmission, String> prodNameCol;
    @javafx.fxml.FXML
    private DatePicker SubmissionDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<VendorSubmission, String> statusCol;
    @javafx.fxml.FXML
    private TableView<VendorSubmission> vendorTable;
    @javafx.fxml.FXML
    private TableColumn<VendorSubmission, LocalDate> submissionDateCol;
    @javafx.fxml.FXML
    private TextField VendorIDTextFeild;
    @javafx.fxml.FXML
    private ComboBox<String> StatusComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }}
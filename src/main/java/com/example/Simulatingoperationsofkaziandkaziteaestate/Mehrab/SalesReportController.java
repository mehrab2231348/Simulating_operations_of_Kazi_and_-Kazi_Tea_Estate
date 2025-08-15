package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.SalesReport;
import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.SalesTrendReport;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SalesReportController
{
    @javafx.fxml.FXML
    private TableColumn<SalesReport,Integer> quantityColumn;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,Integer> totalColumn;
    @javafx.fxml.FXML
    private TableView<SalesReport> salesTableView;
    @javafx.fxml.FXML
    private TableColumn<SalesReport, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TextField categoryTextField;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> categoryColumn;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> regionColumn;
    @javafx.fxml.FXML
    private TextField regionTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void exportOnClicked(ActionEvent actionEvent) {
    }

    @Deprecated
    public void filterOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportButtonOnClicked(ActionEvent actionEvent) {
    }
}
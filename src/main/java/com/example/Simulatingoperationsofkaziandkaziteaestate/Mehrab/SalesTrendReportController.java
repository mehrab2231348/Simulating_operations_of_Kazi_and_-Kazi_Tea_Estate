package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalesTrendReportController
{
    @javafx.fxml.FXML
    private ComboBox categoryComboBox;
    @javafx.fxml.FXML
    private TableColumn quantitySoldColumn;
    @javafx.fxml.FXML
    private TableView reportTableView;
    @javafx.fxml.FXML
    private TableColumn productNameColumn;
    @javafx.fxml.FXML
    private TableColumn regionColumn;
    @javafx.fxml.FXML
    private DatePicker monthDatePicker;
    @javafx.fxml.FXML
    private TableColumn productIdColumn;
    @javafx.fxml.FXML
    private TableColumn totalSalesColumn;
    @javafx.fxml.FXML
    private TextArea summaryTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void generateOnClicked(ActionEvent actionEvent) {
    }

    @Deprecated
    public void exportOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateButtonOnClicked(ActionEvent actionEvent) {
    }
}
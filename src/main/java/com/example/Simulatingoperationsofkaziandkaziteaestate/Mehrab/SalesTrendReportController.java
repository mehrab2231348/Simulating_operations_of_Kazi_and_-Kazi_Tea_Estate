package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.SalesTrendReport;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalesTrendReportController
{
    @javafx.fxml.FXML
    private ComboBox<String>categoryComboBox;
    @javafx.fxml.FXML
    private TableColumn<SalesTrendReport,Integer> quantitySoldColumn;
    @javafx.fxml.FXML
    private TableView<SalesTrendReport> reportTableView;
    @javafx.fxml.FXML
    private TableColumn<SalesTrendReport,String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<SalesTrendReport,String> regionColumn;
    @javafx.fxml.FXML
    private DatePicker monthDatePicker;
    @javafx.fxml.FXML
    private TableColumn<SalesTrendReport,Integer> productIdColumn;
    @javafx.fxml.FXML
    private TableColumn<SalesTrendReport,Integer> totalSalesColumn;
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
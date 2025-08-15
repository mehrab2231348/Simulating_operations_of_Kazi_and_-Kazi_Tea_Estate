package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.InventoryReport;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GenerateInventoryReportController
{
    @javafx.fxml.FXML
    private TableColumn<InventoryReport,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryReport,String> thresholdColumn;
    @javafx.fxml.FXML
    private TextField thresholdTextField;
    @javafx.fxml.FXML
    private TableColumn<InventoryReport,Integer> currentQtyColumn;
    @javafx.fxml.FXML
    private TableView<InventoryReport> alertTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void generateReportOnClicked(ActionEvent actionEvent) {
    }

    @Deprecated
    public void setAlertOnClicked(ActionEvent actionEvent) {
    }


    @Deprecated
    public void generateButtonReportOnClicked(ActionEvent actionEvent) {
    }
}
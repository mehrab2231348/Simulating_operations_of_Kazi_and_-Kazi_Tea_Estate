package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LowStockAlertsController
{
    @javafx.fxml.FXML
    private TableColumn thresholdColumn;
    @javafx.fxml.FXML
    private TextField thresholdTextField;
    @javafx.fxml.FXML
    private TableColumn currentQtyColumn;
    @javafx.fxml.FXML
    private TableColumn productColumn;
    @javafx.fxml.FXML
    private TableView alertTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void setAlertButtonOnClicked(ActionEvent actionEvent) {
    }
}
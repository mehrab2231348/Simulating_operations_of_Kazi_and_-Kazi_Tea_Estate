package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.LowStockAlert;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LowStockAlertsController
{
    @javafx.fxml.FXML
    private TableColumn<LowStockAlert,String> thresholdColumn;
    @javafx.fxml.FXML
    private TextField thresholdTextField;
    @javafx.fxml.FXML
    private TableColumn<LowStockAlert,Integer> currentQtyColumn;
    @javafx.fxml.FXML
    private TableColumn<LowStockAlert,String> productColumn;
    @javafx.fxml.FXML
    private TableView<LowStockAlert> alertTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void setAlertButtonOnClicked(ActionEvent actionEvent) {
    }
}
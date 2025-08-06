package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdjustInventoryController
{
    @javafx.fxml.FXML
    private TableView ProductInfoTableView;
    @javafx.fxml.FXML
    private TableColumn quantityColumn;
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private ComboBox adjustTypeComboBox;
    @javafx.fxml.FXML
    private TextField adjustQuantityTextField;
    @javafx.fxml.FXML
    private TableColumn productIdColumn;
    @javafx.fxml.FXML
    private TableColumn adjustmentTypeColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void applyAdjustmentOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyAdjustmentButtonOnClicked(ActionEvent actionEvent) {
    }
}
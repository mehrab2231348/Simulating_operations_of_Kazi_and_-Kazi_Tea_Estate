package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.InventoryAdjustment;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdjustInventoryController
{
    @javafx.fxml.FXML
    private TableView<InventoryAdjustment> ProductInfoTableView;
    @javafx.fxml.FXML
    private TableColumn<InventoryAdjustment,Integer> quantityColumn;
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> adjustTypeComboBox;
    @javafx.fxml.FXML
    private TextField adjustQuantityTextField;
    @javafx.fxml.FXML
    private TableColumn<InventoryAdjustment,Integer> productIdColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryAdjustment,String> adjustmentTypeColumn;

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
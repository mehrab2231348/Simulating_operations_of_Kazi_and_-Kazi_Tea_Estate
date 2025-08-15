package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.SyncStock;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SyncStockController
{
    @javafx.fxml.FXML
    private TableView<SyncStock> syncTableView;
    @javafx.fxml.FXML
    private TableColumn<SyncStock,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<SyncStock,Integer> ecomQtyColumn;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private Label syncStatusLabel;
    @javafx.fxml.FXML
    private TableColumn<SyncStock,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<SyncStock,String> localQtyColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void syncNowOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void syncNowButtonOnClicked(ActionEvent actionEvent) {
    }
}
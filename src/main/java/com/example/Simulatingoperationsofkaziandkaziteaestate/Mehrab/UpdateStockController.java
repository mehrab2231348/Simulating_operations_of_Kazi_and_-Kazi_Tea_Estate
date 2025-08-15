package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.Stock;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UpdateStockController
{
    @javafx.fxml.FXML
    private TableColumn<Stock,Integer> quantityColumn;
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Stock,String> nameColumn;
    @javafx.fxml.FXML
    private TextField newQtyTextField;
    @javafx.fxml.FXML
    private TableView<Stock> stockTableView;
    @javafx.fxml.FXML
    private TableColumn<Stock,Integer> idColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void updateOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOnClicked(ActionEvent actionEvent) {
    }
}
package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.PurchaseHistory;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CustomerPurchaseHistoryController
{
    @javafx.fxml.FXML
    private TableColumn<PurchaseHistory,Integer> quantityColumn;
    @javafx.fxml.FXML
    private TableView<PurchaseHistory> historyTable;
    @javafx.fxml.FXML
    private TextField customerIdTextField;
    @javafx.fxml.FXML
    private TableColumn<PurchaseHistory,Integer> totalColumn;
    @javafx.fxml.FXML
    private TableColumn<PurchaseHistory, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<PurchaseHistory,String> productColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void searchOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchButtonOnClicked(ActionEvent actionEvent) {
    }
}
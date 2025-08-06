package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ArchiveProductsController
{
    @javafx.fxml.FXML
    private TableView productTableView;
    @javafx.fxml.FXML
    private CheckBox expiredCheckbox;
    @javafx.fxml.FXML
    private TableColumn expiryColumn;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TextField searchProductTextField;
    @javafx.fxml.FXML
    private CheckBox discontinuedCheckbox;
    @javafx.fxml.FXML
    private TableColumn idColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void archiveSelectedOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void archiveSelectedButtonOnClicked(ActionEvent actionEvent) {
    }
}
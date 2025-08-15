package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.ArchivedProduct;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ArchiveProductsController
{
    @javafx.fxml.FXML
    private TableView<ArchivedProduct> productTableView;
    @javafx.fxml.FXML
    private CheckBox expiredCheckbox;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct, LocalDate> expiryColumn;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,String> statusColumn;
    @javafx.fxml.FXML
    private TextField searchProductTextField;
    @javafx.fxml.FXML
    private CheckBox discontinuedCheckbox;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,Integer> idColumn;

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
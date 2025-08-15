package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.InvoiceProduct;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UpdateInvoiceQuantityController
{
    @javafx.fxml.FXML
    private TextField updatedQuantityTextField;
    @javafx.fxml.FXML
    private TextField invoiceIdTextField;
    @javafx.fxml.FXML
    private TextField currentQuantityTextField;
    @javafx.fxml.FXML
    private TableView<InvoiceProduct> invoiceTable;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TableColumn<InvoiceProduct,Integer> currentQtyColumn;
    @javafx.fxml.FXML
    private TableColumn<InvoiceProduct,String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<InvoiceProduct,String> productIdColumn;
    @javafx.fxml.FXML
    private TableColumn<InvoiceProduct,Integer> updateQtyColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void searchOnClicked(ActionEvent actionEvent) {
    }

    @Deprecated
    public void updateOnclicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOnclicked(ActionEvent actionEvent) {
    }
}
package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.InvoiceLog;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CancelVoidInvoiceController
{
    @javafx.fxml.FXML
    private TableColumn<InvoiceLog,String> reasonColumn;
    @javafx.fxml.FXML
    private TextField invoiceIdTextField;
    @javafx.fxml.FXML
    private TableColumn<InvoiceLog,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<InvoiceLog,Integer> invoiceColumn;
    @javafx.fxml.FXML
    private TableView<InvoiceLog> logTableView;
    @javafx.fxml.FXML
    private TableColumn<InvoiceLog, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TextArea reasonTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void cancelOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancelButtonOnClicked(ActionEvent actionEvent) {
    }
}
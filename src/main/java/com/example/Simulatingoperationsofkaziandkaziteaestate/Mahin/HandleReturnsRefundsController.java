package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.HandleReturnsRefunds;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HandleReturnsRefundsController
{
    @FXML
    private Button UpdateBtn;

    @FXML
    private TableColumn<HandleReturnsRefunds, String> statusCol;

    @FXML
    private TableColumn<HandleReturnsRefunds, String> reasonCol;

    @FXML
    private TextField OrderIDTextFeild;

    @FXML
    private ChoiceBox<String> FutherProcessComboBox;

    @FXML
    private TableView<HandleReturnsRefunds> returnsTable;

    @FXML
    private RadioButton ApproveRdBtn;

    @FXML
    private TableColumn<HandleReturnsRefunds, String> productCol;

    @FXML
    private TableColumn<HandleReturnsRefunds, String> returnIdCol;

    @FXML
    private TableColumn<HandleReturnsRefunds, String> orderIdCol;

    @FXML
    private RadioButton RejectRdBtn;

    private ObservableList<HandleReturnsRefunds> returnList;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void reject(Event event) {
    }

    @javafx.fxml.FXML
    public void approve(Event event) {
    }
}
package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.DailyHarvest;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class RecordDailyHarvestController
{
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest,String> quantityColumn;
    @javafx.fxml.FXML
    private DatePicker harvestDatePicker;
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private ComboBox<String> productComboBox;
    @javafx.fxml.FXML
    private TableColumn<DailyHarvest,String> productColumn;
    @javafx.fxml.FXML
    private TableView<DailyHarvest> harvestTableView;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void recordOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordButtonOnClicked(ActionEvent actionEvent) {
    }
}
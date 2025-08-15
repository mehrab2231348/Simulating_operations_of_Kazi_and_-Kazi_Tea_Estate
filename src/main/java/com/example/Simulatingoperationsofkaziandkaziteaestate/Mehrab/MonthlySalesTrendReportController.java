package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.MonthlySalesTrend;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class MonthlySalesTrendReportController
{
    @javafx.fxml.FXML
    private TableColumn<MonthlySalesTrend,Integer> quantityColumn;
    @javafx.fxml.FXML
    private ComboBox<LocalDate> monthComboBox;
    @javafx.fxml.FXML
    private TableView<MonthlySalesTrend> trendTableView;
    @javafx.fxml.FXML
    private TableColumn<MonthlySalesTrend,LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<MonthlySalesTrend,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<MonthlySalesTrend,String> revenueColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void submitOnClicked(ActionEvent actionEvent) {
    }

    @Deprecated
    public void generateOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateButtonOnClicked(ActionEvent actionEvent) {
    }
}
package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import javafx.scene.control.*;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.AnalyzeSalesFunnel;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AnalyzeSalesFunnelController {

    @javafx.fxml.FXML
    private Button refreshBtn;

    @javafx.fxml.FXML
    private TableColumn<AnalyzeSalesFunnel, String> stageCol;

    @javafx.fxml.FXML
    private TableColumn<AnalyzeSalesFunnel, Integer> visitsCol;

    @javafx.fxml.FXML
    private TableColumn<AnalyzeSalesFunnel, Integer> addsToCartCol;

    @javafx.fxml.FXML
    private TableColumn<AnalyzeSalesFunnel, Integer> checkoutCol;

    @javafx.fxml.FXML
    private TableColumn<AnalyzeSalesFunnel, Double> conversionCol;

    @javafx.fxml.FXML
    private TableView<AnalyzeSalesFunnel> funnelTable;

    private ObservableList<AnalyzeSalesFunnel> funnelData;

    @javafx.fxml.FXML
    public void initialize() {
    }}
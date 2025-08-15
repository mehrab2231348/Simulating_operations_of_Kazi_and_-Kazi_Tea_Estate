package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.BudgetUtilization;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ReviewBudgetUtilizationController
{
    @javafx.fxml.FXML
    private TextArea proposalArea;
    @javafx.fxml.FXML
    private Button submitBtn;
    @javafx.fxml.FXML
    private TableColumn<BudgetUtilization, Double> remainingCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetUtilization, String> categoryCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetUtilization, Double> allocatedCol;
    @javafx.fxml.FXML
    private TableColumn<BudgetUtilization, Double> spentCol;
    @javafx.fxml.FXML
    private TableView<BudgetUtilization> budgetTable;
    @javafx.fxml.FXML
    private TableColumn<BudgetUtilization, String> remarksCol;

    @javafx.fxml.FXML
    public void initialize() {
    }}
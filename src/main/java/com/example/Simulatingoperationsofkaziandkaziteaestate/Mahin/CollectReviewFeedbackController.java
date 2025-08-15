package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass.CollectReviewFeedback;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CollectReviewFeedbackController
{
    @FXML
    private TableColumn<CollectReviewFeedback, String> custNameCol;

    @FXML
    private TableColumn<CollectReviewFeedback, String> orderCol;

    @FXML
    private TableColumn<CollectReviewFeedback, Integer> ratingCol;

    @FXML
    private TableColumn<CollectReviewFeedback, String> commentCol;

    @FXML
    private Button viewUpdateBtn;

    @FXML
    private TableView<CollectReviewFeedback> feedbackTable;

    private ObservableList<CollectReviewFeedback> feedbackList;

    @javafx.fxml.FXML
    public void initialize() {
    }}


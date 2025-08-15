package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.DiscountPromotion;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ApplyDiscountsPromotionsController
{
    @javafx.fxml.FXML
    private TableColumn<String,Integer> discountColumn;
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private TextField discountTextField;
    @javafx.fxml.FXML
    private TableColumn<DiscountPromotion,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<DiscountPromotion,String> campaignColumn;
    @javafx.fxml.FXML
    private TextField campaignTextField;
    @javafx.fxml.FXML
    private TableView<DiscountPromotion> discountTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void applyDiscountOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyDiscountButtonOnClicked(ActionEvent actionEvent) {
    }
}
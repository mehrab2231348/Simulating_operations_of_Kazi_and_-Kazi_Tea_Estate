package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab;

import com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass.Product;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AddNewProductController
{
    @javafx.fxml.FXML
    private TableColumn<Product,Integer> batchNoColumn;
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TextField batchTextField;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn<Product,String> productNameColumn;
    @javafx.fxml.FXML
    private TableView<Product> ProductTableView;
    @javafx.fxml.FXML
    private TableColumn<Product,Double> priceColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addProductButtonOnClicked(ActionEvent actionEvent) {

    }
}
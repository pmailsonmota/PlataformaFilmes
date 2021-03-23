package home.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {

    @FXML
    private AnchorPane anchorPaneLogin;

    @FXML
    private TextField tfLogin;

    @FXML
    private TextField tfSenha;

    @FXML
    private Button btnEntrar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

package home.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private AnchorPane anchorPaneMeusFilmes;

    @FXML
    private Button btnMeusFilmes;

    @FXML
    private Button btnGenero;

    @FXML
    private Button btnFavorito;

    @FXML
    private Button btnConta;

    @FXML
    void handleMenuConta(ActionEvent event) throws IOException {
        carregarTela("Conta");
    }

    @FXML
    void handleMenuFavorito(ActionEvent event) throws IOException {
        carregarTela("Favoritos");
    }

    @FXML
    void handleMenuGenero(ActionEvent event) throws IOException {
        carregarTela("Genero");
    }


    @FXML
    void handleMenuMain(ActionEvent event) throws IOException {
        carregarTela("MeusFilmes");
    }

    public void carregarTela(String tela) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/home/fxml/"+tela+".fxml"));
        anchorPaneMeusFilmes.getChildren().setAll(a);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}

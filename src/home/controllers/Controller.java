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
    private Button btnListaFilmes;

    @FXML
    private Button btnListaClientes;

    @FXML
    private Button btnCadastraCliente;

    @FXML
    private Button btnCadastraFilme;

    @FXML
    void handleMenuMain(ActionEvent event) throws IOException {
        carregarTela("MeusFilmes");
    }

    @FXML
    void handleMenuListaFilmes(ActionEvent event) throws IOException {
        carregarTela("ListaFilmes");
    }

    @FXML
    void handleMenuCadastraCliente(ActionEvent event) throws IOException {
        carregarTela("CadastroCliente");
    }

    @FXML
    void handleMenuCadastraFilmes(ActionEvent event) throws IOException {
        carregarTela("CadastroFilmes");
    }

    public void carregarTela(String tela) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/home/fxml/"+tela+".fxml"));
        anchorPaneMeusFilmes.getChildren().setAll(a);




    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}

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

public class ControllerMainAdmin implements Initializable {

    @FXML
    private Button btnMeusListaFilmes;

    @FXML
    private Button btnListaClientes;

    @FXML
    private Button btnCadastraClientes;

    @FXML
    private Button btnCadastraFilmes;

    @FXML
    private AnchorPane anchorPaneMainAdmin;

    @FXML
    void handleMenuCadastraClientes(ActionEvent event) throws IOException {
        carregarTela("CadastroCliente");
    }

    @FXML
    void handleMenuCadastraFilmes(ActionEvent event) throws IOException {
        carregarTela("CadastroFilmes");
    }

    @FXML
    void handleMenuListaClientes(ActionEvent event) throws IOException {
        carregarTela("ListaClientes");
    }

    @FXML
    void handleMenuListaFilmes(ActionEvent event) throws IOException {
        carregarTela("ListaFilmes");
    }

    public void carregarTela(String tela) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/home/fxml/"+tela+".fxml"));
        anchorPaneMainAdmin.getChildren().setAll(a);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

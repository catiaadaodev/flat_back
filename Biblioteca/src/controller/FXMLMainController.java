package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author hp
 */
public class FXMLMainController implements Initializable {

    @FXML
    private Button btnLivro;

    @FXML
    private Button btnRevista;

    @FXML
    private Button btnCD;

    @FXML
    private Button btnEmpresta;

    @FXML
    private Button btnRecebe;

    @FXML
    private Button btnDisp;

    @FXML
    private Button btnEmp;

    @FXML
    private StackPane container;

    @FXML
    private VBox livroForm, cdForm, revistaForm, emprestimoForm;

    @FXML
    public void actionEvent(ActionEvent e) {

        Object event = e.getSource();

        if (event.equals(btnLivro)) {
            livroForm.setVisible(true);
            cdForm.setVisible(false);
            revistaForm.setVisible(false);
            emprestimoForm.setVisible(false);
        }
        else  if (event.equals(btnRevista)) {
            livroForm.setVisible(false);
            cdForm.setVisible(false);
            revistaForm.setVisible(true);
        } else if (event.equals(btnCD)) {
            livroForm.setVisible(false);
            cdForm.setVisible(true);
            revistaForm.setVisible(false);
            emprestimoForm.setVisible(false);
        }
        else if (event.equals(btnEmpresta)) {
            livroForm.setVisible(false);
            cdForm.setVisible(false);
            revistaForm.setVisible(false);
            emprestimoForm.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            livroForm = loadForm("/main/registarLivro/RegistarLivro.fxml");
            cdForm = loadForm("/main/registarCD/RegistarCD.fxml");
            revistaForm = loadForm("/main/registarRevista/RegistarRevista.fxml");
            emprestimoForm = loadForm("/main/emprestarItem/EmprestarItem.fxml");

            container.getChildren().addAll(livroForm, revistaForm, cdForm, emprestimoForm);
            livroForm.setVisible(true);
            cdForm.setVisible(false);
            revistaForm.setVisible(false);
            emprestimoForm.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private VBox loadForm(String url) throws IOException {

        VBox vbox = FXMLLoader.load(getClass().getResource(url));
        return vbox;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.registarRevista;

import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.RevistaModel;
import view.Revista;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class RegistarRevistaController implements Initializable {

     @FXML
    private TextField tituloRevista;

    @FXML
    private TextField edicaoRevista;

    @FXML
    private TextField issnRevista;

    @FXML
    private TextField editoraRevista;

    @FXML
    private TextField numeroRevista;

    @FXML
    private TextField dataRevista;

    @FXML
    private void btnRegistarRevista() throws ClassNotFoundException, ParseException {

        JOptionPane.showMessageDialog(null, "Dados da Resvista gravados");

        Revista revista = new Revista(Integer.parseInt(issnRevista.getText()), tituloRevista.getText(), editoraRevista.getText(), Integer.parseInt(edicaoRevista.getText()), Integer.parseInt(numeroRevista.getText()), Integer.parseInt(dataRevista.getText()));

        RevistaModel rev = new RevistaModel();
        rev.registarRevista(revista);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

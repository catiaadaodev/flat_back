/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.registarLivro;

import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.Action;
import javax.swing.JOptionPane;
import model.LivroModel;
import view.Livro;


/**
 * FXML Controller class
 *
 * @author hp
 */
public class RegistarLivroController implements Initializable {

    @FXML
    private TextField tituloLivro;

    @FXML
    private TextField generoLivro;

    @FXML
    private TextField isbnLivro;

    @FXML
    private TextField editoraLivro;

    @FXML
    private TextField numeroLivro;

    @FXML
    private TextField dataLivro;
    
    @FXML
    private void btnRegistarLivro() throws ClassNotFoundException, ParseException {

        

        Livro livro = new Livro(Integer.parseInt(isbnLivro.getText()), tituloLivro.getText(), editoraLivro.getText(), generoLivro.getText(), Integer.parseInt(numeroLivro.getText()), Integer.parseInt(dataLivro.getText()));

        LivroModel lv = new LivroModel();
        lv.registarLivro(livro);
        
        JOptionPane.showMessageDialog(null, "Dados do Livro gravados");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

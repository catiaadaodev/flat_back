/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.emprestarItem;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;
import view.Livro;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class EmprestarItemController implements Initializable {

    @FXML
    private RadioButton livro;

    @FXML
    private RadioButton revista;

    @FXML
    private RadioButton cd;

    @FXML
    private TextField clienteEmprestimo;

    @FXML
    private TextField livroEmprestimo;

    @FXML
    private TextField dataEmprestimo;

    @FXML
    private ComboBox<Livro> listaItem;

    @FXML
    private ToggleGroup item;

    @FXML
    private void itemLivro() {

        RadioButton radio = (RadioButton) item.getSelectedToggle();

        JOptionPane.showMessageDialog(null, "Livro");
    }
    
    private List <Livro> livros = new ArrayList<>();
    private ObservableList <Livro> lv;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarLivros ();
    }
    
    public void carregarLivros () {
        
        Livro livro1 = new Livro (1, "Arte", "Avelar", "Romance", 12, 20);
        Livro livro2 = new Livro (2, "Guerra", "Oliver", "Drama", 15, 40);
        livros.add(livro1);
        livros.add(livro2);
        
        lv = FXCollections.observableArrayList(livros);
        listaItem.setItems(lv);
        
    }
}

package controller.registarCD;

import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.CDModel;
import view.CD;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class RegistarCDController implements Initializable {

    @FXML
    private TextField tituloCD;

    @FXML
    private TextField generoCD;

    @FXML
    private TextField faixasCD;

    @FXML
    private TextField gravadoraCD;

    @FXML
    private TextField duracaoCD;

    @FXML
    private TextField dataCD;


    @FXML
    private void btnRegistarCD() throws ClassNotFoundException, ParseException {

        

        CD cd = new CD(tituloCD.getText(), gravadoraCD.getText(), generoCD.getText(), Integer.parseInt(faixasCD.getText()), Integer.parseInt(duracaoCD.getText()), Integer.parseInt(dataCD.getText()));

        CDModel c = new CDModel();
        c.registarCD(cd);
        
        JOptionPane.showMessageDialog(null, "Dados do CD gravados");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

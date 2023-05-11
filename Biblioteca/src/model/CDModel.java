package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.CD;

/**
 *
 * @author hp
 */
public class CDModel {

    Connection connect;
    PreparedStatement pstm;

    public void registarCD(CD cd) throws ClassNotFoundException {
        String sql = "insert into cd (titulo, gravadora, genero, faixas, duracao, dataPublicacao) values (?, ?, ?, ?, ?, ?)";
        connect = new Conexao().conexaoBD();

        try {
            pstm = connect.prepareStatement(sql);
            pstm.setString(1, cd.getTitulo());
            pstm.setString(2, cd.getGravadora());
            pstm.setString(3, cd.getGenero());
            pstm.setInt(4, cd.getFaixas());
            pstm.setInt(5, cd.getDuracao());
            pstm.setInt(6, cd.getDataPublicacao());

            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}

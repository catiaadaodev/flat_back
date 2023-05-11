/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.Revista;

/**
 *
 * @author hp
 */
public class RevistaModel {
    
        Connection connect;
    PreparedStatement pstm;
    
    public void registarRevista (Revista revista) throws ClassNotFoundException {
        String sql = "insert into revista (issn, titulo, editora, edicao, numeroPagina, dataPublicacao) values (?, ?, ?, ?, ?, ?)";
        connect = new Conexao().conexaoBD();
        
        try {
            pstm = connect.prepareStatement(sql);
            pstm.setInt(1, revista.getIssn());
            pstm.setString(2, revista.getTitulo());
            pstm.setString(3, revista.getEditora());
            pstm.setInt(4, revista.getEdicao());
            pstm.setInt(5, revista.getNumeroPaginas());
            pstm.setInt(6, revista.getDataPublicacao());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}


package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.Livro;

/**
 *
 * @author hp
 */
public class LivroModel {
    
    Connection connect;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList <Livro> livros = new ArrayList <>();
    
    public void registarLivro (Livro livro) throws ClassNotFoundException {
        String sql = "insert into livro (isbn, titulo, editora, genero, numeroPagina, dataPublicacao) values (?, ?, ?, ?, ?, ?)";
        connect = new Conexao().conexaoBD();        
        
        try {
            pstm = connect.prepareStatement(sql);
            pstm.setInt(1, livro.getIsbn());
            pstm.setString(2, livro.getTitulo());
            pstm.setString(3, livro.getEditora());
            pstm.setString(4, livro.getGenero());
            pstm.setInt(5, livro.getNumeroPaginas());
            pstm.setInt(6, livro.getDataPublicacao());
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ArrayList <Livro> pesquisarLivro () {
        
        String sql = "select * from livro";
        
        try {
            pstm = connect.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Livro livro = new Livro (rs.getInt("isbn"), rs.getString("titulo"), rs.getString("editora"), rs.getString("genero"), rs.getInt("numeroPagina"), rs.getInt("dataPublicacao"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return livros;
    }
    
}

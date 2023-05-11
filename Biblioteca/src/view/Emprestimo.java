/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author hp
 */
public class Emprestimo {

    private String dataDevolucao;
    private int isbnLivro;
    private int issnRevista;
    private int idCD;
    public int idUser;

    public Emprestimo(String dataDevolucao, int isbnLivro, int idUser) {
        this.dataDevolucao = dataDevolucao;
        this.isbnLivro = isbnLivro;
        this.idUser = idUser;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(int isbnLivro) {
        this.isbnLivro = isbnLivro;
    }

    public int getIssnRevista() {
        return issnRevista;
    }

    public void setIssnRevista(int issnRevista) {
        this.issnRevista = issnRevista;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    
    
    
    
}

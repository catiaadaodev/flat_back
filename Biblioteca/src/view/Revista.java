
package view;

/**
 *
 * @author hp
 */
public class Revista {
    
     private int issn;
    private String titulo;
    private String editora;
    private int edicao;
    private int numeroPaginas;
    private int dataPublicacao;

    public Revista(int issn, String titulo, String editora, int edicao, int numeroPaginas, int dataPublicacao) {
        this.issn = issn;
        this.titulo = titulo;
        this.editora = editora;
        this.edicao = edicao;
        this.numeroPaginas = numeroPaginas;
        this.dataPublicacao = dataPublicacao;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int isnn) {
        this.issn = isnn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(String genero) {
        this.edicao = edicao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(int dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
}

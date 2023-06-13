import java.util.Date;

public class Livro extends Produto
{
    private String Autor;
    private Date DataPublicacao;
    private boolean Disponibilidade;
    private int Edicao;

    public Livro(String p_titulo, String p_autor, Date p_dataPublicacao, boolean p_disponibilidade, int p_edicao)
    {
        super(p_titulo);
        setAutor(p_autor);
        setDataPublicacao(p_dataPublicacao);
        setDisponibilidade(p_disponibilidade);
        setEdicao(p_edicao);
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String p_autor) {
        Autor = p_autor;
    }

    public Date getDataPublicacao() {
        return DataPublicacao;
    }

    public void setDataPublicacao(Date p_dataPublicacao) {
        DataPublicacao = p_dataPublicacao;
    }

    public boolean isDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(boolean p_disponibilidade) {
        Disponibilidade = p_disponibilidade;
    }

    public void setTitulo(String p_titulo, int p_edicao) {
        super.setTitulo(p_titulo);
        Edicao = p_edicao;
    }

    public int getEdicao()
    {
        return Edicao;
    }

    public void setEdicao(int p_edicao)
    {
        Edicao = p_edicao;
    }

    public void DetalhesDoLivro()
    {
        System.out.println("Titulo: " + getTitulo() + ", autor: " + getAutor() + ", data da publicação: " + getDataPublicacao() + ", disponibilidade: " + isDisponibilidade());
    }
}

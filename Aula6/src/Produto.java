public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String p_nome, double p_preco, int p_qtd)
    {
        setNome(p_nome);
        setPreco(p_preco);
        setQuantidade(p_qtd);
    }

    public String getNome()
    {
        return this.nome;
    }

    public double getPreco()
    {
        return this.preco;
    }

    public int getQuantidade()
    {
        return this.quantidade;
    }

    public void setNome(String p_nome)
    {
        this.nome = p_nome;
    }

    public void setPreco(double p_preco)
    {
        this.preco = p_preco;
    }

    public void setQuantidade(int p_qtd)
    {
        this.quantidade = p_qtd;
    }

}

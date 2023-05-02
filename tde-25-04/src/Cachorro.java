public class Cachorro {
    private String Nome;
    private String Raca;
    private int Idade = 0;

    public String getNome() {
        return Nome;
    }

    public String getRaca() {
        return Raca;
    }

    public int getIdade() {
        return Idade;
    }

    public Cachorro(String p_nome, String p_raca, int p_idade)
    {
        this.Nome = p_nome;
        this.Raca = p_raca;
        this.Idade = p_idade;
    }

    public Cachorro(String p_nome, String p_raca)
    {
        this.Nome = p_nome;
        this.Raca = p_raca;
    }

}

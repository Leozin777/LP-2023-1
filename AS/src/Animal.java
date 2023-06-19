public class Animal
{
    private String Nome;
    private int Idade;
    private double Peso;
    private String Especie;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public void Movimentar(String p_movimento)
    {
        System.out.println("O " + getNome() + " se movimentou da maneira: " + p_movimento);
    }

    public void Movimentar()
    {
        System.out.println("O " + getNome() + " se moveu da maneira padrão");
    }


}

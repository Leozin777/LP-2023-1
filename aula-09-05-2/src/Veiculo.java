abstract class Veiculo {

    public String marca;
    public String modelo;
    public int ano;

    public Veiculo(String p_marca, String p_modelo, int p_ano)
    {
        this.marca = p_marca;
        this.modelo = p_modelo;
        this.ano = p_ano;
    }

    public abstract void ligarMotor();
    public abstract  void desligarMotor();
}

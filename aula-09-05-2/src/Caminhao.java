public class Caminhao extends Veiculo{
    public Caminhao(String p_marca, String p_modelo, int p_ano)
    {
        super(p_marca, p_modelo, p_ano);
    }

    @Override
    public void ligarMotor() {
        System.out.println("vruuum");
    }

    @Override
    public void desligarMotor() {
        System.out.println("siiiuuuuu :(");
    }
}

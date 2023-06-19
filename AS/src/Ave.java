public class Ave extends Animal implements Treinavel
{
    private double EnvergaduraAsa;

    public double getEnvergaduraAsa() {
        return EnvergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        EnvergaduraAsa = envergaduraAsa;
    }

    @Override
    public void RealizarTruque()
    {
        System.out.println(getNome() + " Esta realizando um truque, dando um mortal");
    }

    public void Voar()
    {
        System.out.println(getNome() + " esta voando");
    }
}

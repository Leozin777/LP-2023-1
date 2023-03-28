public class CalculaCircunferencia {
    double raio;

    public CalculaCircunferencia(double p_raio)
    {
        raio = p_raio;
    }

    double calculaArea()
    {
        return Math.PI * (raio * raio);
    }
}

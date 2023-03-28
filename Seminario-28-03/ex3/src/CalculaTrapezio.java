public class CalculaTrapezio {
    double baseMaior;
    double baseMenor;
    double altura;

    public CalculaTrapezio(double p_baseMaior, double p_baseMenor, double p_altura)
    {
        baseMaior = p_baseMaior;
        baseMenor = p_baseMenor;
        altura = p_altura;
    }

    double calculaArea()
    {
        return ((baseMaior + baseMenor) / 2) * altura;
    }
}

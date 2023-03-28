public class CalculaTriangulo {
    double base;
    double altura;

    public CalculaTriangulo(double p_base, double p_altura)
    {
        base = p_base;
        altura = p_altura;
    }
    double calcularArea()
    {
        return (base * altura) / 2;
    }
}

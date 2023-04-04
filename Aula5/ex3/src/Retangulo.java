public class Retangulo {
    public double base;
    public double altura;

    public Retangulo(double p_base, double p_altura)
    {
        setBase(p_base);
        setAltura(p_altura);
    }

    public void setBase(double p_base)
    {
        this.base = p_base;
    }

    public void setAltura(double p_altura)
    {
        this.altura = p_altura;
    }

    public double calcularArea()
    {
        return base * altura;
    }

    public double calcularPerimetro()
    {
        return 2 * (base + altura);
    }
}

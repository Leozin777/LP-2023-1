public class Fracao{
    public double numerador;
    public double denominador;

    public Fracao(double p_numerador, double p_denominador)
    {
        numerador = p_numerador;
        denominador = p_denominador;
    }

    Fracao MultiplicaFracao(Fracao p_fracao1, Fracao p_fracao2)
    {
        Fracao fracao3 = new Fracao(1,1);
        fracao3.numerador = p_fracao1.numerador * p_fracao2.numerador;
        fracao3.denominador = p_fracao1.denominador * p_fracao2.denominador;
        return fracao3;
    }
}

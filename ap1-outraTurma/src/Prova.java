public class Prova
{
    public double notaParte1;
    public double notaParte2;

    public double calcularNotaTotal()
    {
        double notaFinal = notaParte1 + notaParte2;

        if(notaFinal > 10)
        {
            System.out.println("nota final é não pode ser maior que 10, o retorno vai ser igual a zero");
            return 0;
        }

        return notaFinal;
    }

}

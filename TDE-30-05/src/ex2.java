import java.util.concurrent.ExecutionException;

public class ex2
{
    double[] notas = new double[5];

    public ex2()
    {
        notas[0] = 8.5;
        notas[1] = 7.0;
        notas[2] = 9.0;
        notas[3] = 6.5;
        notas[4] = 10.0;

        media();
    }

    public double media()
    {
        double soma = 0;
        double media = 0;

        try {
            for (int i = 0; i <= 4; i++) {
                soma += notas[i];

                if (i == 4)
                    media = soma / i;
            }
            return media;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}

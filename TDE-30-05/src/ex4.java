public class ex4
{
    String[] cores = new String[5];

    public ex4()
    {
        cores[0] = "vermelho";
        cores[1] = "azul";
        cores[2] = "verde";
        cores[3] = "amarelo";
        cores[4] = "roxo";

        ImprimeNaOrdemInversa();
    }

    public void ImprimeNaOrdemInversa()
    {
        for(int i = 4; i >= 0; i--)
        {
            System.out.println(cores[i]);
        }
    }

}

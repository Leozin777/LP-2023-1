public class ex3
{
    int[] valores = new int[5];

    public ex3()
    {
        valores[0] = 23;
        valores[1] = 1;
        valores[2] = 34;
        valores[3] = 89;
        valores[4] = 2;

        percorreArray();
    }

    public int percorreArray()
    {
        int maiorNum = 0;
        for(int i = 0; i <= 4; i++)
        {
            if(valores[i] > maiorNum)
                maiorNum = valores[i];
        }

        return maiorNum;
    }


}

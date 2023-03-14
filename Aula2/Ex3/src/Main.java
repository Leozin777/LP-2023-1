public class Main {
    public static void main(String[] args)
    {
        int tamanhoFibonacci = 15;
        int[] Fibonacci = new int[tamanhoFibonacci];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;

        for(int i = 2; i < tamanhoFibonacci; i++)
        {
            Fibonacci[i] = Fibonacci[i - 2] + Fibonacci[i - 1];
        }

        for(int i = 0; i < tamanhoFibonacci; i++)
        {
            System.out.println(Fibonacci[i]);
        }
    }
}
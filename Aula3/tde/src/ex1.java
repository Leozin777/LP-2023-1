import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /*Faça um programa em Java que solicita um número
    inteiro positivo e calcule a soma dos números naturais
    até esse número. Utilize um loop while para realizar o
    cálculo.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = scanner.nextInt();
        int soma = 0;

        if(num >= 0)
        {
            while(num >= 0)
            {
                soma += num;
                num--;
            }
            System.out.println(soma);
            System.exit(0);
        }

        System.out.println("O número não esta dentro do conjunto de números reais ");
    }
}

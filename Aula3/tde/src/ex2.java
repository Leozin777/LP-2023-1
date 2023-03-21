import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que recebe um número
inteiro positivo e imprime se ele é um número primo ou
não. Utilize um loop for para testar se o número é primo.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = scanner.nextInt();

        if(num >= 0)
        {
            if(num % num == 0 && num % 1 == 0 )
                System.out.println("o número " + num + " é primo");
            else
                System.out.println("o número digitado não é primo");
        }else
        {
            System.out.println("O número digitado não é positivo");
        }
    }
}

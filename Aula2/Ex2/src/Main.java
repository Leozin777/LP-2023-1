import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int soma = 0;
        int exercicio = 0;
        int y = 0;
        int tabuadaValor = 0;
        int tabuadaResultado = 0;
        while (exercicio != 5)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha um exercicio de 1 a 4, caso queira encerrar o programa digite 5");
            exercicio = scanner.nextInt();

            switch (exercicio)
            {
                case 1:
                    for(int i = 10; i < 26; i++)
                    {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    soma = 0;
                    for(int i = 1; i < 101; i +=2)
                    {
                        soma += i;
                    }
                    System.out.println(soma);
                    break;
                case 3:
                    /*soma = 0;
                    for(int i = 1; soma < 101; i +=2)
                    {
                        soma += i;
                        if(soma < 100)
                        {
                            int valorExibido = soma;
                            System.out.println(valorExibido++);
                        }
                    }
                    System.out.println(soma);*/

                    soma = 0;
                    y = 0;

                    while(soma + y < 100)
                    {
                        System.out.println(y);
                        soma += y;
                        y++;
                    }
                    break;
                case 4:
                    tabuadaValor = 9;
                    tabuadaResultado = 0;
                    for(int i = 0; i <= 10; i++)
                    {
                        tabuadaResultado = i * tabuadaValor;
                        System.out.println(tabuadaValor + " X " + i + " = " + tabuadaResultado);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
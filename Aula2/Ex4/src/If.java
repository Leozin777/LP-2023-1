import java.util.Scanner;

public class If
{
    public static void main(String[] args)
    {
        //Usando if e else
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor de X ?");
        int x = scanner.nextInt();

        if(x % 2 == 0)
        {
            while(x <= 1000)
            {
                x += 5;
                System.out.println(x);
            }

        }else
        {
            while(x <= 1000)
            {
                x *= 2;
                System.out.println(x);
            }
        }

    }
}
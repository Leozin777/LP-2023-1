import java.util.Scanner;

public class Switch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor de X ?");
        int x = scanner.nextInt();

        int ePar = x % 2;

        switch (ePar)
        {
            case 0:
                while(x <= 1000)
                {
                    x += 5;
                    System.out.println(x);
                }
                break;
            default:
                while(x <= 1000)
                {
                    x *= 2;
                    System.out.println(x);
                }
        }
    }
}

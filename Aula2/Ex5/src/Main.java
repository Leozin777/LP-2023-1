public class Main {
    public static void main(String[] args)
    {
        int dia = 0;
        int mes = 0;
        int ano = 0;

        if(ano >= 0)
        {
            if(mes >= 1 && mes <= 12)
            {
                if(mes == 2)
                {
                    if(dia >= 1 && dia <= 28)
                        System.out.print("Data valida");
                    else
                        System.out.println("DIA INVÁLIDO - O mês de fevereiro vai do dai 1 até o dia 28");
                }
                else
                {
                    if(dia >= 1 && dia <= 31)
                        System.out.print("Data valida");
                    else
                        System.out.println("DIA INVÁLIDO - O dia " + dia + " não é valido");
                }
            }
            else
            {
                System.out.println("MÊS INVÁLIDO - o " + mes + " deve estar entre 1 e 12");
            }
        }
        else
        {
            System.out.println("ANO INVÁLIDO - o ano não pode ser negativo");
        }
    }
}
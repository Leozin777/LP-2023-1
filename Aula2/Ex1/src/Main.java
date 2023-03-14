/*Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente.
Escreva um programa que imprima a média do aluno.*/
public class Main{
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.5;
        double nota3 = 6.0;

        int peso1 = 3;
        int peso2 = 2;
        int peso3 = 5;

        //calculo da nota parcial
        double notaParcial1 = nota1 * peso1;
        double notaParcial2 = nota2 * peso2;
        double notaParcial3 = nota3 * peso3;

        //calculo da nota final
        double notasSomada = notaParcial1 + notaParcial2 + notaParcial3;
        double somaPeso = peso1 + peso2 + peso3;

        double resultado = notasSomada / somaPeso;

        System.out.println(resultado);
    }
}
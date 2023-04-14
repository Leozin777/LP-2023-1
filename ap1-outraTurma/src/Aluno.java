public class Aluno
{
    public Prova prova1;
    public Prova prova2;

    public double calcularMedia()
    {
        if(this.prova1 == null || this.prova2 == null)
        {
            System.out.println("alguma das provas esta nula");
            return 0;
        }else
        {
            double media = (this.prova1.calcularNotaTotal() + this.prova2.calcularNotaTotal()) / 2;
            System.out.println("a média é " + media);

            return media;
        }
    }
}

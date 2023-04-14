public class Turma
{
    public Aluno aluno1;
    public Aluno aluno2;
    public Aluno aluno3;

    public void calcularMedia()
    {
        if(this.aluno1 != null && this.aluno2 != null && this.aluno3 != null)
        {
            double media = (this.aluno1.calcularMedia() + this.aluno2.calcularMedia() + this.aluno3.calcularMedia()) / 3;
            System.out.println("Média dos 3 alunos = " + media);
        }else if(this.aluno1 != null && this.aluno2 != null)
        {
            double media = (this.aluno1.calcularMedia() + this.aluno2.calcularMedia()) / 2;
            System.out.println("media calculada utilizando a nota do aluno1 e do aluno2. Média = " + media);
        } else if (this.aluno1 != null && this.aluno3 != null)
        {
            double media = (this.aluno1.calcularMedia() + this.aluno3.calcularMedia()) /2;
            System.out.println("media calculada utilizando a nota do aluno1 e aluno3. Média = " + media);
        } else if (this.aluno2 != null && this.aluno3 != null)
        {
            double media = (this.aluno2.calcularMedia() + this.aluno3.calcularMedia()) / 2;
            System.out.println("media calculada utilizando a nota do aluno2 e aluno3. Media = " + media);
        }else
        {
            System.out.println("A média não pode ser calculada, pois nenhum aluno foi cadastrado");
        }
    }
}



import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "lucas";

        Date data = new Date();

        Livro livro1 = new Livro();
        livro1.titulo = "Harry Potter";
        livro1.numPaginas = 300;
        int resultado = livro1.emprestar(15);
        int resultado2 = livro1.emprestar(data);
        System.out.println(resultado);
        System.out.println(resultado2);

    }
}

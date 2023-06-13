import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dataIL = new Date("1970/01/28");
        Date dataIL2 = new Date("1990/03/20");
        Date dataHP1 = new Date("2001/02/15");

        Livro livro1  = new Livro("O Iluminado", "Stephen King", dataIL, true, 1);
        Livro livro2  = new Livro("O Iluminado 2", "Stephen King", dataIL2, true, 2);
        Livro livro3  = new Livro("HP 1", "JK", dataHP1, true, 4);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.AdicionarLivro(livro1);
        biblioteca.AdicionarLivro(livro2);
        biblioteca.AdicionarLivro(livro3);

        biblioteca.AtualizarLivro(livro3);

        biblioteca.VerificarDisponibilidade(livro2);

        biblioteca.RemoverLivro(livro2);

    }
}
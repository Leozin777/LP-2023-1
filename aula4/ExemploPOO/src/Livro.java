import java.util.Date;

public class Livro {
    int numPaginas;
    String titulo;
    String autor;

    int emprestar(int dias)
    {
        return dias - 2;
    }

    int emprestar(Date data)
    {
        return data.getDay();
    }

    void emprestar(Aluno a)
    {
        System.out.println("Emprestado ao " + a.nome);
    }

    String nomeLivro()
    {
        return titulo;
    }

}

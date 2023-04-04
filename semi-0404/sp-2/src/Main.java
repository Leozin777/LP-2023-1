public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "O Iluminado";
        livro.autor = "Stephen King";
        livro.editora = "Saraiva";
        livro.numPag = 250;

        livro.exibirDetalhes();
    }
}
public class Livro {
    public String titulo;
    public String autor;
    public String editora;
    public int numPag;

    public void exibirDetalhes()
    {
        System.out.println("o titulo do livro é " + titulo);
        System.out.println("o nome do autor é " + autor);
        System.out.println("a editora é " + editora);
        System.out.println("o numero de paginas é " + numPag);
    }
}

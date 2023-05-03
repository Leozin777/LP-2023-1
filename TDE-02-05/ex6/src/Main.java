public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        Estudante estudante1 = new Estudante();

        pessoa.andar();
        pessoa.falar();

        estudante1.estudar();
        estudante1.andar();
        estudante1.falar();
    }
}
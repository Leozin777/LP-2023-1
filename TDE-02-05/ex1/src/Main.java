public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "leo";
        pessoa1.idade = 21;

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "jose";
        funcionario1.idade = 22;
        funcionario1.cargo = "desenvolvedor back-end";

        System.out.println(funcionario1.nome + " " + funcionario1.idade + " " + funcionario1.cargo);
        System.out.println(pessoa1.nome + " " + pessoa1.idade);
    }
}
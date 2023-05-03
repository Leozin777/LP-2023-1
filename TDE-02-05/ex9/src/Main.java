public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "claudio";
        pessoa.endereco = "centro, 546";

        Cliente cliente1 = new Cliente();
        cliente1.nome = "joao";
        cliente1.endereco = "centro 635";
        cliente1.numeroCartao = 312412;

        System.out.println(pessoa.nome + " " + pessoa.endereco);
        System.out.println(cliente1.nome + " " + cliente1.endereco + " " + cliente1.numeroCartao);
    }
}
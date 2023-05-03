import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produto detergente = new Produto();
        detergente.preco = 5.00;
        detergente.codigo = 314213;

        ProdutoPerecivel frango = new ProdutoPerecivel();
        frango.codigo = 1231231;
        frango.preco = 13.00;
        frango.dataValidade = new Date(2023-05-10);

        System.out.println("Detergente: preco = R$" + detergente.preco + ", codigo = " + detergente.preco);
        System.out.println("Frango: preco = R$" + frango.preco + ", codigo = " + frango.codigo + ", data de validade " + frango.dataValidade);
    }
}
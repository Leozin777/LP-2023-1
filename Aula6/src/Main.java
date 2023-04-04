public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto caderno = new Produto("caderno", 10.00, 100);
        Produto mochila = new Produto("mochila", 125.00, 150);
        Produto bala = new Produto("bala", 1.00, 500);

        loja.adicionaProduto(caderno);
        loja.adicionaProduto(mochila);
        loja.adicionaProduto(bala);

        loja.listarProduto();

        loja.removerProduto(mochila);

        loja.listarProduto();

        loja.venderProduto(caderno, 80);
        loja.listarProduto();

        loja.adicionarEstoque(caderno, 50);
        loja.listarProduto();
    }
}
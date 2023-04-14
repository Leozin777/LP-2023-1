public class Loja {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    public void adicionaProduto(Produto p_produto)
    {
         if(this.produto1 == null)
             this.produto1 = p_produto;
         else if (this.produto2 == null)
             this.produto2 = p_produto;
         else if (this.produto3 == null)
             this.produto3 = p_produto;
         else
             System.out.println("todos os produtos estão cheios");
    }

    public void removerProduto(Produto p_produto)
    {
        if(this.produto1 == p_produto)
        {
            System.out.println(this.produto1.getNome() + " foi deletado");
            this.produto1 = null;
        }
        else if(this.produto2 == p_produto)
        {
            System.out.println(this.produto2.getNome() + " foi deletado");
            this.produto2 = null;
        }
        else if(this.produto3 == p_produto)
        {
            System.out.println(this.produto3.getNome() + " foi deletado");
            this.produto3 = null;

        }
    }

    public void listarProduto()
    {
        if (this.produto1 != null)
            imprimirProduto(this.produto1);
        if(this.produto2 != null)
            imprimirProduto(this.produto2);
        if(this.produto3 != null)
            imprimirProduto(this.produto3);
    }

    private void imprimirProduto(Produto p_produto)
    {
        System.out.println("O " + p_produto.getNome() + " custa " + p_produto.getPreco() + " e possui " + p_produto.getQuantidade() + " no estoque");
        System.out.println("========================================================================================================================");
    }

    public void venderProduto(Produto p_produto, int p_qtd)
    {
        if(p_produto != this.produto1 && p_produto != this.produto2 && p_produto != this.produto3)
        {
            System.out.println("este produto não esta cadastrado no sistema");
        }
        else if(p_produto.getQuantidade() >= p_qtd)
        {
            var qtd = p_produto.getQuantidade() - p_qtd;
            p_produto.setQuantidade(qtd);
            System.out.println(p_produto.getNome() + " teve " + p_qtd + " unidades vendidas/vendidos e agora tem apenas mais " + p_produto.getQuantidade() + " em estoque");
        }
        else
            System.out.println("voce não pode vender mais do que tem no estoque");
    }

    public void adicionarEstoque(Produto p_produto, int p_qtd)
    {
        if(p_produto != this.produto1 && p_produto != this.produto2 && p_produto != this.produto3)
        {
            System.out.println("este produto não esta cadastrado no sistema");
            System.exit(0);
        }

        var qtd = p_produto.getQuantidade() + p_qtd;
        p_produto.setQuantidade(p_qtd);
        System.out.println("adicionado " + p_qtd + " em estoque para o produto " + p_produto.getNome() + " agora ele possui " + p_produto.getQuantidade());
    }
}

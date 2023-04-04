public class Loja {
    public Produto produto1;
    public Produto produto2;
    public Produto produto3;

    public void adicionaProduto(Produto p_produto)
    {
         if(produto1 == null)
             produto1 = p_produto;
         else if (produto2 == null)
             produto2 = p_produto;
         else if (produto3 == null)
             produto3 = p_produto;
         else
             System.out.println("todos os produtos estão cheios");
    }

    public void removerProduto(Produto p_produto)
    {
        if(produto1 == p_produto)
        {
            System.out.println(produto1.getNome() + " foi deletado");
            produto1 = null;
        }
        else if(produto2 == p_produto)
        {
            System.out.println(produto2.getNome() + " foi deletado");
            produto2 = null;
        }
        else if(produto3 == p_produto)
        {
            System.out.println(produto3.getNome() + " foi deletado");
            produto3 = null;

        }
    }

    public void listarProduto()
    {
        if (produto1 != null)
            System.out.println("O " + produto1.getNome() + " custa " + produto1.getPreco() + " e possui " + produto1.getQuantidade() + " no estoque");
        if(produto2 != null)
            System.out.println("O " + produto2.getNome() + " custa " + produto2.getPreco() + " e possui " + produto2.getQuantidade() + " no estoque");
        if(produto3 != null)
            System.out.println("O " + produto3.getNome() + " custa " + produto3.getPreco() + " e possui " + produto3.getQuantidade() + " no estoque");

    }

    public void venderProduto(Produto p_produto, int p_qtd)
    {
        if(p_produto != produto1 && p_produto != produto2 && p_produto != produto3)
        {
            System.out.println("este produto não esta cadastrado no sistema");
            System.exit(0);
        }

        if(p_produto.quantidade >= p_qtd)
        {
            var qtd = p_produto.quantidade - p_qtd;
            p_produto.setQuantidade(qtd);
            System.out.println(p_produto.getNome() + " teve " + p_qtd + " unidades vendidas/vendidos e agora tem apenas mais " + p_produto.getQuantidade() + " em estoque");
        }
    }

    public void adicionarEstoque(Produto p_produto, int p_qtd)
    {
        if(p_produto != produto1 && p_produto != produto2 && p_produto != produto3)
        {
            System.out.println("este produto não esta cadastrado no sistema");
            System.exit(0);
        }

        var qtd = p_produto.quantidade + p_qtd;
        p_produto.setQuantidade(p_qtd);
        System.out.println("adicionado " + p_qtd + " em estoque para o produto " + p_produto.getNome() + " agora ele possui " + p_produto.getQuantidade());
    }
}

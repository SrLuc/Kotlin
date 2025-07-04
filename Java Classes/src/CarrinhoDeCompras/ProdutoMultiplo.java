package CarrinhoDeCompras;

public class ProdutoMultiplo implements Produto {

    Produto produto;
    int quantidade;
    float preco;

    public ProdutoMultiplo(Produto produto, int quantidade, float preco) {
        super();
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public float getDesconto() {
        return (produto.getPreco() * quantidade) - preco;

    }




}

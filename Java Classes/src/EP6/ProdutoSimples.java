package EP6;

public class ProdutoSimples implements Produto {

    private int codigoBarras;
    private String descricao;
    private float preco;

    public ProdutoSimples(int codigoBarras, String descricao, float preco) {
        super();
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public float getDesconto() {
        return 0;
    }
}

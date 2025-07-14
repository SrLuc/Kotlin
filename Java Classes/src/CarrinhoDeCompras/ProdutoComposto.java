package CarrinhoDeCompras;

import java.util.Iterator;
import java.util.List;

public class ProdutoComposto implements Produto{

    private int codigoBarras;
    private String descricao;
    private float preco;
    private List<Produto> produtos;


    public ProdutoComposto(int codigoBarras, String descricao, float preco, List<Produto> produtos) {
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.preco = preco;
        this.produtos = produtos;
    }


    public float getPreco() {
        return preco;
    }

    public float getDesconto() {
        float soma = 0;

        for (Iterator i = produtos.iterator(); i.hasNext();) {
            Produto produto = (Produto) i.next();
            soma += produto.getPreco();

        }

        return soma - preco;
    }


}

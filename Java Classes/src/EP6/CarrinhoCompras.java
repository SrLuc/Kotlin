package EP6;

import java.util.Iterator;
import java.util.List;

public class CarrinhoCompras  {

    List<Produto> produtos;

    public CarrinhoCompras(List<Produto> produtos) {
        super();
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public float getDescontoTotal() {
        float soma = 0;

        for (Iterator i = produtos.iterator(); i.hasNext();) {
            Produto produto = (Produto) i.next();
            soma += produto.getDesconto	();

        }

        return soma;
    }

}


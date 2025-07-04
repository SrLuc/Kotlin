package EP6;
import java.util.ArrayList;
import java.util.List;

public class TesteMercado {
    public static void main(String[] agrs) {

        ProdutoSimples ps1 = new ProdutoSimples(1234, "Fejao Preto", 7);
        ProdutoSimples ps2 = new ProdutoSimples(2434, "Arroz Branco", 4);
        ProdutoSimples ps3 = new ProdutoSimples(6453, "Brocolis", 10);
        ProdutoSimples ps4 = new ProdutoSimples(1124, "Sabão em Pó", 4);
        ProdutoSimples ps5 = new ProdutoSimples(8564, "Água", 5);
        ProdutoSimples ps6 = new ProdutoSimples(5634, "Carne de Boi", 40);
        ProdutoSimples ps7 = new ProdutoSimples(9545, "Detergente", 6);
        ProdutoSimples ps8 = new ProdutoSimples(2542, "Vassoura", 14);

        List<Produto> cestaProdutos = new ArrayList<>();
        cestaProdutos.add(ps1);
        cestaProdutos.add(ps2);
        cestaProdutos.add(ps3);
        cestaProdutos.add(ps4);
        cestaProdutos.add(ps5);
        cestaProdutos.add(ps6);
        cestaProdutos.add(ps7);
        cestaProdutos.add(ps8);

        ProdutoComposto pc1 = new ProdutoComposto(1111, "Cesta Básica Simples", 80, cestaProdutos);

        ProdutoMultiplo pm1 = new ProdutoMultiplo(ps1, 10, 60);
        ProdutoMultiplo pm2 = new ProdutoMultiplo(ps2, 12, 30);
        ProdutoMultiplo pm5 = new ProdutoMultiplo(ps5, 10, 10);
        ProdutoMultiplo pm4 = new ProdutoMultiplo(ps4, 20, 20);

        List<Produto> listaCarrinho = new ArrayList<>();
        listaCarrinho.add(ps1);
        listaCarrinho.add(ps2);
        listaCarrinho.add(pc1);
        listaCarrinho.add(pm1);
        listaCarrinho.add(pm2);
        listaCarrinho.add(pm4);
        listaCarrinho.add(pm5);


        CarrinhoCompras carrinho = new CarrinhoCompras(listaCarrinho);

        System.out.println("Desconto Feijão: " + ps1.getDesconto());
        System.out.println("Desconto Arroz: " + ps2.getDesconto());
        System.out.println("Desconto Cesta Básica: " + pc1.getDesconto());
        System.out.println("Desconto Pacote Feijão x4: " + pm1.getDesconto());
        System.out.println("Desconto Total do Carrinho: " + carrinho.getDescontoTotal());


    }
}
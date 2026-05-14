package classesobjetos.carrinhocompras;

public class MercadoTeste {
    public static void main(String[] args) {

        System.out.println("\nBem vindo ao mercado!\n");

        Produto produto1 = new Produto("Arroz", 21.00, 5);
        Produto produto2 = new Produto("Feijão", 25.00, 5);
        Produto produto3 = new Produto("Farofa", 9.00, 5);
        Produto produto4 = new Produto("Macarrão", 21.00, 5);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionar(produto1);
        carrinho.adicionar(produto2);
        carrinho.adicionar(produto3);
        carrinho.adicionar(produto4);

        carrinho.remover("Arroz");

        carrinho.exibirProdutos();

        carrinho.calcular();
    }
}
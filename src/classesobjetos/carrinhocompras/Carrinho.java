package classesobjetos.carrinhocompras;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public void remover(String nome) {
        Produto encontrado = null;
        for (Produto p : produtos) {
            if(p.getName().equals(nome)) {
                encontrado = p;
            }
        }
        produtos.remove(encontrado);
    }

    public double calcular() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPrice() * p.getQuantity();
        }
        System.out.printf("\nValor total - R$ %.2f\n", total);
        return total;
    }

    public void exibirProdutos() {
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getName() + " - Valor: " + p.getPrice() + " - Quantidade: " + p.getQuantity());
        }
    }
 }

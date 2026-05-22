package classesobjetos.cinema;

import java.util.ArrayList;

public class Sessao {
    private ArrayList<Filme> filmes = new ArrayList<>();

    private int capacidade;
    private int ingressosVendidos;

    public Sessao(int capacidade, int ingressosVendidos) {
        this.capacidade = capacidade;
        this.ingressosVendidos = 0;
    }

    public void venderIngresso(int idade) {

    }
}

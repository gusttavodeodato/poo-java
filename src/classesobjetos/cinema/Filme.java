package classesobjetos.cinema;

public class Filme {
    private String titulo;
    private int duracao;
    private int classificacao;

    public Filme(String titulo, int duracao, int classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }
}

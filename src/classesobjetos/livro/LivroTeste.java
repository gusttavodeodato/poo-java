package classesobjetos.livro;

public class LivroTeste {
    public static void main(String[] args) {

        Livro meuLivro = new Livro("Senhor dos Anéis", "Tolkien", 500);
        Livro seuLivro = new Livro("Frankenstein", "Mary Shelley", 350);

        meuLivro.exibirInfo();
        seuLivro.exibirInfo();
    }
}

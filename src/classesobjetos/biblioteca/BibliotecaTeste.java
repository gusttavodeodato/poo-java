package classesobjetos.biblioteca;

public class BibliotecaTeste {
    public static void main(String[] args) {

        System.out.println("\n ------ Biblioteca ETEC ------\n");

        Livro livro1 = new Livro("O Senhor dos Anéis", "Tolkien", true);
        Livro livro2 = new Livro("Silmarillion", "Tolkien", true);
        Livro livro3 = new Livro("Frankstein", "Mary Shelley", true);
        Livro livro4 = new Livro("Contos Inacabados", "Tolkien", true);
        Livro livro5 = new Livro("Alice no País das Maravilhas", "Lewis Carroll", true);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        System.out.println("\n ------ Livros Emprestados ------\n");
        biblioteca.emprestarLivro("O Senhor dos Anéis");
        biblioteca.emprestarLivro("Silmarillion");


        System.out.println("\n ------ Livros Devolvidos ------\n");
        biblioteca.devolverLivro("Silmarillion");

        System.out.println("\n ------ Livros Disponíveis na nossa Biblioteca ------\n");
        biblioteca.exibirLivrosDisponiveis();
    }
}

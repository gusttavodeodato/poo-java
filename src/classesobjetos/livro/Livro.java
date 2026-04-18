package classesobjetos.livro;

public class Livro {
    private String title;
    private String author;
    private int numberOfPages;

    public Livro(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void exibirInfo() {
        System.out.println("Obra: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Número de páginas: " + numberOfPages + ".\n");
    }
}

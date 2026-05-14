package classesobjetos.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro l) {
        System.out.println("Livro adicionado:  " + l.getTitulo() + " - " + l.getAutor());
        livros.add(l);
    }

    public void emprestarLivro(String titulo) {
        Livro encontrado = null;
        for (Livro l : livros) {
            if (l.getTitulo().equals(titulo)) {
                encontrado = l;
            }
        }

        if (encontrado == null) {
            System.out.println("\nLivro não encontrado");
        } else if (!encontrado.isDisponivel()) {
            System.out.println("Livro indisponível para empréstimo");
        } else {
            encontrado.setDisponivel(false);
            System.out.println("Livro emprestado com sucesso! - " +  titulo);
        }
    }

    public void devolverLivro(String titulo) {
        Livro encontrado = null;
        for (Livro l : livros) {
            if(l.getTitulo().equals(titulo)) {
                encontrado = l;
            }
        }

        if (encontrado != null && !encontrado.isDisponivel()) {
            encontrado.setDisponivel(true);
            System.out.println("Livro devolvido com sucesso! - " + titulo);
        }
    }

    public void exibirLivrosDisponiveis() {
        for (Livro l : livros) {
            if(l.isDisponivel()) {
                System.out.println("Livros disponíveis: " + l.getTitulo() + " - " + l.getAutor());
            }
        }
    }
}

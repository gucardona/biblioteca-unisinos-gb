public class Livro {
    private final String titulo, autor, isbn;
    private boolean disponivel;

    public Livro(final String titulo, final String autor, final String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro \"" + this.titulo + "\" emprestado com sucesso!");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" não está disponível para empréstimo.");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro \"" + this.titulo + "\" devolvido com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.printf("Livro: %s, Autor: %s (ISBN: %s)%n", this.titulo, this.autor, this.isbn);
    }
}

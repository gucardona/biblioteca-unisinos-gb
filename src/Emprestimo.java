import usuarios.Usuario;

import java.time.LocalDate;

public class Emprestimo {
    private final Usuario usuario;
    private final Livro livro;
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(final Livro livro, final Usuario usuario) {
        if (!livro.isDisponivel()) {
            throw new IllegalStateException("Livro indisponível para empréstimo.");
        }

        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null;

        this.livro.emprestar();
    }

    public void devolver() {
        if (!livro.isDisponivel()) {
            livro.devolver();
            this.dataDevolucao = LocalDate.now();
        } else {
            System.out.println("Este livro já está marcado como disponível.");
        }
    }

    public void exibirResumoEmprestimo() {
        System.out.println("Resumo do Empréstimo:");
       this.livro.exibirInformacoes();
        System.out.printf("Usuário (id: %s): %s (%s)%n", this.usuario.getId(), this.usuario.getNome(), this.usuario.exibirTipoUsuario());
        System.out.println("Data do Empréstimo: " + this.dataEmprestimo);
        if (dataDevolucao != null) {
            System.out.println("Data da Devolução: " + this.dataDevolucao);
        }
    }
}

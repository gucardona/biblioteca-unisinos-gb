import usuarios.Aluno;
import usuarios.Professor;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Introdução à POO", "Ana Paula", "12345");
        Aluno aluno = new Aluno("João Silva", "Ciência da Computação");
        Professor professor = new Professor("Maria Souza", "Matemática");

        Emprestimo emprestimo1 = new Emprestimo(livro1, aluno);
        System.out.println();
        emprestimo1.exibirResumoEmprestimo();
        System.out.println();

        emprestimo1.devolver();
        System.out.println();
        emprestimo1.exibirResumoEmprestimo();
        System.out.println();

        Emprestimo emprestimo2 = new Emprestimo(livro1, professor);
        System.out.println();
        emprestimo2.exibirResumoEmprestimo();
    }
}
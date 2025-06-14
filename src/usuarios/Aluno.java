package usuarios;

public class Aluno extends Usuario {
    private final String curso;

    public Aluno(final String nome, final String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public String exibirTipoUsuario() {
        return "Aluno do curso de " + this.curso;
    }
}

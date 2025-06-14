package usuarios;

public class Professor extends Usuario {
    private final String departamento;

    public Professor(final String nome, final String departamento) {
        super(nome);
        this.departamento = departamento;
    }

    @Override
    public String exibirTipoUsuario() {
        return "Professor do departamento de " + departamento;
    }
}

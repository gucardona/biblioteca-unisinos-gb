package usuarios;

public abstract class Usuario {
    private static long contador = 1L;

    private final String nome;
    private final long id;

    public Usuario(final String nome) {
        this.nome = nome;
        this.id = contador++;
    }

    public String getNome() {
        return this.nome;
    }

    public long getId() {
        return this.id;
    }

    public abstract String exibirTipoUsuario();
}

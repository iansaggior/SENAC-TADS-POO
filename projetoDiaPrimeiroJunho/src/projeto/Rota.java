package projeto;

public class Rota implements Aeroporto {

    private long id;
    private String nome;
    private String descrsao;

    public Rota(long id, String nome, String descrsao) {
        this.id = id;
        this.nome = nome;
        this.descrsao = descrsao;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getCodigo() {
        return null;
    }
}

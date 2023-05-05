package progsetget;

public class Pessoa {

    protected int id;
    private String nome;
    private String pai;
    private String mae;
    private boolean ativo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPai() {
        return pai;
    }
    public void setPai(String pai) {
        this.pai = pai;
    }
    public String getMae() {
        return mae;
    }
    public void setMae(String mae) {
        this.mae = mae;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
}

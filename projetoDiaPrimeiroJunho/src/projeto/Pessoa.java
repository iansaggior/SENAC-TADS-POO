package projeto;

import java.util.Date;

public abstract class Pessoa implements Endereco {
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String usuario;
    private String senha;
    private Date dataNascimento;

    public Pessoa(long id, String nome, String email, String telefone, String usuario, String senha,
            Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public long getId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getRua() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getNumero() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getComplemento() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getBairro() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getCidade() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getEstado() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPais() {
        // TODO Auto-generated method stub
        return null;
    }
}

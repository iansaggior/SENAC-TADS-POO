package projeto;

import java.util.Date;

public class Passageiro extends Pessoa {
    public Passageiro(long id, String nome, String email, String telefone, String usuario, String senha,
            Date dataNascimento) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento);
    }

    private String documento;
    private String numeroCartao;

}

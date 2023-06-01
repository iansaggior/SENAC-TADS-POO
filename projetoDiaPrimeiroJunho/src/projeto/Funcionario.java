package projeto;

import java.util.Date;

public class Funcionario extends Pessoa {
    private String codigo;
    private String contaConrrente;

    public Funcionario(long id, String nome, String email, String telefone, String usuario, String senha,
            Date dataNascimento, String codigo, String contaConrrente) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento);
        this.codigo = codigo;
        this.contaConrrente = contaConrrente;
    }

}

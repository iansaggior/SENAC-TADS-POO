package projeto;

import java.sql.Date;

public class Horario implements Aviao {

    private long id;
    private String codigo;
    private Date partida;
    private Date chegada;
    private int qtdeEconomica;
    private int qtdePrimeira;
    private int qtdeExecutiva;

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getCodigo() {
        return null;
    }

    @Override
    public double getCarga() {
        return 0;
    }

    @Override
    public int getQtdeEconomica() {
        return 0;
    }

    @Override
    public int getQtdePrimeira() {
        return 0;
    }

    @Override
    public int getQtdeExecutiva() {
        return 0;
    }

    public Horario(long id, String codigo, Date partida, Date chegada, int qtdeEconomica, int qtdePrimeira,
            int qtdeExecutiva) {
        this.id = id;
        this.codigo = codigo;
        this.partida = partida;
        this.chegada = chegada;
        this.qtdeEconomica = qtdeEconomica;
        this.qtdePrimeira = qtdePrimeira;
        this.qtdeExecutiva = qtdeExecutiva;
    }

    

}



public enum TipoBilheteEnum {
    
    Economica(1, "Economica"),
    Executiva(2, "Executiva"),
    Primeira(3, "Primeira");
    
    private int id;
    private String nome;


    TipoBilheteEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}

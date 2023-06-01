
public enum SituacaoBilheteNum {
    disponivel(1, "disponivel"),
    reservado(2, "reservado"),
    vendido(3, "vendido");
    
    private long id;
    private String nome;

    private SituacaoBilheteNum(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
}

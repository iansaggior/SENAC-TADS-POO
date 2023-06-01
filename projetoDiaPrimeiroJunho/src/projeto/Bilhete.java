package projeto;

public abstract class Bilhete {

    private long id;
    private int numero;
    private String assento;

    public void reservar(Passageiro passageiro) {
    }

    public void comprar() {

    }

    public void cancelarReserva() {

    }

    public void checkIn(Bagagem bagagem) {

    }

    protected int maximoBagagem() {
        return 0;
    }

    public Bilhete(long id, int numero, String assento) {
        this.id = id;
        this.numero = numero;
        this.assento = assento;
    }

    enum TipoBilheteEnum {

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

    enum SituacaoBilheteNum {

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

}

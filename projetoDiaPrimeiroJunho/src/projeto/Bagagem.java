package projeto;

public class Bagagem {
    private long id;
    private double peso;

    public Bagagem(long id, double peso) {
        this.id = id;
        this.peso = peso;
    }

    enum TipoBagagemEnum {
        mao(1, "mão", 5.0),
        nacional(2, "nacional", 23.0),
        internacional(3, "internacional", 32.0);

        private long id;
        private String nome;
        private double pesoMax;

        private TipoBagagemEnum(long id, String nome, double pesoMax) {
            this.id = id;
            this.nome = nome;
            this.pesoMax = pesoMax;
        }
    }
}

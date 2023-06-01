package projeto;

public class Executiva extends Bilhete {
    public Executiva(long id, int numero, String assento) {
        super(id, numero, assento);
    }

    @Override
    public void reservar(Passageiro passageiro) {
        super.reservar(passageiro);
    }

    @Override
    public void comprar() {
        super.comprar();
    }

    @Override
    public void cancelarReserva() {
        super.cancelarReserva();
    }

    @Override
    public void checkIn(Bagagem bagagem) {
        super.checkIn(bagagem);
    }

    @Override
    protected int maximoBagagem() {
        return super.maximoBagagem();
    }
}

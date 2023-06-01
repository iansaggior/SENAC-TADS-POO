package projeto;

public class Economica extends Bilhete {

    public Economica(long id, int numero, String assento) {
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

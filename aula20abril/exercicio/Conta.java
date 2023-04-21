
public class Conta {
    int numero, numeroDoCliente, codigoGerente;
    double saldo, limite;
    String dataDeAbertura;

    public void saqueConta(double saldo2) {
        saldo -= saldo2;
    }

    public void depositoConta(double saldo2) {
        saldo += saldo2;
    }    

    public Conta() { // Construtor da classe Conta
        numero = 23;
        numeroDoCliente = 56;
        saldo = 3500.34;
        dataDeAbertura = "10-05-2012";
        codigoGerente = 12;
        limite = 500;
    }

    public Conta(double saldo, double limite, String dataDeAbertura) {
        this.saldo = saldo;
        this.limite = limite;
        this.dataDeAbertura = dataDeAbertura;
    }
} 

public class testaConta {
    public static void main(String[] args) {
        Conta contax; // contax é definido como o nome do objeto
        contax = new Conta(); // aqui ocorre a instância do objeto
        contax.numero = 171955;
        contax.numeroDoCliente = 1347;
        contax.saldo = 1000;
        contax.dataDeAbertura = "12/05/2012";
        contax.codigoGerente = 771;
        contax.limite = 1000.00;
        // as linhas abaixo mudam o estado do objeto através de métodos
        contax.depositoConta(2000);
        contax.saqueConta(500);
        System.out.println(" O saldo atual é: " + (contax.saldo + contax.limite));
        

    }
}

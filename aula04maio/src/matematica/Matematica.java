package matematica;

public class Matematica {
    public static void main(String[] args) {

        System.out.print("Soma \t\t- \t");
        Matematica.mostrarCalculo(new Soma(), 5, 5);
        System.out.print("Subtração \t- \t");
        Matematica.mostrarCalculo(new Subtracao(), 5, 2);
        System.out.print("Multiplicação \t- \t");
        Matematica.mostrarCalculo(new Multiplicacao(), 4, 3);
        System.out.print("Divisão \t- \t");
        Matematica.mostrarCalculo(new Divisao(), 15, 4);
        System.out.print("Potência \t- \t");
        Matematica.mostrarCalculo(new Potencia(), 4, 4);
    }

    private static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        System.out.printf("O resultado é: %.2f\n", operacao.calcular(x, y));
    }
}

package exmultiplgenerics;

public class ExMultiplGenerics {

    public static void main(String[] args) {

        MinhaClasse<Integer> inteiro = new MinhaClasse<>(5);
        MinhaClasse<Double> doubleTipo = new MinhaClasse<>(5.0);
        
        System.out.println(inteiro.aoQuadrado() + " | " + doubleTipo.aoQuadrado());

    }   
}

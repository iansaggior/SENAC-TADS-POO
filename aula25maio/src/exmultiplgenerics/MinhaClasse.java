package exmultiplgenerics;

public class MinhaClasse<T extends Number> { // T agora dá um extends na classe Number

    T numClasse;

    public MinhaClasse(T numClasse) {
        this.numClasse = numClasse;
    }

    Double aoQuadrado() {
        return numClasse.intValue() * numClasse.doubleValue();
    }
}

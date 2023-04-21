package matematica;

 public class Divisao extends OperacaoMatematica {
    public double calcular(double x, double y) {
        if(y == 0) {
             return 0;
         }
         return x / y;
     }
}
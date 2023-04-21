package matematica;

import javax.swing.JOptionPane;
 
public class Matematica {
    public static void main(String[] args) {

        OperacaoMatematica[] operacoes = new OperacaoMatematica[4];

        operacoes[0] = new Soma();
        operacoes[1] = new Subtracao();
        operacoes[2] = new Divisao();
        operacoes[3] = new Multiplicacao();

        String[] options = {"Soma", "Subtração", "Divisão", "Multiplicação"};

        int op = JOptionPane.showOptionDialog(
            null, "Escolha a operação desejada","Matematica", 
            0, 1, null, options, options[0]);

        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));

        Matematica.mostrarCalculo(operacoes[op], x, y);
    }


    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        JOptionPane.showMessageDialog(null, "O resultado é " + operacao.calcular(x, y));
    }

 }
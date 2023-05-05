package arcondicionado;

import javax.swing.JOptionPane;

public class controleRemoto {
    public static void main(String[] args) {
        String[] opcoes = {
                "SIM",
                "NÃO"
        };
        int opcaoOnOff = JOptionPane.showOptionDialog(
                null, "O Ar Condicionado está ligado?", "Ar Condicionado", 0, 0, null, opcoes, opcoes[0]);
        boolean opt = false;
        if (opcaoOnOff == 0) {
            opt = true;
        } else {
            opt = false;
        }
        ;
        powerButton(opt);

        if (powerButton(opt) == false) {
            JOptionPane.showMessageDialog(null, "O Ar Condicionado está Desligado");
        } else {
            int bla = 0;
            intencidadeAr(bla);
        }
    }

    public static boolean powerButton(Boolean opcao) {
        arCondicionado OnOff = new arCondicionado();
        if (OnOff.isPower() == opcao) {
            System.out.println("Ligado");
        } else {
            System.out.println("Desligado");
        }
        return opcao;
    }

    public static int intencidadeAr(int intencidade) {
        String[] niveis = {
                "FRACO",
                "MÉDIO",
                "FORTE"
        };
        int opcaoNivel = JOptionPane.showOptionDialog(
                null, "Qual nível de intencidade do Ar Condicionado que você deseja?",
                "Níveis de intencidade do Ar Condicionado", 0, 0, null, niveis, niveis[0]);
        intencidade = opcaoNivel;
        return intencidade;
    }

    

}

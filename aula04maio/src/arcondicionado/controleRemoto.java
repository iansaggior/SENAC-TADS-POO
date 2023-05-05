package arcondicionado;

import javax.swing.JOptionPane;

public class controleRemoto {
    static arCondicionado arcond = new arCondicionado();
    public static void main(String[] args) {
        String[] opcoes = {
                "SIM",
                "NÃO"
        };
        int opcaoOnOff = JOptionPane.showOptionDialog(
            null, "Deseja ligar o Ar Condicionado?", "Ar Condicionado",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
                boolean opt = false;
        if (opcaoOnOff == 0) {
            opt = true;
        } else {
            opt = false;
        }
        powerButton(opt);

        if (opt == false) {
            JOptionPane.showMessageDialog(null, "O Ar Condicionado está Desligado");
        } else {
            temperatura();
            System.out.print("Intencidade do ar escolhida: ");
            intencidadeAr();
            
            if (!oscilacao()) {
                System.out.println("Opção de oscilação desligada!");
            } else {
                System.out.println("Opção de oscilação ligada!");
            }
        }

    }

    public static boolean powerButton(Boolean opcao) {
        if (arcond.isPower() == opcao) {
            System.out.println("Desligado");
        } else {
            System.out.println("Ligado");
        }
        return opcao;
    }

    public static int intencidadeAr() {
        String[] niveis = {
                "FRACO",
                "MÉDIO",
                "FORTE"
        };
        int opcaoNivel = JOptionPane.showOptionDialog(
                null, "Qual nível de intencidade do Ar Condicionado que você deseja?",
                "Níveis de intencidade do Ar Condicionado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, niveis, niveis[0]);
        if (opcaoNivel == 0) {
            System.out.println("FRACO");
        } else if (opcaoNivel == 1) {
            System.out.println("MÉDIO");
        } else {
            System.out.println("FORTE");
        }
        arcond.setIntensidadeDoVento(opcaoNivel);
        return arcond.getIntensidadeDoVento();
    }

    public static int temperatura() {
        int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Qual é a temperatura desejada"));
        if (temperatura < 0 || temperatura > 40) {
        JOptionPane.showMessageDialog(null, "Temperatura indisponível! Tente Novamente", null, JOptionPane.WARNING_MESSAGE);
        temperatura();
        } else {
            System.out.println("Temperatura escolhida: " + temperatura + "°C");
        }
        return temperatura;
    }

    public static boolean oscilacao() {
        String[] opcoes = {
                "SIM",
                "NÃO"
        };
        int opcaoOscilacao = JOptionPane.showOptionDialog(
                null, "O Ar Condicionado terá oscilação?", "Oscilação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (opcaoOscilacao == 0) {
            arcond.setOscilação(true);
        } 
        return arcond.isOscilação();
    }

}

package exercicio1.televisao;

public class ControleRemoto {
    public static void main(String[] args) {

        Televisao televisao;
        televisao = new Televisao();

        for (int i = 1; i <= 3; i++) {
            televisao.aumentarCanal();
        }
        televisao.diminuirCanal();

        for (int i = 1; i <= 8; i++) {
            televisao.aumentarVolume();
        }
        televisao.diminuirVolume();

        System.out.println("Canal selecionado: " + televisao.getCanal());
        System.out.println("Volume selecionado: " + televisao.getVolume());

    }
}

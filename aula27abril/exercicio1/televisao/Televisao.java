package exercicio1.televisao;

public class Televisao {

    private int volume;
    private int canal;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        this.volume = this.volume + 1;
    }

    public void diminuirVolume() {
        this.volume = this.volume - 1;

    }

    public void aumentarCanal() {
        this.canal = this.canal + 1;
    }

    public void diminuirCanal() {
        this.canal = this.canal - 1;
    }

}

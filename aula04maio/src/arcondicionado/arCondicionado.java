package arcondicionado;

public class arCondicionado {
    private boolean  power = false;
    private int intensidadeDoVento;
    private boolean oscilação = false;
    
    public boolean isPower() {
        return power;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    public int getIntensidadeDoVento() {
        return intensidadeDoVento;
    }
    public void setIntensidadeDoVento(int intensidadeDoVento) {
        this.intensidadeDoVento = intensidadeDoVento;
    }
    public boolean isOscilação() {
        return oscilação;
    }
    public void setOscilação(boolean oscilação) {
        this.oscilação = oscilação;
    }


    
}

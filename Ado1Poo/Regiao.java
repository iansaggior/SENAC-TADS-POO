public class Regiao {
    
    private String regiao;
    private double pibRegiao, pibRegiaoDinheiro;

    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    public double getPibRegiao() {
        return pibRegiao;
    }
    public void setPibRegiao(double pibRegiao) {
        this.pibRegiao = pibRegiao;
    }
    public double getPibRegiaoDinheiro() {
        return pibRegiaoDinheiro;
    }
    public void setPibRegiaoDinheiro(double pibRegiaoDinheiro) {
        this.pibRegiaoDinheiro = pibRegiaoDinheiro;
    }    

    public Regiao() {}

    @Override
    public String toString() {
        return regiao;
    }
}

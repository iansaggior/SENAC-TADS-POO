public class Informacao {

    private String nomeEstado;
    private float pib;
    private float soma;
    
    public String getNomeEstado() {
        return nomeEstado;
    }
    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
    public float getPib() {
        return pib;
    }
    public void setPib(float pib) {
        this.pib = pib;
    }
    public float getSoma() {
        return soma;
    }
    public void setSoma(float soma) {
        this.soma = soma;
    }
    
    @Override
    public String toString() {
        return " Nome do Estado: " + nomeEstado + "\t\t\t - \tPib : " + pib + "\n".replace(",", "\n");
        /* "Soma: " + (soma += pib) +  */
    }

    public Informacao() {}
    
}

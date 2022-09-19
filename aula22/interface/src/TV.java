/**
 * @author Vinícius Yoda
 */
public class TV {
    private int tamanho;
    private int canal;
    private int volume;
    private boolean ligado;

    public TV(int t){
        tamanho = t;
        canal = 0;
        volume = 0;
        ligado = false;
    }

    /**
     * 
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * 
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * 
     * @return the canal
     */
    public int getCanal() {
        return canal;
    }

    /**
     * 
     * @param canal the canal to set
     */
    public void setCanal(int canal) {
        this.canal = canal;
    }

    /**
     * 
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * 
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return the isLigado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * 
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    
}

package aula21_1_interface;

public class ControleRemoto implements Controlador {
    
    //Atributos da Classe
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(int v, boolean l, boolean t) {
        volume = v;
        ligado = l;
        tocando = t;
    }

	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * @return the ligado
	 */
	public boolean isLigado() {
		return ligado;
	}

	/**
	 * @param ligado the ligado to set
	 */
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	/**
	 * @return the tocando
	 */
	public boolean isTocando() {
		return tocando;
	}

	/**
	 * @param tocando the tocando to set
	 */
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

    public void ligar() {
    	System.out.println("Ligando o aparelho");
    	this.setLigado(true);
    }
    
    public void desligar() {
    	System.out.println("Desligando o aparelho");
    	this.setLigado(false);
    }
    
    public void abrirMenu() {
    	if(this.isLigado()) {
    			System.out.println("Abrindo o Menu");
    			System.out.println("Está ligado? " + this.isLigado());
    	System.out.println("Está tocando? " + this.isTocando());
    		System.out.println("Volume: " + this.getVolume());
    	
    		for(int i = 0; i <= this.getVolume(); i++) {
    			System.out.println("|");
    	}
    	System.out.println(" ");
    	}else {
    		System.out.println("Ligue o aparelho!");
    	}
    }
}
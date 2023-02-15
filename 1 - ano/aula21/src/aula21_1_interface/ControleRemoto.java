package aula21_1_interface;

public class ControleRemoto implements Controlador {
    
    //Atributos da Classe
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        volume = 0;
        ligado = false;
        tocando = false;
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

	@Override 
    public void ligar() {
    	System.out.println("Ligando o aparelho");
    	this.setLigado(true);
    }
    
	@Override 
    public void desligar() {
    	System.out.println("Desligando o aparelho");
    	this.setLigado(false);
    }
    
	@Override 
    public void abrirMenu() {
    	if(this.isLigado()) {
    			System.out.println("Abrindo o Menu");
    			System.out.println("Est� ligado? " + this.isLigado());
    			System.out.println("Est� tocando? " + this.isTocando());
    			System.out.println("Volume: " + this.getVolume());
    	
    			for(int i = 0; i <= this.getVolume(); i++) {
    			System.out.print("|");
    			}
    			System.out.println(" ");
    	}else{
    		System.out.println("Ligue o aparelho!");
    	}
    }

	@Override 
	public void fecharMenu(){
		if(this.isLigado()){
			System.out.println("Fechando o Menu");
		}else{
			System.out.println("Não foi possível fechar o Menu");
		}
	}

	@Override 
	public void aumentarVolume() {
		if(this.isLigado()){
			if(this.getVolume() <= 100){
				this.setVolume(this.getVolume() + 5);
			}else {
				System.out.println("Volume máximo - 100%");
			}
		}else{
			System.out.println("Aparelho desligado");
		}
	}

	@Override 
	public void diminuirVolume(){
		if(this.isLigado()){
			if(this.getVolume() >= 0){
				this.setVolume(this.getVolume() - 5);
			}else{
				System.out.println("Volume minimo");
			}
		}else{
			System.out.println("Aparelho desligado!");
		}
	}

	@Override 
	public void ativarMudo(){
		if(this.isLigado() && this.getVolume() > 0){
			this.setVolume(0);
		}
	}

	@Override 
	public void desativarMudo(){
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(20);
		}
	}

	@Override 
	public void play(){
		if(this.isLigado() && !this.isLigado()) {
			this.setTocando(true);
		}else{
			System.out.println("Não foi possível reproduzir... Ligue o aparelho");
		}
	}

	@Override 
	public void pause(){
		if(this.isLigado() && this.isTocando()){
			this.setTocando(false);
		}else{
			System.out.println("Não foi possível pausar... ligue o aparelho");
		}
	}
}
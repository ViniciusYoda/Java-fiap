package aulaDDD;

public class Animal {
	//atributos
	private String especie;
	private String cor;
	private String habitat;
	
	//construtor
	public Animal(String e, String c, String h) {
		this.especie = e;
		this.cor = c;
		this.habitat = h;
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void fazerBarulho() {
		System.out.println("fazerBarulho");
	}
}

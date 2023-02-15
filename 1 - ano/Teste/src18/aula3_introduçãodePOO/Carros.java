package aula3_introduçãodePOO;

public class Carros {
	//Atributos
	String modelo;
	String marca;
	String cor;
	String placa;
	int anoFabr;
	byte nPortas;
	int potencia;
	
	//===========================
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}
	
	
	public String getModelo() {
		return this.modelo;
	}	
	public void setmarca(String marca) {
		this.marca = marca;
	
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	
	//===========================
	public static void main(String[] args) {
		Carros c1 = new Carros();
		c1.setModelo("Fiat");
		System.out.println(c1.getModelo());
		c1.setmarca("pequeno");
	}

}

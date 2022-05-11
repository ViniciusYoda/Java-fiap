package aula12_heranca;

public class Carro {
	
	//atributos
	private String cor;
	private double preco;
	private String modelo;
	
	//Construtores
	public Carro() {
		
	}
	
	//Construtor com 2 parâmetros
	public Carro(String modelo, double preco) {
		this.setCor("Preta");
		this.setModelo(modelo);
		this.setPreco(preco);
	}
	
	//Construtor com 3 parâmetros
	public Carro(String cor, String modelo, double preco) {
		this.setCor(cor);
		this.setModelo(modelo);
		this.setPreco(preco);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}

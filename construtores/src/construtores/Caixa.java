package construtores;

public class Caixa {
	//atributos
	private double largura;
	private double altura;
	private double profundidade;
	
	//construtor
	public Caixa() {
		System.out.println("Construção da Caixa");
		this.largura = 10;
		this.altura = 10;
		this.profundidade = 10;
	}
	
	//métodos
	
	public double volumeCaixa() {
		System.out.println("Calculando o volume da Caixa");
		return largura * altura * profundidade;
	}

}

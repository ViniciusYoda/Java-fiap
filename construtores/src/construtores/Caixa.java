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
	
	//construtor parametrizado
	public Caixa(double l, double a, double p){
		largura = l;
		altura = a;
		profundidade = p;
	}
	
	//métodos
	
	public double volumeCaixa() {
		System.out.println("Calculando o volume da Caixa");
		return largura * altura * profundidade;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

}

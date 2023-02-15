package estudoParaCp;

public class Automovel {

	private String marca;
	private double preco;
	private String cor;
	
	public Automovel(String m, double p, String c) {
		this.marca = m;
		this.preco = p;
		this.cor = c;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}

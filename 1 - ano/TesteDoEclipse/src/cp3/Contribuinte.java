package cp3;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;
	
	public Contribuinte(String n, double r) {
		this.nome = n;
		this.rendaBruta = r;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return rendaBruta;
	}

	public void setRenda(double renda) {
		this.rendaBruta = renda;
	}
	
	@Override
	public String toString() {
		return "Contribuinte: \n Nome: " + nome + "\nRenda Bruta: R$ " + rendaBruta + "\n";
	}
	
	//metodo abstrato
	public abstract double calcularImposto();
	
	
}

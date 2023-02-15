package estudoParaCp;

public class Carro extends Automovel{
	
	private String tamanho;
	private int ano;

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = "grande";
	}

	public Carro(String m, double p, String c) {
		super(m, p, c);

	}
	

}

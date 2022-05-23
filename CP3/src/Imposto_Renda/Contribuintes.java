package Imposto_Renda;



public abstract class Contribuintes {
	private String nome;
	private double renda;	
	
	
	public Contribuintes(String nome, double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}
	
	public double calcularImposto() {		
		
			return renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	
	

}

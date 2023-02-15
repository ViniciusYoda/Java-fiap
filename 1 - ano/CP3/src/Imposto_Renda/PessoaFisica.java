package Imposto_Renda;

public class PessoaFisica extends Contribuintes {
	
	private double imposto;

	public PessoaFisica(String nome, double renda) {
		super(nome, renda);	
		
	}
	
	@Override
	public double calcularImposto() {
		
		if (getRenda() <= 1500) {
			this.imposto = 0;
		}
		
		else if (getRenda() > 1500 && getRenda() <= 3000) {
			this.imposto = getRenda() * 0.075;			
		}
		
		else if (getRenda() > 3000) {
			this.imposto = getRenda() * 0.15;			
		}
			
		return this.imposto;
}

	
	}
	
	
	
	
	
	
			

		
	

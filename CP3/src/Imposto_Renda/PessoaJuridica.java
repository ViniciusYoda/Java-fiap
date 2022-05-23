package Imposto_Renda;

public class PessoaJuridica extends Contribuintes{	
	
	private double imposto;
		
		public PessoaJuridica(String nome, double renda) {
		super(nome, renda);
		// TODO Auto-generated constructor stub
	}

		@Override
		public double calcularImposto() {				
			this.imposto = getRenda() * 0.10;
			return this.imposto;
	}

}

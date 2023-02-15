package cp3;

public class PessoaFisica extends Contribuinte{

	public PessoaFisica(String n, double r, String cpf) {
		super(n, r);
		this.setCpf(cpf);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private String cpf;

	@Override
	public double calcularImposto() {
		double renda = super.getRenda();
		double imposto = 0;
		if(renda <= 1500) {
			imposto =  0;
		}else if(renda >= 1501 && renda <=3000) {
			imposto = (renda*0.075) - 100;
		}else if(renda >3000) {
			imposto = (renda *0.15) - 225;
		}
		return imposto;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "Pessoa Fisica \ncpf: " + this.getCpf() + "Impostp a ser pago R% " + this.calcularImposto() + "\n";
	}

}

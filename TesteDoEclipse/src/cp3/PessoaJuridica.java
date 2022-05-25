package cp3;

public class PessoaJuridica extends Contribuinte{
	public PessoaJuridica(String n, double r, String cnpj) {
		super(n, r);
		this.setCnpj(cnpj);
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	private String cnpj;

	@Override
	public double calcularImposto() {
		return super.getRenda() * 0.1;
	}
	
	public String toString() {
		return super.toString() + "Pessoa Juridica: \ncnpj " + this.getCnpj() + "\nimposto a ser pago R% " + this.calcularImposto() + "\n";
	}
}

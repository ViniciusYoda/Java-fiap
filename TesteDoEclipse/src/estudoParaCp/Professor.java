package estudoParaCp;

public class Professor extends Pessoa{

	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}
	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}
	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return super.getTelefone();
	}
	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		super.setTelefone(telefone);
	}
	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}
	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}
	@Override
	public String getTelefoneCelular() {
		// TODO Auto-generated method stub
		return super.getTelefoneCelular();
	}
	@Override
	public void setTelefoneCelular(String telefoneCelular) {
		// TODO Auto-generated method stub
		super.setTelefoneCelular(telefoneCelular);
	}

	private double salario;
	private String nomeCurso;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
}

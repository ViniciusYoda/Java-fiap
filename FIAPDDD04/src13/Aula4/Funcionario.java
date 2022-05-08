package Aula4;


public class Funcionario {
	private String nome;
	private String depto;
	private double salario;
	private String admissao;
	private String rg;
	
	// getters retorna valor do atributi e setters altera o valor do atributo
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome= nome;
	}
	
	public String getDepto() {
		return depto;
	}
	
	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	public String getAdmissao() {
		return admissao;
	}
	
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getRG() {
		return rg;
	}
	
	public void setRG(String rg) {
		this.rg = rg;
	}
	
	public double aumentarSalario(double perc) {
		
		double novoSalario = this.salario + (this.salario * (perc/100));
		System.out.println(this.salario);
		System.out.println(novoSalario);
		return novoSalario;
	}
	
	public double calculoGanhoReal(double npvoSalario) {
		double ganhoReal = npvoSalario - salario;
		return ganhoReal;
		
		
	}

}

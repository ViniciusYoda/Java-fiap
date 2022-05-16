package Exemplo2;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Empregado() {
		
	}
	
	public Empregado(String n, String s, String c) {
		this.setNome(n);
		this.setSobrenome(s);
		this.setCpf(c);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//m�todo abstrato
	public abstract double vencimento();
}

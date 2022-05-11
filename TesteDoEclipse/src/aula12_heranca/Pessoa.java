package aula12_heranca;

import java.util.Date;

public class Pessoa {
	//atributos
	private String nome;
	private String cpf;
	private Date date;
	
	//Construtor
	public Pessoa(String nome, String cpf, Date date) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}

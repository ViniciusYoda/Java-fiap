package object;

import java.util.Date;

public class Pessoa {
	
	private String nome; // nome da pessoa
	private int identidade; // número da identidade
	private Date nascimento; // data de nascimento da pessoa
	
	public Pessoa(String n, int i, Date d) {
		this.nome = n;
		this.identidade = i;
		this.nascimento = d;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nIdentidade: " + this.identidade + "\nData de nascimento: " + this.nascimento;
	}
}

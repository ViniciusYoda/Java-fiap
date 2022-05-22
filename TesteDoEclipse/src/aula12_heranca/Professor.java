  package aula12_heranca;

import java.util.Date;

public class Professor extends Pessoa{
	
	private double salario;
	private String disciplina;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Professor(String nome, String cpf, Date date) {
		super(nome, cpf, date);
		// TODO Auto-generated constructor stub
	}

}

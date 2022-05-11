package aula12_heranca;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private String matricula;

	

	public Aluno(String nome, String cpf, Date date) {
		super(nome, cpf, date);
		// TODO Auto-generated constructor stub
		this.setMatricula(matricula);
	}
	
	public double tirarCopiras(int qtde) {
		return 0.07 * qtde;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	

}

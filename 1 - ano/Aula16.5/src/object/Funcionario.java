package object;

import java.util.Date;

public class Funcionario extends Pessoa{
	
	private Date admissao;
	private float salario;
	
	public Funcionario(String nome, int id, Date nasc, Date adm, float sal) {
		super(nome, id, adm);
		this.admissao = adm;
		this.salario = sal;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public String toString() {
		String resultado;
		resultado = super.toString() + "\n";
		resultado = resultado + "Data admissão: " + this.admissao + "\n";
		resultado = resultado + "Salário: " + this.salario + "\n";
		return resultado;
	}
	
	
}

package object;

import java.util.Date;

public class ChefeDeDepartamento extends Funcionario{
	private String departamento;
	private Date promocaoAChefe;
	
	public ChefeDeDepartamento(String nome, int id, Date nasc, Date adm, float sal, String dep, Date prom) {
		super(nome, id, nasc, adm, sal);
		departamento = dep;
		promocaoAChefe = prom;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public String toString() {
		String resultado;
		resultado =  super.toString() + "\n";
		resultado = resultado + "Departamento: " + departamento + "\n";
		resultado = resultado + "Data de Promoção: " + promocaoAChefe;
		return resultado;
	}
}

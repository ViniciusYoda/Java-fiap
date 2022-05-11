package aula12_heranca;

import java.util.Date;

public class TestePessoa {
	public static void main(String[] args) {
		Aluno a = new Aluno("Vinícius", "123.456.789-01", new Date());
		a.setMatricula("12/3/2022");
		System.out.println("Nome: " + a.getNome());
		System.out.println("CPF: " + a.getCpf());
		System.out.println("Data de Nascimento: " + a.getData_nascimento().toString());
		System.out.println("Matricula: " + a.getMatricula());
		
		System.out.println("===============================================================");
		
		Professor p = new Professor("José", "234.567.890-12", new Date());
		p.setDisciplina("Java");
		p.setSalario(3000.00);
		System.out.println("Nome: " + p.getNome());
		System.out.println("CPF: " + p.getCpf());
		System.out.println("Data de Nascimento: " + p.getData_nascimento().toString());
		System.out.println("Disciplina: " + p.getDisciplina());
		System.out.println("Salário; " + p.getSalario());
		
		System.out.println("===============================================================");
		
		
		
	}
	
}

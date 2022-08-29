package cpArray;

import java.util.Scanner;

public class ListaAluno extends Aluno {
	
	private Aluno[] alunos = null;
	private String aluno;
	private int nota;

	public ListaAluno(String aluno, int valor) {
		super(aluno, valor);
		alunos = new Aluno[valor];
	}
	
	public String lerNome(String nome) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual nome do aluno? ");
		aluno = input.next();
		return aluno;
		
	}
	
	public int lerNotas(int notas) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.printf("Qual a nota da %d prova",i);
		}
		nota = input.nextInt();
		return nota;
		
	}
	
	public int calcularMedia(int media) {
		media = (nota + nota) / 2;
		return media;
	}

}

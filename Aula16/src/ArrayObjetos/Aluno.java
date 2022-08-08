package ArrayObjetos;

import java.util.Scanner;

public class Aluno {
	
	private int matricula;
	private String nome;

	public Aluno(int matricula, String nome){
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int qtdeAlunos() {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantidade de alunos: ");
		int qtde = input.nextInt();
		return qtde;
	}
	
	public void imprimirDados() {
		System.out.println("Aluno: " + getNome());
		System.out.println("Matricula " + getMatricula());
	}
	
	
	
	public int[] criarVetor(int t) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[t];
		for(int i = 0; i < vetor.length; i++){
			System.out.println("Tamanho: ");
			vetor[i] = input.nextInt();
		}
		return vetor;
		
	}
	
	
}
	
	


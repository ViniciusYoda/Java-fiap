package ArrayObjetos;

import java.util.Scanner;

public class Aluno {
	
	private int matricula;
	private String nome;
	
	public Aluno() {
		
	}

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
	
	public Aluno[] criarVetor(int t) {
		Scanner input = new Scanner(System.in);
		Aluno[] vetor = new Aluno[t];
		for(int i = 0; i < vetor.length; i++){
			
			System.out.println("Tamanho: ");
			matricula = input.nextInt();
			nome = input.next();
			alunos[i] = new Aluno(matricula, nome);
		}
		return alunos;
		
	}
	
	public void imprimirDados(Aluno[] alunos) {
		System.out.println("*- Imprimindo os dados dos alunos... -*");
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Matricula: " + alunos[i].getMatricula());
			System.out.println("Nome: " + alunos[i].getNome());
		}
	}
	
		public static void main(String[] args) {
			Aluno a = new Aluno();
			int qtde = a.qtdeAlunos();
			Aluno[] alunos = a.criarVetor(qtde);
			a.imprimirDados(alunos);
			
		}
	
	/*public void imprimirDados() {
		System.out.println("Aluno: " + getNome());
		System.out.println("Matricula " + getMatricula());
	}	*/
	
	
	
}
	
	


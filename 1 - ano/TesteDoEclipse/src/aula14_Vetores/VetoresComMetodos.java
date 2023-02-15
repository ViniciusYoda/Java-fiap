package aula14_Vetores;

import java.util.Scanner;

public class VetoresComMetodos {

	public int tamanhoVetor() {
		System.out.println("*-- TAMANHO DO VETOR --*");
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho: ");
		int t = input.nextInt();
		return t;
	}
	
	public int[] criaVetor(int t) {
		System.out.println("*== CRIA O VETOR --*");
		int[] vetor = new int[t];
		return vetor;
	}
	
	public int[] populaVetor(int[] vetor) {
		System.out.println("*== POPULA O VETOR --*");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.printf("vetor[%d]: ", i);
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	public void imprimirVetor(int[] vetor) {
		System.out.println("*-- IMPRIME O VETOR --*");
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("vetor[%d]: %d \n", i, vetor[1]);
		}
	}
	
	public int verificarOcorrências(int[] vetor, int num){
		System.out.println("*== VERIFICA OCORRÊNCIAS ==*");
		int cont = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] == num) {
				cont++;
			}
		}
		return cont;
	}
}

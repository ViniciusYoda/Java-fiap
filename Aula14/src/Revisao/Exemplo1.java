package Revisao;

import java.util.Scanner;

public class Exemplo1 {
	
	public int tamanhoVetor(){
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho: ");
		int t = input.nextInt();
		return t;
	}
	
	public int[] criaVetor(int t) {
		Scanner input = new Scanner(System.in);
		int[] vetor  = new int[t];
		for(int i = 0; i < vetor.length; i++){
			System.out.println("Número: ");
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	public int entradaNumero(){
		Scanner input = new Scanner(System.in);
		System.out.println("Número: ");
		int n = input.nextInt();
		return n;
	}
	
	public boolean buscaElemento(int[] vetor, int n) {
		boolean achou = false;
		for(int i = 0; i<vetor.length; i++){
			if (vetor[i] == n){
				achou = true;
			}
		}
		return achou;
	}
	
	public static void main(String[] args) {
		
	}
}

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
			System.out.println("N�mero: ");
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	public int entradaNumero(){
		Scanner input = new Scanner(System.in);
		System.out.println("N�mero: ");
		int n = input.nextInt();
		return n;
	}
	
	public boolean buscaElemento(int[] vetor, int n) {
		
	}
	
	public static void main(String[] args) {
		
	}
}

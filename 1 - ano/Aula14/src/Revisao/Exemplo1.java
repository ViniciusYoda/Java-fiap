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
	
	public void imprimirStatus(int n, boolean status) {
		if(status) {
			System.out.printf("O número %d foi encontrado", n);
		}else {
			System.out.printf("O número %d não foi encontrado", n);
		}
	}
	
	public static void main(String[] args) {
		Exemplo1 e = new Exemplo1();
		int t = e.tamanhoVetor();
		int[] v = e.criaVetor(t);
		int n = e.entradaNumero();
		boolean status = e.buscaElemento(v, n);
		e.imprimirStatus(n, status);
	}
}

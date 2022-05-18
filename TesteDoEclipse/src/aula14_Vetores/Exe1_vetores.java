package aula14_Vetores;

import java.util.Scanner;

public class Exe1_vetores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamanho = 10, cont = 0;
		int[] vetor = new int[tamanho];
		
		//preencendo o vator
		for(int i=0; i<tamanho; i++) {
			System.out.printf("vetor[%d]: \n", i);
			vetor[i] = input.nextInt();
			if(vetor[i] > 0) {
				cont++;
			}
		}
		
		System.out.println("Qtde Positivos: " + cont);
		
		//percorrendo o vetor
		for(int i=0; i<tamanho; i++) {
			if(vetor[i]%2 == 0)
			System.out.printf("vetor[%d]:%d \n", i, vetor[i]);
		}
		input.close();
	}
	
}

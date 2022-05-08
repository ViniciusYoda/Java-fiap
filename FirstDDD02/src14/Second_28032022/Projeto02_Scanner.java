package Second_28032022;

import java.util.Scanner;

public class Projeto02_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaração de variáveis
		double n1, n2, media;
		Scanner input = new Scanner(System.in);
		
		System.out.println("*-- Calcular média --*");
		
		System.out.println("Nota 1: ");
		n1 = input.nextDouble();
		
		System.out.println("Nota 2: ");
		n2 = input.nextDouble();
		
		//processamento
		media = (n1 + n2) / 2;
		System.out.println("Media: " + media);
	}

}

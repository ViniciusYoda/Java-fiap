package Aula9_Condicionais;

import java.util.Scanner;

public class ExemploPraticoCondicionais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		
		System.out.println("1-Domingo");
		System.out.println("2-Segunda");
		System.out.println("3-Terça");
		System.out.println("4-Quarta");
		System.out.println("5-Quinta");
		System.out.println("6-Sexta");
		System.out.println("7-Sábado");
		System.out.println("Opção: ");
		op = input.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4: 
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		default:
			System.out.println("Sábado");
			
		
		}
	}

}

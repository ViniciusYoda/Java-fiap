package Aula9_Condicionais;

import java.util.Scanner;

public class ExemploPraticoCondicionais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op = 0;
		boolean continuar = true;
		String nome = "Vinícius";
		
		
		while(continuar) {
			System.out.println("1-Domingo");
			System.out.println("2-Segunda");
			System.out.println("3-Terça");
			System.out.println("4-Quarta");
			System.out.println("5-Quinta");
			System.out.println("6-Sexta");
			System.out.println("7-Sábado");
			System.out.println("Opção: ");
			op = input.nextInt();
			if(op <= 7 && op >= 1) {
				continuar = false;
			}
		}
		
		
		switch(op) {
		case 1:
			System.out.println("Domingo - R$ 100.00");
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
		case 7:
			System.out.println("Sábado");
			break;
		default: 
			System.out.println("Dia da semana inválido");
			
		
		}
		switch(nome) {
		case "Vinicius":
		case "vinicius":
		case "VINICIUS":
			System.out.println("Correto");
			break;
		default:
			System.out.println("Incorret!");
		}
		
		//exemplo com if
		if(nome.equals("Vinicius")||
				nome.equals("vinicius")||
				nome.equals("VINICIUS")) {
			System.out.println("Correto");
		}else {
			System.out.println("Incorreto");
		}
	}

}

package novidades;

import java.util.Scanner;

public class ErrosContinue {
	Scanner sc = new Scanner(System.in);
		
		//Lê os dois números
	int numero1 = sc.nextInt();
	int numero2 = sc.nextInt();
		
		
		
	try {
			 // Realiza a divisão
	int divisao = numero1 / numero2;
			//Exibe o resultado
	System.out.println("O resultado é: " + divisao);
	} catch (ArithmeticException e) {
	System.out.println("Erro ao dividir");
	}
		
	sc.close();
	
			
}

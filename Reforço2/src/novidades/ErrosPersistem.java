package novidades;

import java.util.Scanner;

public class ErrosPersistem {
	Scanner sc = new Scanner(System.in);
	try {
	  // Lê os dois números
	  int numero1 = sc.nextInt();
	  int numero2 = sc.nextInt();
	  // Realiza a divisão
	  int divisao = numero1 / numero2;
	  // Exibe o resultado
	  System.out.println("O resultado é: " + divisao);
	} catch (ArithmeticException e) {
	  System.err.println("Erro ao dividir!");
	} catch (InputMismatchException e) {
	  System.err.println("Erro de entrada de dados!");
	} finally{
	  System.out.println("Finalizando a execução do programa!");
	  sc.close();
	}
}

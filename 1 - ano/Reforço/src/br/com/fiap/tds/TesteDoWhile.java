package br.com.fiap.tds;

import java.util.Scanner;

public class TesteDoWhile {
	Scanner sc = new Scanner(System.in);
	String opcao;
	do {
		System.out.println("Digite um n�merp");
		int n1 = sc.nextInt();
		System.out.println("Digite outro n�mero");
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("A soma �: " + soma);
		System.out.println("Deseja somar outro n�mero? (s/n)");
		opcao = sc.next();
	}while(opcao.equals("s"));
	sc.close();
}

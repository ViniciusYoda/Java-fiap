package br.com.fiap.tds;

import java.util.Scanner;

public class TesteDoWhile {
	Scanner sc = new Scanner(System.in);
	String opcao;
	do {
		System.out.println("Digite um númerp");
		int n1 = sc.nextInt();
		System.out.println("Digite outro número");
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("A soma é: " + soma);
		System.out.println("Deseja somar outro número? (s/n)");
		opcao = sc.next();
	}while(opcao.equals("s"));
	sc.close();
}

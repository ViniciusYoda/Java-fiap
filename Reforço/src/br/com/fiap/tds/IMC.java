package br.com.fiap.tds;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � a sua altura?");
		float altura = sc.nextFloat();
		System.out.println("Qual � seu peso?");
		float peso = sc.nextFloat();
		
		float soma = peso / (altura * altura);
		System.out.println("A soma da sua altura com seu peso � de: " + soma);
		
		if (soma >= 18.5 && soma <=25){
			System.out.println("O seu peso � normal");
		}else {
			System.out.println("O seu peso est� fora do normal");
		}
	}

}

package br.com.fiap.tds;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x/y;
		int resto = x % y;
		
		System.out.println("Resultado da adi��o: " + soma);
		System.out.println("Resultado da subtra��o: " + subtracao);
		System.out.println("Resultado da multiplica��o: " + multiplicacao);
		System.out.println("Resultado da divis�o: " + divisao);
		System.out.println("Resultado do m�dulo: " + resto);
		
		x++;
		System.out.println("Resultado do incremento x: " + x);
		
		y--;
		System.out.println("Resultado do decremento de y: " + y);
		
		x += 10;
		System.out.println("Atribui��o aditiva de x: " + x);
		
		y -= 10;
		System.out.println("Atribui��o subtrativa de y: " + y);
		

	}

}

package Aula8_Repeticao;

public class AulaPraticaRepeticao {
	public static void main(String[] args) {
		
		String nome = "Jos�";
		double salario = 1500;
		int cont = 0;
		
		System.out.println("Sal�rio inicial: " + salario);
		
		while(salario < 5000) {
			salario = salario + (salario * 0.1);
			System.out.println("Novo sal�rio: " + salario);
			cont++;
		}
		// printf - print com formata��o (format)
		// %s - String
		// %c - caractere
		// %d - int
		// %f - %.2f
		System.out.printf("%s, seu sal�rio final � de: $.2f \n", nome, salario);
		System.out.printf("Tempo: 5d \n", cont);
		System.out.println("Tempo: " + cont + " meses");
	}

}

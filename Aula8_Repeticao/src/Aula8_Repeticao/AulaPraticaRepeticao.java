package Aula8_Repeticao;

public class AulaPraticaRepeticao {
	public static void main(String[] args) {
		
		String nome = "José";
		double salario = 1500;
		int cont = 0;
		
		System.out.println("Salário inicial: " + salario);
		
		while(salario < 5000) {
			salario = salario + (salario * 0.1);
			System.out.println("Novo salário: " + salario);
			cont++;
		}
		// printf - print com formatação (format)
		// %s - String
		// %c - caractere
		// %d - int
		// %f - %.2f
		System.out.printf("%s, seu salário final é de: $.2f \n", nome, salario);
		System.out.printf("Tempo: 5d \n", cont);
		System.out.println("Tempo: " + cont + " meses");
	}

}

package revisao02;

import java.util.Scanner;

public class Matriz {
	
	
	public int[] tamanhoMatriz() {
		System.out.println("*- Tamanho da Matriz -*");
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[2];
		System.out.println("Linhas: ");
		vetor[0] = input.nextInt();
		System.out.println("Coluna: ");
		vetor[1] = input.nextInt();
		return vetor;
	}
	
	public int[][] criarMatriz(int[] vetor) {
		System.out.println("*- Criar a Matriz -*");
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[vetor[0]][vetor[1]];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d]: \n",i,j);
				matriz[i][j] = input.nextInt();
			}
		}
		return matriz;
	}
	
	public void imprimirMatriz(int[][] matriz) {
		System.out.println("*- Imprime a Matriz -*");
		
		// percorrendo a matriz
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d] = %d \n",i,j,matriz[i][j]);
			}
		}
	}
	
	
	public int obterNumero() {
		System.out.println("*- Obter o número -*");
		Scanner input = new Scanner(System.in);
		System.out.println("Número: ");
		int n = input.nextInt();
		return n;
	}
	
	public int verificarOcorrencias(int n, int[][] m) {
		System.out.println("*- Verificacr Ocorrencias -*");
		int cont = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (n == m[i][j]) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	//TO DO
	//Método: obter os indices das ocorrencias
	// Método: Imprimir as ocorrências encontradas
	
	//=============================
	
	// Poderia estar na classe de teste
	public static void main(String[] args) {
		Matriz emm = new Matriz(); 
		int[] v = emm.tamanhoMatriz();
		int[][] m = emm.criarMatriz(v);
		emm.imprimirMatriz(m);
		int n = emm.obterNumero();
		int o = emm.verificarOcorrencias(n, m);
		System.out.printf("Ocorrências de %d na matriz: %d \n", n,o);
	}
	
	
	
}

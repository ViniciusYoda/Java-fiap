import java.security.SecureRandom;

public class CursoJava {
	public static void main(String[] args) {
		
		final int linha = 3;
		final int coluna = 5;
		int[][] numeros = new int[linha][coluna];
		
		gerarDados(numeros,linha,coluna);
		impDados(numeros,linha,coluna);
		
		
		
	}
	
	public static void impDados(int[][] mtz, int linha, int coluna) {
		for(int l = 0; l < linha; l++) {
			for(int c = 0; c < coluna; c++) {
				System.out.printf("%d - ", mtz[l][c]);
			}
			System.out.printf("%n");
		}
	}
	
	public static void gerarDados(int[][] mtz, int linha, int coluna) {
		for(int l = 0; l < linha; l++) {
			for(int c = 0; c < coluna; c++) {
				mtz[l][c] = new SecureRandom().nextInt(100);
			}
		}
	}
}

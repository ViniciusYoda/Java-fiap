public class CursoJava04 {
	public static void main(String[] args) {
		
		int[] notas= {10,85,67,45,98,78,88,60,67,82};
		int[] resultado= {0,0};
		
		conferirNotas(notas,resultado);
		
		System.out.printf("Aprovados.:%d%n",resultado[0]);
		System.out.printf("Reprovado.:%d%n",resultado[1]);
	}
	
	public static void conferirNotas(int[] nt, int[]r) {
		for(int n:nt) {
			if(n>=60) {
				r[0]++;
			}else {
				r[1]++;
			}
		}
	}
}

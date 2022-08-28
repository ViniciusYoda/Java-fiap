import java.util.Arrays;

public class CursoJava06 {
	public static void main(String[] args) {
		
		
		int[] num2= {0,1,2,3,4,5,6,7,8,9};
		int[] num3 = {0,1,2,3,4,5,6,7,8,9};
		int[] num1 = {9,5,0,7,4,2,6,3,1,8};
		int[] num4 = {10,4,7,23,4,10,8,0,4,9};
		int[] num5 = new int[10];
		
		// ordena a lista
		//Arrays.sort(num);
		
		// preenche o array com valor indicado
		//Arrays.fill(num2,10);
		
		//copiar valores de arrays
		//System.arraycopy(num, 0, num2, 0, num.length);
		
		// compara se dois arrays são iguais
		//System.out.printf("num1 igual a num2 : %s%n",Arrays.equals(num3, num2) ?"Igual":"Diferente");
		//System.out.printf("num1 igual a num4 : %s%n",Arrays.equals(num1, num4) ?"Igual":"Diferente");
		
		//Pesquisa e verificar se tal valor está na array, mas o array precisa está ordenado
		//int valor =7;
		//Arrays.sort(num4);
		//int pos = Arrays.binarySearch(num4, valor);
		//System.out.printf("%d está no array? %s - posição:%d%n",valor,pos > -1 ? "Sim" : "Não",pos);
		
		/*for(int n : num2) {
			System.out.printf("%d - ", n);
		}*/
	}
}

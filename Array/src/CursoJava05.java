
public class CursoJava05 {
	public static void main(String[] args) {
		
		//int[] valores = {10,5,2,3};
		int res = soma(10,5,2,3,1,9,4);
		
		System.out.printf("%d",res);
	}
	
	public static int soma(int... n) {
		int res = 0;
		for(int v:n) {
			res+=v;
		}
		return res;
	}
}

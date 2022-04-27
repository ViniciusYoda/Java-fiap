package Aula8_Repeticao;

public class ExemploPraticoRepeticao2 {
	public static void main(String[] args) {
		int i = 100;
		int f = 200;
		
		if(i < f) {
			System.out.printf("%d deve ser maior que %d \n", i,f);
			
		}else {
			while(i > f) {
				System.out.println("i: " + i);
				if(i == 150) 
					break;
				
				i--; //i-=1
			}
		}
		
		System.out.println("Fora do while");
	}

}

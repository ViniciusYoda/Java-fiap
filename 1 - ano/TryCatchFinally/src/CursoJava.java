import java.util.ArrayList;

public class CursoJava {
	public static void main(String[] args) {
		
		ArrayList<String> carros = new ArrayList<String>();

		
		carros.add("HRV");
		carros.add("Polo");
		carros.add("Cruze");
		carros.add("Argo");
		carros.add("Fusion");

		try{
			System.out.println(carros.get(10);
		}catch(IndexOutOfBoundsException e){
			System.out.println('Erro: Valor fora do indice do array');
		}finally{
			System.out.println('Fim do Try')
		}
		
	}
}

import java.util.ArrayList;

public class CursoJava {
	public static void main(String[] args) {
		
		ArrayList<String> carros = new ArrayList<String>();

		
		carros.add("HRV");
		carros.add("Polo");
		carros.add("Cruze");
		carros.add("Argo");
		carros.add("Fusion");
		
		System.out.println(carros.indexOf("Polo"));
		carros.clear();
		
		for(int i = 0; i < carros.size(); i++) {
			System.out.println(carros.get(i));
		}
		/*	
		 for(String e : carros) {
			System.out.println(e);
		}
		*/
	}
}

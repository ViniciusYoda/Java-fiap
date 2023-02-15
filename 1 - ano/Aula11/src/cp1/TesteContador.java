package cp1;

public class TesteContador {
	public static void main(String[] args) {
		Contador c1 = new Contador(); {
			c1.zerarCont(0);
			System.out.println("Contador: " + c1.retornarCont());
			c1.incCont(3);
			System.out.println("Contador: " + c1.retornarCont());
			c1.zerarCont(0);
			System.out.println("Contador: " + c1.retornarCont());
			
		}
	}
}

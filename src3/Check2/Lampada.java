package Check2;

public class Lampada {

	String lampada = "Desligada";

	void ligada() {
		lampada = "ligado";
	}

	void desligada(){
		lampada = "desligada";
	}
	public String status(){
		return "A lâmpada está:" + lampada;
	}

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		
		System.out.println(lampada1.status());
		
		lampada1.ligada();
		System.out.println(lampada1.status());
		
		lampada1.desligada();
		System.out.println(lampada1.status());
		
		lampada1.ligada();
		System.out.println(lampada1.status());
		
		lampada1.status();
		System.out.println(lampada1.status());
			
			
	}
		
}

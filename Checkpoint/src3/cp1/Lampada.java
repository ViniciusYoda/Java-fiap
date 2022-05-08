package cp1;

public class Lampada {

	boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public static void main(String[] args) {
		Lampada l = new Lampada();
		System.out.println("Estado: " + l.getStatus());
		l.ligar();
		System.out.println("Estado: " + l.getStatus());
		l.desligar();
		System.out.println("Estado: " + l.getStatus());
	}
	
}

package cp1;

public class TestaLampada {
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		System.out.println("Status: " + lamp.obterStatus());
		lamp.ligar();
		System.out.println("Status: " + lamp.obterStatus());
		lamp.mostraStatus(lamp.obterStatus());
		lamp.desligar();
		lamp.mostraStatus(lamp.obterStatus());
		
	}
}

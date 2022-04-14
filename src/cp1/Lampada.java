package cp1;

public class Lampada {
	
	private boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public boolean obterStatus() {
		return status;
	}
	
	public void mostraStatus(boolean status) {
		if(status == true) {
			System.out.println("Ligada");
		}else {
			System.out.println("Desligada");
		}
	}

}

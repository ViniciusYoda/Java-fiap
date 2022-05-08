package cp1;

public class Contador {
	//atributo
	private int cont;
	
	public void zerarCont(int num) {
		cont = num;
	}
	
	public void incCont(int valor) {
		cont += valor;
	}
	
	public int retornarCont() {
		return cont;
	}
	
	
	public static void main(String[] args) {
		Contador c1 = new Contador();
		c1.zerarCont(4);
		System.out.println("Contador: " + c1.retornarCont());
		c1.incCont(3);
		System.out.println("Contador: " + c1.retornarCont());
		c1.zerarCont(0);
		System.out.println("Contador: " + c1.retornarCont());
		
	}
	
}

package cp1;

public class Contador {
	//atributo da classe
	int cont;
	
	//métodos
	public void setCont(int valor) {
		this.cont = valor;
	}
	
	public void incrementarCont() {
		cont = cont + 1;
	}
	
	public int getCont() {
		return cont;
		
	}
	
	public static void main(String[] args) {
		//instanciar o objeto c
		Contador c = new Contador();
		c.setCont(0);
		System.out.println("Contador: " + c.getCont());
		c.incrementarCont();
		System.out.println("Contador: " + c.getCont());
		c.incrementarCont();
		System.out.println("Contador: " + c.getCont());
		
	}

}

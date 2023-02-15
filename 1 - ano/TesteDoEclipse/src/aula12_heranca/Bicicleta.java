package aula12_heranca;

public class Bicicleta extends Veiculo{
	//Construtor
	public Bicicleta() {
		System.out.println("Bicicleta");
	}
	
	//Métodso
	public void checkList() {
		System.out.println("Bicicleta.checkList");
	}
	
	public void adjust() {
		System.out.println("Bicicleta.adjust");
	}
	
	public void cleanup() {
		System.out.println("Bicicleta.cleanup");
	}
}

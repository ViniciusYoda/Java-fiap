package aula12_heranca;

public class Automovel extends Veiculo{
	//Construtor
	public Automovel() {
		System.out.println("Automovel");
	}
	
	//Métodos
	public void checkList() {
		System.out.println("Automovel.checkList");
	}
	
	public void adjust() {
		System.out.println("Automovel.adjust");
	}
	
	public void cleanup() {
		System.out.println("Automovel.cleanup");
	}
}

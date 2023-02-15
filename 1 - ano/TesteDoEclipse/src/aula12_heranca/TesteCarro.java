package aula12_heranca;

public class TesteCarro {
	public static void main(String[] args) {
		Honda carro1 = new Honda("2.0 Flex", "Honda Accord", 60000);
		System.out.println(carro1);
		
		System.out.println("Motor: " + carro1.getModelo() );
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Motor: " + carro1.getMotor());
		System.out.println("Preço: " + carro1.getPreco());
		
		
	}
	
}

package estudoParaCp;

public class TesteAutomovel {
	public static void main(String[] args) {
		Automovel carro = new Automovel("uno", 10000, "vermelho");
	
		System.out.println("O carro " + carro.getMarca() + " está custando " + carro.getPreco() + " da cor " + carro.getCor());
		
	}
}

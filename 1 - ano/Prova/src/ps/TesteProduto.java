package ps;

public class TesteProduto {
	public static void main(String[] args) {
		ProdutoNovo n = new ProdutoNovo("Celular", 2000);
		n.calcularPreco();
		System.out.println("O preço do " + n.getNome() + " custa: " + n.getPreco() + "\n sendo um  produto novo tem um acrescimo de 15%"  + " com isso, o " + n.getNome() + " fica valendo: " + n.calcularPreco());
		
		ProdutoUsado u = new ProdutoUsado("Celular", 2000);
		u.calcularPreco();
		System.out.println("O preço do " + u.getNome() + " custa: " + u.getPreco() + "\n sendo um produto usado tem um decrescimo de 15%"  + " com isso, o " + u.getNome() + " fica valendo: " + u.calcularPreco());
	}
}

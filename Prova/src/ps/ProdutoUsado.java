package ps;

public class ProdutoUsado extends Produto {
	private float desconto;

	public ProdutoUsado(String nome, float preco) {
		super(nome, preco);
		this.setDesconto(this.getPreco() * 0.15f);
	}
	
	public float calcularPreco() {
		return this.getPreco() - this.getDesconto();
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

}

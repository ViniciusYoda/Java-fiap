package ps;

public class ProdutoNovo extends Produto {
	private float adicional;

	public ProdutoNovo(String nome, float preco) {
		super(nome, preco);
		this.setAdicional(this.getPreco() * 0.15f);
		
	}
	
	public float calcularPreco() {
		return this.getPreco() + this.getAdicional();
		
	}

	public float getAdicional() {
		return adicional;
	}

	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}
	
	

}

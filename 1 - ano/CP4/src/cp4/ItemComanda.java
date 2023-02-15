package cp4;

public class ItemComanda {
	private Produto produto;
	private int quantidade;
	/**
	 * @param produto
	 * @param quantidade
	 */
	public ItemComanda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public float calculaPreco() {
		return produto.getPrecoUnitario() * quantidade;
	}
	
	public String toString() {
		return "C�digo: " + produto.getCodigo() +"\n" + 				"Descri��o: " + produto.getDescricao() + "\n" + 				"Qtdde: " + quantidade + "\n" +
				"Pre�o: " + calculaPreco();
	}
	
	
}

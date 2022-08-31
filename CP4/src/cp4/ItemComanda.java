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
		return "Código: " + produto.getCodigo() +"\n" + 				"Descrição: " + produto.getDescricao() + "\n" + 				"Qtdde: " + quantidade + "\n" +
				"Preço: " + calculaPreco();
	}
	
	
}

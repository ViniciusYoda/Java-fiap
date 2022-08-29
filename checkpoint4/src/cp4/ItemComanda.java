package cp4;

/**
 * 
 * @author Vinícius Yoda
 *
 */

public class ItemComanda extends Produto{
	
	private Produto produto;
	private int quantidade;
	
	/**
	 * 
	 * @param codigo extendido do Produto
	 * @param descricao extendido do Produto
	 * @param preco_unitario extendido do Produto
	 * @param produto do ItemComanda
	 * @param quantidade do ItemComanda
	 */
	
	public ItemComanda(int codigo, String descricao, float preco_unitario, Produto produto, int quantidade) {
		super(codigo, descricao, preco_unitario);
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	/**
	 * 
	 * @param preco recebe preco_unitario * quantidade
	 * @return preco
	 */

	public double calcularPreco(double preco) {
		preco = produto.getPreco_unitario() * quantidade;
		return preco;
	}
	
	/**
	 * Método para escrever
	 */

	@Override
	public String toString() {
		return "ItemComanda [produto=" + produto + ", quantidade=" + quantidade + ", toString()=" + super.toString()
				+ ", getCodigo()=" + getCodigo() + ", getDescricao()=" + getDescricao() + ", getPreco_unitario()="
				+ getPreco_unitario() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}

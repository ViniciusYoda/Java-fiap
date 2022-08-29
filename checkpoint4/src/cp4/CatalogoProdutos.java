package cp4;

import java.util.ArrayList;

/**
 * 
 * @author Vinícius Yoda
 *
 */

public class CatalogoProdutos {
	ArrayList<Produto> produto;
	
	/**
	 * Construtor para gerar ArrayList de Produto
	 */
	
	public CatalogoProdutos() {
		produto = new ArrayList<Produto>();
	}
	
	/**
	 * 
	 * @param p cadastar o produto
	 */
	
	public void cadastroProduto(Produto p) {
		produto.add(p);
	}
	
	/**
	 * 
	 * @param p buscar o item
	 */
	
	public void buscarItem(Produto p) {
		produto.contains(p);
	}
	
	/**
	 * Método de escrita
	 */

	@Override
	public String toString() {
		return "CatalogoProdutos [produto=" + produto + "]";
	}
}

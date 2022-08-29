package cp4;

import java.util.ArrayList;

/**
 * 
 * @author Vinícius Yoda
 *
 */

public class Comanda {
	ArrayList<Produto> itemComanda;
	
	/**
	 * Construtor para criar o ArrayList de itemComanda
	 */
	
	public Comanda() {
		itemComanda = new ArrayList<Produto>();
	}
	
	/**
	 * 
	 * @param p adicionar o item
	 */
	
	public void registrarItem(Produto p) {
		itemComanda.add(p);
	}
	
	/**
	 * 
	 * @param total receber preço
	 * @return o total
	 */
	
	public float calcularValorTotal(float total) {
		total += preco;
		return total;
		
	}
	
	/**
	 * Método de escrita
	 */

	@Override
	public String toString() {
		return "Comanda [itemComanda=" + itemComanda + "]";
	}
	
	
}

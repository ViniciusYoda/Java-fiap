package cp4;

import java.util.ArrayList;

public class Comanda {
	private ArrayList<ItemComanda> itens;
	
	public Comanda() {
		itens = new ArrayList<ItemComanda>();
	}
	
	public void registrarItem(ItemComanda item) {
		itens.add(item);
	}
	
	public float calcularValorTotal() {
		float total = 0;
		for(ItemComanda  item : itens) {
			total += item.calculaPreco();
		}
		return total;
	}
	
	public String formatarParaImprimir() {
		StringBuilder sb = new StringBuilder();
		for(ItemComanda item : itens) {
			sb.append(item.toString() + "\n");
		}
		return sb.toString();
	}
	
}

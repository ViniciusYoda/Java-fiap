package cp4;

public class ComandaTeste {
	public static void main(String[] args) {
		Produto p = new Produto(1, "Bolo", 10);
		ItemComanda item = new ItemComanda(p, 2);
		Comanda c = new Comanda();
		
		c.registrarItem(item);
		
		System.out.println(c.calcularValorTotal());
		
		System.out.println(c.formatarParaImprimir());
	}
}

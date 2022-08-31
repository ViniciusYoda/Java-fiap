package cp4;

import java.util.ArrayList;

public class CatalogoProdutos {
	private ArrayList<Produto> produtos;
	
	public CatalogoProdutos() {
		produtos = new ArrayList<Produto>();
	}
	
	public void cadastrarProduto(Produto p) {
		produtos.add(p);
	}
	
	public Produto buscarProduto(int codigo) {
		for(Produto p: produtos) {
			if(codigo == p.getCodigo()) {
				return p;
			}
		}
		return null;
	}
	
	public String formatarParaImpressao() {
		StringBuilder sb = new StringBuilder();
		for(Produto p: produtos) {
			sb.append(p.toString() + "\n");
		}
		return sb.toString();
	}
	
}

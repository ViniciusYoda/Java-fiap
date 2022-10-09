package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoDAO {

	private static List<ProdutoTO> listaDeProdutos;

	public ProdutoDAO() {

		if (listaDeProdutos == null) {
			listaDeProdutos = new ArrayList<ProdutoTO>();

			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setTitulo("Chinelo");
			pto.setPreco(2.987);
			pto.setQuantidade(100);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setTitulo("Celular");
			pto.setPreco(2.987);
			pto.setQuantidade(100);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setTitulo("Carro");
			pto.setPreco(2.987);
			pto.setQuantidade(100);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setTitulo("Chinelo");
			pto.setPreco(2.987);
			pto.setQuantidade(100);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setTitulo("Cabelo");
			pto.setPreco(2.987);
			pto.setQuantidade(100);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(5);
			pto.setTitulo("Caderno");
			pto.setPreco(2.987);
			pto.setQuantidade(100);
			listaDeProdutos.add(pto);
		}

	}

	// Select All
	public List<ProdutoTO> select(){
		return listaDeProdutos;
	}

	// Select By ID
	public ProdutoTO select(int id){
		for(int i = 0; i< listaDeProdutos.size(); i++) {
			if(listaDeProdutos.get(i).getCodigo() == id) {
				return listaDeProdutos.get(i);
			}
		}
		return null;
	}
	
	//
	public boolean insert(ProdutoTO pto) {
		pto.setCodigo(listaDeProdutos.size() + 1);
		return listaDeProdutos.add(pto);
	}
	
	public void update(ProdutoTO pto) {
		ProdutoTO p = select(pto.getCodigo());
		p.setPreco(pto.getPreco());
		p.setQuantidade(pto.getQuantidade());
		p.setTitulo(pto.getTitulo());
	}
	
	public void delete(int id) {
		listaDeProdutos.remove(select(id));
	}
}

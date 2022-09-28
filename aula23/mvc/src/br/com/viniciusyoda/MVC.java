package br.com.viniciusyoda;

import br.com.viniciusyoda.model.bo.OrdenacaoBO;
import br.com.viniciusyoda.model.vo.Ordenacao;

public class MVC {
	public static void main(String[] args) {
		Ordenacao ordenacao = new OrdenacaoBO().bubbleSort(532135);
		System.out.println(ordenacao);
	}
}

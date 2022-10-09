package br.com.fernandoalmeida;

import br.com.fernandoalmeida.model.bo.OrdenacaoBO;
import br.com.fernandoalmeida.model.vo.Ordenacao;

public class MVC {
	public static void main(String[] args) {
		Ordenacao ordenacao = new OrdenacaoBO().bubbleSort(532135);
		System.out.println(ordenacao);
	}
}

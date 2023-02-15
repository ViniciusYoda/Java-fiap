package br.com.viniciusyoda.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import br.com.viniciusyoda.model.vo.Ordenacao;

/**
 * 
 * @author Vinícius Yoda
 * @see Classe que executa as operações de IO (Entrada e Saida)
 * do sistema com relação aos dados resultantes da ordenação
 */

public class OrdenacaoDAO {
	/**
	 * Método que salva em um arquivo de texto os dados do objeto 
	 * de ordenação
	 * @param Ordenação ordenacao
	 * @throws FileNotFoundException
	 */
	public void salvar(Ordenacao ordenacao) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("ordenacao.txt");
		pw.print(ordenacao);
		pw.flush();
		pw.close();
	}

}

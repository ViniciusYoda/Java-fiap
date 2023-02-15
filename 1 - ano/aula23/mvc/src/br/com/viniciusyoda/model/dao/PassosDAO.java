package br.com.viniciusyoda.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import br.com.viniciusyoda.model.vo.Passos;

/**
 * 
 * @author Vinícius Yoda
 * @see Classe que executa as operações IO (entrada e saída)
 * do sistema com relação aos dados resultante do passo a passo
 */

public class PassosDAO {

	/**
	 * Método que recebe os passos (lista) e salta todos os passos
	 * em um arquivo
	 * @param passos
	 * @throws FileNotFoundException
	 */
	
	public void salvarPassos(List<Passos> passos) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("passos.txt");
		//percorre a lista passos
		for(Passos p : passos) {
			pw.print(p);
		}
		pw.flush();
		pw.close();
	}
}

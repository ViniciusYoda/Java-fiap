package br.com.fernandoalmeida.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import br.com.fernandoalmeida.model.vo.Passos;

/**
 * @author Fernando Almeida
 * @see Classe que executa as operações de IO (entrada e saída)
 * do sistema com relação aos dados resultantes do passo a passo
 * 
 */

public class PassosDAO {
	
	/**
	 * Método que recebe os passos (lista) e salta todos os passos
	 * em um arquivo
	 * @param passos
	 * @throws FileNotFoundException
	 */
	
	public void salvarPassos(List<Passos> passos) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("passos.txt");
		//percorre a lista passos
		for (Passos p : passos) {
			pw.print(p);
		}
		
		pw.flush();
		pw.close();
	}
	
	
	
	
	
	
	
	

}

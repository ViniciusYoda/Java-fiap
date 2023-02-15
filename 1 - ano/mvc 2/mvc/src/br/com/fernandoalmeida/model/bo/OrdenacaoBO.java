package br.com.fernandoalmeida.model.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fernandoalmeida.model.dao.OrdenacaoDAO;
import br.com.fernandoalmeida.model.dao.PassosDAO;
import br.com.fernandoalmeida.model.vo.Ordenacao;
import br.com.fernandoalmeida.model.vo.Passos;

/**
 * 
 * @author Fernando Almeida
 * @see Classe que contem o método de ordenação (bubble sort)
 *
 */

public class OrdenacaoBO {

	/**
	 * Método responsável em realizar a ordenação através do algoritmo Bubble Sort
	 * @param int numero
	 * @return Ordenacao
	 *
	 */
	
	public Ordenacao bubbleSort(int numero) {
		
		try {
			
			/**
			 * Transformar o número em String para realizar as trocas 
			 * considerando caracter por caracter.
			 *  * Gerando um Array de char pra facilitar a manipulação dos dados
			 */
			char[] digitos = String.valueOf(numero).toCharArray();
			
			// variável auxiliar para armazenar o número antes de realizar a troca
			char aux;
			
			char[] antes;
			
			int qtdeTrocas = 0;
			
			//Vetor (lista) que irá conter todo o processo de ordenação
			List<Passos> passos = new ArrayList<Passos>();
			
			//Variável de controle que determina se houve troca. SErá utilizada
			// para interromper o processo quando não houver números a serem ordenados
			boolean continua = true;
			
			//Percorrer o vetor de acordo com o tamanho dele
			for(int i = 0; i < digitos.length; i++) {
				//verificando se foram feitas trocas no último ciclo... caso contrário, 
				//indica que o vetor já está ordenado
				if(!continua) {
					break; //interromper o algoritmo
				}
				
				//descrever o processo (passo)
				passos.add(new Passos(null, null, "Inicio da verificação do número"
						.concat(String.valueOf(i)).concat("\n--------------------\n")));
				
				continua = false;
				
				//Percorrer vetor, verificando o próximo elemento
				for(int j = 0; j < digitos.length - 1; j++) {
					if(digitos[j] > digitos[j+1]) {
						//o sendo o número maior que o próximo, troca!
						antes = new String(digitos).toCharArray();
						aux = digitos[j];
						digitos[j] = digitos[j+1];
						digitos[j+1] = aux;
						
						//incrementa a qtde de trocas
						qtdeTrocas++;
						
						passos.add(new Passos(new String(antes), new String(digitos), "Trocou-se o digito"
								.concat(String.valueOf(digitos[j+1]))
								.concat(" pelo ".concat(String.valueOf(digitos[j])))));
						
						continua = true;
						
					}else {
						passos.add(new Passos(new String(digitos), new String(digitos), "Não houve troca pois o numero "
								.concat(String.valueOf(digitos[j+1]))
								.concat(" já é menor ou igual que ")
								.concat(String.valueOf(digitos[j]))));
					}
				}
			}
			
			//Persiste os resultados no arquivo
			Ordenacao ordenacao = new Ordenacao(numero, new String(digitos), qtdeTrocas);
			new OrdenacaoDAO().salvar(ordenacao); 
			new PassosDAO().salvarPassos(passos);
			
			//retorna um objeto da classe Ordenação informando os resultados
			return ordenacao;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

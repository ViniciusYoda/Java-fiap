package br.com.viniciusyoda.model.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.viniciusyoda.model.vo.Ordenacao;
import br.com.viniciusyoda.model.vo.Passos;

/**
 * 
 * @author Vinícius Yoda
 * @see Classe que contém o método de ordenação (Bubble Sort)
 *
 */

public class OrdenacaoBO {
	
	public Ordenacao bubbleSort(int numero) {
		try {
			/**
			 * Transformar o número em String para realizar
			 * as trocas considerando caracter por caracter
			 * 
			 * Gerar um array de char para facilitar a manipulação dos dados
			 */
			
			char[] digitos = String.valueOf(numero).toCharArray();
			char aux;
			String antes;
			int qtdeTrocas = 0;
			
			//Vetor (lista) que contém todo o processo de ordenação
			List<Passos> passos = new ArrayList<Passos>();
			
			//variável de controle que determina se houve troca;
			//interrope o processo quando não houver troca
			boolean continua = true;
			
			for(int i = 0;i<digitos.length;i++) {
				//verifica se foram  realizadas troca
				if(!continua) {
					break; //interrompe a repetição
				}
				
				//descrevendo o processo de ordenação passo a passo
				passos.add(new Passos(null, null, "Inicio da verificação..."
						.concat(String.valueOf("\n---------------------\n"))));
				
				continua = false;
				
				//percorre o vetor, verificando o próximo elemento
				for(int j = 0; j < digitos.length - 1; j++) {
					if(digitos[j] > digitos[j+1]) {
						antes = new String(digitos.toCharArray());
						aux = digitos[j];
						digitos[j] = digitos[j+1];
						digitos[j+1] = aux;
						
						qtdeTrocas++;
						
						passos.add(new Passos(new String(antes), new String(digitos), "Trocou-se o digito"
								.concat((String.valueOf(digitos[j+1]))
								.concat(String.valueOf(digitos[j])))));
						
						continua = true;
					}else {
						passos.add(new Passos(new String(digitos), new String(digitos), "Não houve troca, pois o número"
								.concat((String.valueOf(digitos[j+1]))
								.concat(" é menor ou igual que")
								.concat(String.valueOf(digitos[j])))));
					}
				}
			}
		}catch() {
			
		}
	}
	
}

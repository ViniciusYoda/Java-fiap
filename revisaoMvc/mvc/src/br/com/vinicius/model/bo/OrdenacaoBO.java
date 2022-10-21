package br.com.vinicius.model.bo;

import br.com.vinicius.model.dao.OrdenacaoDAO;
import br.com.vinicius.model.dao.PassosDAO;
import br.com.vinicius.model.vo.Ordenacao;
import br.com.vinicius.model.vo.Passos;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vinícius Yoda
 * @see Classe que contem o(s) de ordenação e eh capaz de proecessa-los
 */
public class OrdenacaoBO {

    /**
     * Método responsavel em fazer a ordenação pelo algorito BubbleSort (metodo bolha)
     * @param Int numero
     * @return Ordenacao
     */
    public Ordenacao bubbleSort(int numero) {
        try {
            //Transforma em String para fazer as trocas considerando caracter por caracter
            //Converto o numero do tipo Int para String e depois gero um array de chars.
            char[] digitos = String.valueOf(numero).toCharArray();
            //Nosso 'balde' intermediario entre as trocas, variavel auxiliar.
            char aux;
            //Outra auxiliar que serve para armazenar o numero antes da modifacação apra
            //se criar o 'Passo'
            char[] antes;
            //Variavel que sera incrementada a cada troca para contar quantas trocas houve
            int qtdeTrocas = 0;
            //Vetor de passos para descrever todo o processo
            List<passos> passos = new ArrayList<passos>();
            //Variavel que marca determina se houve trocacs, usada para
            //interromper o processo quando ja não houver mais numeros a serem
            //ordenados
            boolean continua=true;

            //Sera percorrido todos os numeros de acordo com o tamanho da seequencia
            for (int i = 0; i < digitos.length; i++) {
                if (!continua){ //Verificando se foram feitas trocas no ultimo ciclo, se não foram, indica que ja está ordenado
                    break;
                }
                //Descrevendo o passo
                passos.add(new Passos(null, null, "Inicio da verifacacao numero".concat(String.valueOf(i)).concat("\n-------")));
                continua=false;
                //Percorrendo cada numero com o seu proximo
                for (int j = 0; j < digitos.length - 1; j++) {
                    if(digitos[j] > digitos[j + 1]) {
                        //Esse numero eh maior que o proximo, troca!
                        antes = new String(digitos).toCharArray();
                        aux = digitos[j];
                        digitos[j] = digitos[j + 1];
                        digitos[j + 1] = aux;
                        //Incrementando a quantidade de trocas
                        qtdeTrocas++;
                        //Descrevendo o passo
                        passos.add(new Passos(new String(antes), new String(digitos), "Trocou-se o digito ".concat(String.valueOf(digitos[j+1])).concat(" pelo ").concat(String.valueOf(digitos[j]))));
                        continua=true;
                    } else {
                        passos.add(new Passos(new String(digitos), new String(digitos), "Nao houve troca pois o numero ".concat(String.valueOf(digitos[j])).concat(" ja eh menor/igual que ").concat(String.valueOf(digitos[j + 1]))));
                    }
                }
            }
            
            //Persiste os resultados
            Ordenacao ordenacao = new Ordenacao(numero, new String(digitos), qtdeTrocas);
            new OrdenacaoDAO().salvar(ordenacao);
            new PassosDAO().salvarPassos(passos);
            //Retorno um objeto da classe Ordenacao informando os resultados.
            return ordenacao;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
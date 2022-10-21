package br.com.vinicius;

import br.com.vinicius.model.bo.OrdenacaoBO;
import br.com.vinicius.model.vo.Ordenacao;

/**
 * 
 * @author Vinícius Yoda
 */
public class MVC {
    
    public static void main(String[] args) {
        Ordenacao ordenacao = new OrdenacaoBO().bubbleSort(532135);
        System.out.println(ordenacao); //Invoco o toString() da classe Ordenacao
    }
}

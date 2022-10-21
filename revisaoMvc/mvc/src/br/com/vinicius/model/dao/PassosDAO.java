package br.com.vinicius.model.dao;

import br.com.vinicius.model.vo.Passos;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author Vinícius Yoda
 * @see Classe que executa as operações de IO (entrada e saída) do sistema com relação
 * aos dados resultantes do passo a passo
 */
public class PassosDAO {
    /**
     * Método que recebe todos os passos (lista) e salva todos em um arquivo
     * @param passos
     * @ythrows FileNotFoundException
     */
    public void salvarPassos(List<passos> passos) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("passos.txt");
        for (Passos p : passos){
            pw.print(p);        
        }
        pw.flush();
        pw.close();
    }
}

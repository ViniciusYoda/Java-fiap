package br.com.vinicius.model.dao;

import br.com.vinicius.model.vo.Ordenacao;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Vinícius Yoda
 * @see Classe que executa as operações de IO (entrada e saída) do sistema com relação 
 * aos dados resultantes da ordenação
 */
public class OrdenacaoDAO {
    /**
     * Método que salva em um arquivo de texto os dados do objeto de ordenação 
     * @param Ordenacao ordenacao
     * @throws FileNotFoundException
     */
    public void salvar(Ordenacao ordenacao) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("ordenacao.txt");
        pw.print(ordenacao);
        pw.flush();
        pw.close();
    }
}

package br.com.fernandoalmeida.model.dao;


import br.com.fernandoalmeida.model.vo.Ordenacao;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Fernando Almeida
 * @see Classe que executa as operacoes de IO (entrada e saida) do sistema com relacao
 * aos dados resultantes da ordenacao
 */
public class OrdenacaoDAO {
    
    /**
     * Metodo que salva em um arquivo de texto os dados do objeto de ordenacao
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
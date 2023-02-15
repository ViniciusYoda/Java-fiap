package br.com.vinicius.model.vo;

/**
 * @author Vinícius Yoda
 * @see Classe que cria objeto capaz de armazenar os dados relativo ao processo
 * de ordenação
 */
public class Ordenacao {

    private int numeroOriginal;
    private String numeroOrdenado;
    private int qtdeTrocas;

    /**
     * Construtor padrão que insere em todos os atributos do objeto
     * @param numeroOriginal
     * @param numeroOrdenado;
     * @param qtdeTrocas;
     */
    public Ordenacao(int numeroOriginal, String numeroOrdenado, int qtdeTrocas) {
        this.numeroOriginal = numeroOriginal;
        this.numeroOrdenado = numeroOrdenado;
        this.qtdeTrocas = qtdeTrocas;
    }

    //GET and Set
    public String getNumeroOrdenado() {
        return numeroOrdenado;
    }

    public void setNumeroOrdenado(String numeroOrdenado) {
        this.numeroOrdenado = numeroOrdenado;
    }

    public int getNumeroOriginal() {
        return numeroOriginal;
    }

    public void setNumeroOriginal(int numeroOriginal) {
        this.numeroOriginal = numeroOriginal;
    }

    public int getQtdeTrocas() {
        return qtdeTrocas;
    }

    public void setQtdeTrocas(int qtdeTrocas) {
        this.qtdeTrocas = qtdeTrocas;
    }

    //Sobrescrevendo o toString do objeto
    @Override
    public String toString() {
        return String.valueOf(this.numeroOriginal).concat(" virou:\n").concat(String.valueOf(this.numeroOrdenado)).concat("\nQtde de trocas: ").concat(String.valueOf(this.qtdeTrocas));
    }
    
}
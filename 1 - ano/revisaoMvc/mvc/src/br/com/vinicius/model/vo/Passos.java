package br.com.vinicius.model.vo;

/**
 * 
 * @author Vinícius Yoda
 * @see Classe que armazena os dados relativo a cada passo da ordenacao
 */
public class Passos {
    
    private String numeroAnterior;
    private String numeroResultante;
    private String descricao;

    /**
     * Construtor que preenche todos os atributos do objeto
     * @param numeroAnterior
     * @param numeroResultante;
     * @param descricao
     */
    public Passos(String numeroAnterior, String numeroResultante, String descricao) {
        this.numeroAnterior = numeroAnterior;
        this.numeroResultante = numeroResultante;
        this.descricao = descricao;
    }

    //GET and Set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumeroAnterior() {
        return numeroAnterior;
    }

    public void setNumeroAnterior(String numeroAnterior) {
        this.numeroAnterior = numeroAnterior;
    }

    public String getNumeroResultante() {
        return numeroResultante;
    }
    
    public void setNumeroResultante(String numeroResultante) {
        this.numeroResultante = numeroResultante;
    }

    //Sobrescrevendo o toString do objeto
    @Override
    public String toString() {
        if (this.getNumeroAnterior() == null) {
            return "\nDescrição:".concat(this.descicao);
        } else {
            return this.getNumeroAnterior().concat(" >> ").concat(this.getNumeroResultante()).concat("\nDescricação: ").concat(this.descricao).concat("\n\n");
        }
    }
}
package br.com.viniciusyoda.model.vo;

/**
 * 
 * @author Vinicius
 * @see Classe que armazena os dados relativos a cada passo
 * da ordenação
 */

public class Passos {
	
	//atributos da classe
	private String numeroAnterior;
	private String numeroResultante;
	private String descricao;
	
	/**
	 * Construtor que preenche todos os atributos do objeto
	 * @param numeroAnterior
	 * @param numeroResultante
	 * @param descrição
	 */
	public Passos(String na, String nr, String d) {
		this.numeroAnterior = na;
		this.numeroResultante = nr;
		this.descricao = d;
	}

	/**
	 * @return the numeroAnterior
	 */
	public String getNumeroAnterior() {
		return numeroAnterior;
	}

	/**
	 * @param numeroAnterior the numeroAnterior to set
	 */
	public void setNumeroAnterior(String numeroAnterior) {
		this.numeroAnterior = numeroAnterior;
	}

	/**
	 * @return the numeroResultante
	 */
	public String getNumeroResultante() {
		return numeroResultante;
	}

	/**
	 * @param numeroResultante the numeroResultante to set
	 */
	public void setNumeroResultante(String numeroResultante) {
		this.numeroResultante = numeroResultante;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//sobrescrevendo o toString de Object
	@Override
	public String toString() {
		if(this.getNumeroAnterior() == null) {
			return "\nDescrição: "
		}
	}
	
}

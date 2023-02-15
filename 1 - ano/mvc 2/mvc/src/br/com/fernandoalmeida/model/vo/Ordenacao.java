package br.com.fernandoalmeida.model.vo;

/**
 * 
 * @author Fernando Almeida
 * @see Classe cria objeto capaz de armazenar os dados
 * relativos ao processo de ordenação
 *
 */

public class Ordenacao{
	
	//atributos
	private int numeroOriginal;
	private String numeroOrdenado;
	private int qtdeTrocas;
	
	/**
	 * Construtor padrão que inicializa os atributos
	 * @param numeroOriginal
	 * @param numeroOrdenado
	 * @param qtdeTrocas
	 */
	
	public Ordenacao(int numeroOriginal, String numeroOrdenado, int qtdeTrocas ) {
		this.numeroOriginal = numeroOriginal;
		this.numeroOrdenado = numeroOrdenado;
		this.qtdeTrocas = qtdeTrocas;
	}

	/**
	 * @return the numeroOriginal
	 */
	public int getNumeroOriginal() {
		return numeroOriginal;
	}

	/**
	 * @param numeroOriginal the numeroOriginal to set
	 */
	public void setNumeroOriginal(int numeroOriginal) {
		this.numeroOriginal = numeroOriginal;
	}

	/**
	 * @return the numeroOrdenado
	 */
	public String getNumeroOrdenado() {
		return numeroOrdenado;
	}

	/**
	 * @param numeroOrdenado the numeroOrdenado to set
	 */
	public void setNumeroOrdenado(String numeroOrdenado) {
		this.numeroOrdenado = numeroOrdenado;
	}

	/**
	 * @return the qtdeTrocas
	 */
	public int getQtdeTrocas() {
		return qtdeTrocas;
	}

	/**
	 * @param qtdeTrocas the qtdeTrocas to set
	 */
	public void setQtdeTrocas(int qtdeTrocas) {
		this.qtdeTrocas = qtdeTrocas;
	}
	
	//Sobrecrevendo o método toString do objeto
	@Override
	public String toString() {
		return String.valueOf(this.getNumeroOriginal())
				.concat(" virou: \n")
				.concat(String.valueOf(this.getNumeroOrdenado()))
				.concat("\n Qtde de trocas: ")
				.concat(String.valueOf(this.getQtdeTrocas()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
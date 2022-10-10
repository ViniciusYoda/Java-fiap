package br.com.viniciusyoda.model.vo;

public class Score {

	private String jogador;
	private int pontos;
	
	public void GerenciadorScores(String jogador, int pontos) {
		this.jogador = jogador;
		this.pontos = pontos;
	}

	/**
	 * @return the jogador
	 */
	public String getJogador() {
		return jogador;
	}

	/**
	 * @param jogador the jogador to set
	 */
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	/**
	 * @return the pontos
	 */
	public int getPontos() {
		return pontos;
	}

	/**
	 * @param pontos the pontos to set
	 */
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
}

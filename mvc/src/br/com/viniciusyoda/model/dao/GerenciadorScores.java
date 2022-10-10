package br.com.viniciusyoda.model.dao;

import java.util.List;

import br.com.viniciusyoda.model.vo.Score;

public interface GerenciadorScores {

	public void adicionar(Score score);
	public List<Score> consultar();
}

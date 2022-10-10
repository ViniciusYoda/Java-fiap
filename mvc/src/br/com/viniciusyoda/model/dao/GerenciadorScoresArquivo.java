package br.com.viniciusyoda.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.viniciusyoda.model.vo.Score;

public class GerenciadorScoresArquivo implements GerenciadorScores{
	
	

	List<Score> scores = new ArrayList<>();
	
	@Override
	public void adicionar(Score score) {
		scores.add(score);
		
	}
	
	public void gravar() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("Score.txt");
		pw.print(scores);
		pw.flush();
		pw.close();
		
	}

	@Override
	public List<Score> consultar() {
		return scores;
	}
	
	public void ler() {
		
	}

	
}

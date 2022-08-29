package cpArray;

public class Aluno {
	/**
	 * Fazer um programa que lê o nome e a nota de cada aluno de uma sala de aula. O programa deve calcular e imprimir a média da sala e os nomes dos alunos que tiveram notas acima da média. Sugestão: utilizar um vetor para os nomes e outro para as notas.  
	 */
	private String nome;
	private int nota;
	
	public Aluno(String aluno, int valor) {
		this.nome = aluno;
		this.nota = valor;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "estudo [nome=" + nome + ", nota=" + nota + ", getNome()=" + getNome() + ", getNota()=" + getNota()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}

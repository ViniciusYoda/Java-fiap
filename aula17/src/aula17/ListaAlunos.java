package aula17;

public class ListaAlunos {
	private Aluno[] alunos = null;  // array de objetos
	private int i = 0; // variavel de controle do indice do array
	 
	// metodo construtor
	public ListaAlunos(int qtde){
		// instaciando o array alunos
		alunos = new Aluno[qtde];
	}
	
	// insere um aluno na lista "alunos"
	public void insereAluno(Aluno a) {
		if (i < alunos.length){
			alunos[i] = a;
			i++;
		}else {
			System.out.println("Lista cheia");
		}	
	}
	
	public void imprimeLista(){
		for(int i = 0; i < alunos.length; i++){
			System.out.println(alunos[i]);
		}
	}
}

package aula17;

public class ListaAlunosTeste {
	public static void main(String[] args) {
		// cria a lista de aluno "lista"
		ListaAlunos lista = new ListaAlunos(5);

		// Criando objetos do aluno
		Aluno a1 = new Aluno(1, "Jacob");
		Aluno a2 = new Aluno(2, "Marina");
		Aluno a3 = new Aluno(3, "Carlinhos");

		// inserido os alunos na lista
		lista.insereAluno(a1);
		lista.insereAluno(a2);
		lista.insereAluno(a3);
		
		// imprimindo os elementos da lista
		lista.imprimeLista();
	}

}

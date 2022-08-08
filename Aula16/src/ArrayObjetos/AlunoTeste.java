package ArrayObjetos;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno alunos = new Aluno[t];
		
		alunos[0] = new Aluno(1, "Vinícius");
		alunos[1] = new Aluno(2, "Arvelan");
		alunos[2] = new Aluno(3, "Raphael");
		
		alunos[0].imprimirDados();
		alunos[1].imprimirDados();
		alunos[2].imprimirDados();
		
	}
}

package estudoParaCp;

public class Teste {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		aluno.setCpf("312");
		aluno.setCurso("Ingl�s");
		aluno.setEndereco("Avenida Paulista");
		aluno.setNotas(5, 7);
		
		System.out.println("A aluna: " + aluno.getNome() + " mudou o cpf para: " + aluno.getCpf() + " , " + aluno.getNome() + " tamb�m mudou o curso para: " + aluno.getCurso() + " no endere�o: " + aluno.getEndereco() + " com as notas: " + aluno.getNotas());
		
		
	}
}

package estudoParaCp;

public class Teste {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		aluno.setCpf("312");
		aluno.setCurso("Inglês");
		aluno.setEndereco("Avenida Paulista");
		aluno.setNotas(5, 7);
		
		System.out.println("A aluna: " + aluno.getNome() + " mudou o cpf para: " + aluno.getCpf() + " , " + aluno.getNome() + " também mudou o curso para: " + aluno.getCurso() + " no endereço: " + aluno.getEndereco() + " com as notas: " + aluno.getNotas());
		
		
	}
}

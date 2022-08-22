package ddd;

public class ListaAlunosTeste {
    public static void main(String[] args) {

        //criando lista de alunos
        ListaAlunos lista = new ListaAlunos();

        //criando os objetos de Aluno(a1, a2)
        Aluno a1 = new Aluno(1, "Arvelan ");
        Aluno a2 = new Aluno(2, "Bianca ");
        Aluno a3 = new Aluno(3, "Carlos ");

        // adicionando aluno na lista
        lista.inserirAluno(a1);
        lista.inserirAluno(a2);
        lista.inserirAluno(a3);

        // imprimindo a lista
        lista.imprimirLista();
    }
}

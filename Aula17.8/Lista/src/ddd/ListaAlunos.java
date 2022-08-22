package ddd;

import java.util.ArrayList;

public class ListaAlunos {
    private ArrayList<Aluno> alunos;

    public ListaAlunos(){
        alunos = new ArrayList<Aluno>();
    }

    // inserindo um aluno na lista
    public void inserirAluno(Aluno a){
        alunos.add(a);
    }

    // percorrendo a lista de alunos
    public void imprimirLista(){
        for(Aluno a : alunos){
            System.out.println("Aluno: " + a.toString());
        }
    }
}

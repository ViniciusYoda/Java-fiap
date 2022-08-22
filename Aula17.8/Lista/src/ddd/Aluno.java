package ddd;

public class Aluno {
    //atributos da classe aluno
    private int matricula;
    private String nome;

    public Aluno(int m, String n) {
        matricula = m;
        nome = n;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "\n" + 
                "Nome: " + getNome();

    }

    
    
}

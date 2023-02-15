package Factory2;

public class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String n, String s) {
        this.nome = n;
        this.sexo = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}

package TesteCrud;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;

    public Cliente(String n, String sn) {
        this.nome = n;
        this.sobrenome = sn;
    }

    public Cliente(int id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    
}
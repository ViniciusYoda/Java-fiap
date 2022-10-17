package Factory2;

public class Homem extends Pessoa {

    public Homem(String n, String s){
        super(n, s);
        System.out.println("Olá senhor " + n);
    }
}

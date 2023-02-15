package Factory2;

public class Mulher extends Pessoa {


    public Mulher(String n, String s){
        super(n, s);
        System.out.println("Olá senhorita " + n);
    }
}

package Factory2;

public class PessoafactoryTeste {
    public static void main(String[] args) {
        PessoaFactory factory = new PessoaFactory();

        String nome = "Vinícius";
        String sexo = "M";

        System.out.println(factory.getPessoa(nome, sexo));
    }
}

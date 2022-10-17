package Factory2;

public class PessoaFactory {
    public Pessoa getPessoa(String nome, String sexo){
        if(sexo.equals("M")){
            return new Homem(nome, sexo);
        }else if (sexo.equals("F")){
            return new Mulher(nome, sexo);
        }
        return null;
    }
}
